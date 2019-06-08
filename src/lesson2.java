import Exception.*;

public class lesson2  {
    public static void main(String[] args) {
        String[][] correct = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] wrongSize = {
                {"1"},
                {"1", "2"},
                {"1", "2", "3"},
                {"1", "2", "3", "4"}
        };
        String[][] wrongChar = {
                {"1", "2", "a", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        try {
            try {
                int result = method(wrongChar);
                System.out.println(result);


            } catch (MyArraySizeException e) {

                System.out.println(e.getError());
            }
        }
        catch (MyArrayDataException e) {
            System.out.println(e.getStrError());
        }
        System.out.println("--------------------------");
        try {
            try {
                int result = method(correct);
                System.out.println(result);


            } catch (MyArraySizeException e) {

                System.out.println(e.getError());
            }
        }
        catch (MyArrayDataException e) {
            System.out.println(e.getStrError());
        }
        System.out.println("--------------------------");
        try {
            try {
                int result = method(wrongSize);
                System.out.println(result);


            } catch (MyArraySizeException e) {

                System.out.println(e.getError());
            }
        }
        catch (MyArrayDataException e) {
            System.out.println(e.getStrError());
        }

    }




    public static int method(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("Размер массива превышен!");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Размер массива превышен!");
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    count = count + Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

}



