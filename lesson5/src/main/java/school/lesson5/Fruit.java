package school.lesson5;

public class Fruit {
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