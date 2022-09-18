package school.lesson2;

public class TaskOne {

    public static void main(String[] args) {
        System.out.println(summ(15, 15));

    }

    // task 1
    public static boolean summ(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) return true;
        else return false;

    }


}


