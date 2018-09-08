package Arrays;

public class MyArrayDataException extends Exception {
    private int i;
    private int j;
    String message;

    public <j> MyArrayDataException(String message, int i, int j) {
        this.message = message + " " + i + ", " + j;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
