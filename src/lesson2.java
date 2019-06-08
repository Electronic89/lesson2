public class lesson2 {
    public static void main(String[] args) {
        String[][] correct = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] wrongSize = {
                {"1", "2", "3", "4"},
                {"1", "2"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] wrongChar = {
                {"1", "2", "3", "4"},
                {"1", "2", "a", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        try {
            try {
                int result = method(correct);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }


    public static int method(String[][] correct) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (correct.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < correct[i].length; j++) {
                try {
                    count = count + Integer.parseInt(correct[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }

}



