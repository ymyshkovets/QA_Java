package school.lesson4;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        this.type = "Dog";
        this.maxRun = 500;
        this.maxSwim = 10;
        countDogs++;

    }

    public static int getCount() {
        return countDogs;
    }

}