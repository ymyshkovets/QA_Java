package school.lesson2;

public class TaskEight {
    public static void main(String[] args) {
        fillDiagonal();
    }

    // task 8

    public static void fillDiagonal() {
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, b = arr[i].length - 1; j < arr[i].length; j++, b--) {
                if (i == j || i == b) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}




