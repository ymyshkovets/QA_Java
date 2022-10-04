package school.lesson4;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        this.maxRun = 200;
        this.type = "Cat";
        countCats++;

    }

    @Override
    public void swim(int len) {
        System.out.println("Cats do not swim!");
    }

    public static int getCount() {
        return countCats;
    }
}