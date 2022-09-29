package school.lesson5;

public class TaskOneSecondVariant {

    public static void main(String[] args) {
        doChange();
        System.out.println();

    }

    public static void doChange() {
        String[] arr = {"one", "two", "three", "four", "five"};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "four") {
                arr[i] = "five";
            } else if (arr[i] == "five") {
                arr[i] = "four";
            }
            System.out.println(arr[i] + " ");
        }
    }
}
