package school.lesson2;

public class TaskFive {
    public static void main(String[] args) {
        invertArray();
    }

    // task 5
    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }

    }


}
