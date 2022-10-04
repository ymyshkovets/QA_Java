package school.lesson5;

public class Orange extends Fruit {
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