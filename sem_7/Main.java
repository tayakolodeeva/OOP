package sem_7;

import sem_7.controllers.AdapterController;
import sem_7.controllers.IController;
import sem_7.controllers.NoteController;
import sem_7.loggers.ILogger;
import sem_7.loggers.Logger;
import sem_7.model.*;
import sem_7.views.*;

public class Main {

    public static void main(String[] args) {
        ILogger logger = new Logger("log.txt");
        IFileOperation fileOperation = new FileOperation("notes.txt");
        IRepository repository = new Repository(new NotesMapperJSON(), fileOperation);
        IController controller = new AdapterController(repository);
        IViewOperations viewOperations = new ViewOperations(controller);
        IViewOperations viewOperationsWithLog = new ViewOperationWithLog(viewOperations, logger);
        IViewNote view = new ViewNote(viewOperationsWithLog);
        view.run();
    }
    
}
