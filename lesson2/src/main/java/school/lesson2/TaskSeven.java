package school.lesson2;

public class TaskSeven {
    public static void main(String[] args) {
        changeArray();

    }

    // task 7
    static int[] changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
                System.out.println(array[i]);
            }


        }
        return array;
    }


}
