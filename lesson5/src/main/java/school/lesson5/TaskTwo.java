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

    public static class Fruit {
        public float weight;

        public Fruit(float weight) {
            this.weight = weight;
        }

        public Fruit() {
        }

        public float getWeight() {
            return weight;
        }

        public void info() {
            System.out.println("Вес одного фрукта = " + getWeight() + "кг");
            System.out.println();
        }
    }

    public static class Apple extends Fruit {
        private String fruitType;

        public String getFruitType() {
            return fruitType;
        }

        public void setFruitType(String fruitType) {
            this.fruitType = fruitType;
        }

        public Apple(String fruitType) {
            this.fruitType = fruitType;
        }

        public float weight = 1.0f;

        @Override
        public void info() {
            System.out.println("Фрукт:" + getFruitType());
            super.info();
        }

        @Override
        public float getWeight() {
            return weight;
        }


    }

    public static class Orange extends Fruit {
        private String fruitType;

        public String getFruitType() {
            return fruitType;
        }

        public void setFruitType(String fruitType) {
            this.fruitType = fruitType;
        }

        public Orange(String fruitType) {
            this.fruitType = fruitType;
        }

        public float weight = 1.5f;

        public void info() {
            System.out.println("Фрукт:" + getFruitType());
            super.info();
        }

        public float getWeight() {
            return weight;
        }
    }

    public static class Box<T> {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        ArrayList<Fruit> list;

        public Box(String name) {
            this.name = name;
            this.list = new ArrayList<>();


        }

        float boxWeight = 0.0f;

        public float getWeight(Fruit f) {
            boxWeight = list.size() * f.getWeight();
            return boxWeight;
        }

        public float addFruit(Fruit f) {
            list.add(f);
            boxWeight = boxWeight + f.getWeight();
            return boxWeight;
        }

        public boolean compare(Box x) {
            if (boxWeight == x.boxWeight) {
                return true;
            } else {
                return false;
            }
        }

        public void change(Box<T> anotherBox) {
            this.list.addAll(anotherBox.list);
            this.boxWeight += anotherBox.boxWeight;
            anotherBox.list.clear();
            anotherBox.boxWeight = 0;
            System.out.println("Вес первой коробки: " + this.boxWeight);
            System.out.println("Вес второй коробки: " + anotherBox.boxWeight);
        }
    }
}

