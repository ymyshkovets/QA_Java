package school.lesson4;

public class Plate {

    protected int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void increaseFood(int amountToAdd) {
        food += amountToAdd;
    }

    public void info() {
        System.out.println("Food amount: " + food);
    }


}