package school.lesson4;

public class TaskCatPlate {

    public static void main(String[] args) {

        CatPlate[] totalCats = new CatPlate[5];
        totalCats[0] = new CatPlate("Boris", 10, false);
        totalCats[1] = new CatPlate("Carry", 35, false);
        totalCats[2] = new CatPlate("Max", 30, false);
        totalCats[3] = new CatPlate("Prinse", 45, false);
        totalCats[4] = new CatPlate("Gold", 40, false);


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


}


