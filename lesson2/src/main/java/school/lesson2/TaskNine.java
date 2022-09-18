package school.lesson2;

public class TaskNine {
    public static void main(String[] args) {
        arr(4, 5);

    }
    // task 9

    public static int[] arr(int len, int initialValue) {

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i]);
        }

        return arr;
    }
}
