package Arrays;

public class MyArraySizeException extends Exception {
    String message;

    public MyArraySizeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
