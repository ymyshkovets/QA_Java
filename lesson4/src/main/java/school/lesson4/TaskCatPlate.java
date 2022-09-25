package school.lesson4;

public class TaskCatPlate {

    public static void main(String[] args) {

        Cat[] totalCats = new Cat[5];
        totalCats[0] = new Cat("Boris", 10, false);
        totalCats[1] = new Cat("Carry", 35, false);
        totalCats[2] = new Cat("Max", 30, false);
        totalCats[3] = new Cat("Prinse", 45, false);
        totalCats[4] = new Cat("Gold", 40, false);


        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < totalCats.length; i++) {
            if (totalCats[i].bellyful == false && totalCats[i].appetite < plate.food) {
                totalCats[i].eat(plate);
                totalCats[i].bellyful = true;
                System.out.println("Cat " + totalCats[i].name + " has eaten!");
            } else {
                System.out.println("Cat " + totalCats[i].name + " has not eaten!");
            }
        }
        plate.info();
        plate.increaseFood(50);
        plate.info();


    }


    public static class Cat {

        private String name;
        private int appetite;
        public boolean bellyful;

        public Cat(String name, int appetite, boolean b) {
            this.name = name;
            this.appetite = appetite;
            this.bellyful = bellyful;


        }

        public void eat(Plate p) {
            p.decreaseFood(appetite);
        }


    }

    public static class Plate {

        private int food;

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

}


