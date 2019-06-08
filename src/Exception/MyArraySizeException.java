package Exception;

public class MyArraySizeException extends Exception {
    private String error;

    public MyArraySizeException(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
