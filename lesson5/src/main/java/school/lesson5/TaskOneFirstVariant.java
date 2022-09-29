package school.lesson5;

import java.util.Arrays;
import java.util.Collections;

public class TaskOneFirstVariant {

    public static void main(String[] args) {
        String[] arr = {"one", "two", "three", "four", "five"};
        Collections.swap(Arrays.asList(arr), 1, 2);
        System.out.println(Arrays.asList(arr));

    }
}
