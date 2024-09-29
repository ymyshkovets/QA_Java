package school.lesson2;

public class TaskFourYear {
    public static void main(String[] args) {


        System.out.println(year(2000));
    }

    // task 4 *

    public static boolean year(int a) {
        return (((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) && a != 0);

    }

}
