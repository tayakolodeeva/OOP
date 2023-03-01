package sem_6;

import sem_6.NotesProject.controllers.*;
import sem_6.NotesProject.model.*;
import sem_6.NotesProject.views.*;

public class Main {

    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationJSON("notes.txt");
        Repository repository = new RepositoryJSON(new NotesMapperJSON(), fileOperation);
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote(controller);
        view.run();
    }
    
}
