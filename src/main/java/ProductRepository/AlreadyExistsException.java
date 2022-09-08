package ProductRepository;

public class AlreadyExistsException extends  RuntimeException {

    public AlreadyExistsException(String msg) {
        super(msg);
    }

    public static class NotFoundException extends RuntimeException {

        public NotFoundException (String msg) {
            super(msg);
        }
    }
}
