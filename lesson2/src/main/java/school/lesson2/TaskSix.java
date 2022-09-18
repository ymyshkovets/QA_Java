package school.lesson2;

public class TaskSix {
    public static void main(String[] args) {
        fillArray();

    }

    // task 6

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = +i;
            System.out.println(arr[i]);
        }
    }

}
