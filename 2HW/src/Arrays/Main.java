package Arrays;

public class Main {
    public static void main(String[] args) {

        String[][] array = new String[][] {
                {"50", "7", "86"},
                {"3", "24", "17"},
                {"70", "9", "25"}
        };

        String[][] array1 = new String[][] {
                {"50", "7", "86", "59"},
                {"3", "24", "17", "85"},
                {"70", "9", "dfg", "23"},
                {"8", "26", "74", "5"}
        };

        String[][] array2 = new String[][] {
                {"50", "7", "86", "59"},
                {"3", "24", "17", "85"},
                {"70", "9", "85", "23"},
                {"8", "26", "74", "5"}
        };

        try {
            System.out.println(sumArray(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(sumArray(array1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(sumArray(array2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    private static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        boolean x = true;
        boolean y = true;

        if (array.length != 4) {
            x = false;
        }

        for (int i = 0; i < array.length; i ++) {
            if (array[i].length != 4) {
                y = false;
                break;
            }
        }

        if (!x || !y) {
            throw new MyArraySizeException("Нужен массив размером 4х4.");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].matches("-?\\d+(\\.\\d+)?")) {
                    throw new MyArrayDataException("Невозможно преобразовать ячейку в число, номер ячейки:", i, j);
                }
            }
        }



        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = sum + Integer.parseInt(array[i][j]);
            }
        }
        return sum;
    }


}
