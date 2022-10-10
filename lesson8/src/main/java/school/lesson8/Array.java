package school.lesson8;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        List<String> color = Arrays.asList(
                "Blue", "Red", "Black", "Green", "Blue",
                "Yellow", "Green", "Orange", "Blue", "Grey", "Pink", "Black", "Brown", "White", "Red"
        );

        Set<String> unique = new HashSet<String>(color);

        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Cколько раз встречается каждое слово");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(color, key));
        }

    }
}