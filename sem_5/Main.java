package sem_5;

import sem_5.controllers.UserController;
import sem_5.model.*;
import sem_5.utils.Validate;
import sem_5.views.ViewUser;


public class Main {
    
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationJSON("users.txt");
        Repository repository = new RepositoryFileJSON(fileOperation, new UserMapperJSON());
        Validate validate = new Validate();
        UserController controller = new UserController(repository,validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }

}
