package school.lesson2;

public class TaskEight {
    public static void main(String[] args) {
        fillDiagonal();
    }

    // task 8

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }

    }
}



