package sem_5.model;

public class RepositoryFileJSON extends RepositoryFile {
    
    private UserMapper mapper = new UserMapperJSON();
    private FileOperation fileOperation;

    public RepositoryFileJSON(FileOperation fileOperation) {
        super(fileOperation);
        this.fileOperation = fileOperation;
    }

    public RepositoryFileJSON(FileOperation fileOperation, UserMapper userMapper) {
        super(fileOperation, userMapper);
        this.fileOperation = fileOperation;
    }
    
}
