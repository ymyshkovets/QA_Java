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


}


