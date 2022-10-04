package school.lesson5;

import java.util.ArrayList;

public class Box<T> {
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