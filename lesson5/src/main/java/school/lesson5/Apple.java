package school.lesson5;

public class Apple extends Fruit {
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