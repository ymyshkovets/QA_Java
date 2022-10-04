package school.lesson4;

public class TaskPark {

    public static void main(String[] args) {
        Park park = new Park("Диснейленд", "с 10:00 до 22:00");
        park.info();
        Park.Ride walz = new Park.Ride("Вальс", 10);
        walz.info();

    }


}
