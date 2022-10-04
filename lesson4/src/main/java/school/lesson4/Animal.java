package school.lesson4;

public class Animal {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    static int countCats;
    static int countDogs;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int len) {
        if (this.maxRun >= len) System.out.println(this.type + " " + this.name + " runs " + len + " m.");
        else System.out.println(this.type + " " + this.name + " can't run so long distance.");
    }

    public void swim(int len) {
        if (this.maxSwim >= len) System.out.println(this.type + " " + this.name + " swims " + len + " m.");
        else System.out.println(this.type + " " + this.name + " can't swim so long distance.");
    }


    public static int getCount() {
        return countCats + countDogs;
    }

}