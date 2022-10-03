package school.lesson6;

public class MainApp {

    public static void main(String[] args) {
        MainApp main = new MainApp();
        String[][] arr = {
                {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        try {
            main.stringSizeExceptionTest(arr);
        } catch (MyArraySizeException e) {
            System.out.println("MyArraySizeException: неверный размер массива.");


        }
        try {
            main.stringDataExceptionTest(arr);

        } catch (MyArrayDataException e) {
            System.out.println("MyArrayDataException: неправильное значение в массиве!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
    }

    public void stringSizeExceptionTest(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) throw new MyArraySizeException("Неверное количество строк");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException(String.format("Неверное количество столбцов в %d-й" +
                    " строке", i));
            System.out.println();
        }
    }


    class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    public int stringDataExceptionTest(String[][] arr) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                {
                    try {
                        sum = sum + Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);

                    }
                }
            }


        }
        System.out.println("Сумма всех элементов массива = " + sum);
        return sum;
    }

    class MyArrayDataException extends Exception {
        public int i;
        public int j;

        public MyArrayDataException(int i, int j) {

            this.i = i;
            this.j = j;
        }
    }
}
