package Exception;

public class MyArrayDataException  extends Exception{
    private String strError;

    public MyArrayDataException(int i, int j) {
        strError = "Элемент из массива № [" + i + "][" + j + "] преобразовать не удалось !";
    }

    public String getStrError() {
        return strError;
    }

}

