package school.lesson4;

public class TaskCatDog {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Plusha");
        Cat cat2 = new Cat("Klubok");
        Cat cat3 = new Cat("Pushok");

        Dog dog1 = new Dog("Baks");
        Dog dog2 = new Dog("Sharik");
        Dog dog3 = new Dog("Barbos");

        cat1.run(400);
        cat2.run(200);
        cat3.swim(10);

        dog1.run(600);
        dog2.run(500);
        dog3.swim(400);

        System.out.println("Количество котов: " + Cat.getCount());
        System.out.println("Количество собак: " + Dog.getCount());
        System.out.println("Всего животных: " + Animal.getCount());

    }


    public static class Animal {
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

    public static class Cat extends Animal {
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


    public static class Dog extends Animal {
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
}


