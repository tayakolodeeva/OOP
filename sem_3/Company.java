package sem_3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class Company implements Iterable<User>{
    private User user;

    public Company(User user) {
        this.user = user;
    }

    private List<User> getSubUsersWide(User user) {
        List<User> users = new ArrayList<>();
        Queue<User> usersQueue = new ArrayDeque<>() {
        };
        usersQueue.offer(user);
        while (usersQueue.size() > 0) {
            User userItem = usersQueue.poll();
            users.add(userItem);
            for (User subUser: userItem.getPersonal()) {
                usersQueue.offer(subUser);
            }
        }
        return users;
    }

    @Override
    public Iterator<User> iterator() {
        List<User> users = getSubUsersWide(user);
        return users.iterator();
    }
    
}
