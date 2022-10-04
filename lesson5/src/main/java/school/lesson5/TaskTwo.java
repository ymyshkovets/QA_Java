package school.lesson5;

import java.util.ArrayList;


public class TaskTwo {

    public static void main(String[] args) {


        Apple apple1 = new Apple("яблоко");
        ArrayList<Apple> appleList = new ArrayList<>();
        apple1.info();


        Orange orange1 = new Orange("апельсин");
        ArrayList<Orange> orangeList = new ArrayList<>();
        orange1.info();

        Box<Apple> boxApple = new <Apple>Box("коробка с яблоками");
        System.out.println("Вес коробки с яблоками стал: " + boxApple.addFruit(apple1));


        Box<Orange> boxOrange = new <Orange>Box("коробка с апельсинами");
        System.out.println("Вес коробки с апельсинами стал: " + boxOrange.addFruit(orange1));

        System.out.println(boxApple.compare(boxOrange));

        Box<Apple> boxApple2 = new <Apple>Box("коробка с яблоками №2");
        boxApple.addFruit(apple1);
        boxApple.addFruit(apple1);
        boxApple.addFruit(apple1);
        boxApple.change(boxApple2);

    }


}

