package school.lesson4;

public class Park {
    protected String name;
    protected String workingHours;


    public Park(String name, String workingHours) {
        this.name = name;
        this.workingHours = workingHours;

    }

    public void info() {
        System.out.println(name + " Парк работает каждый день: " + workingHours + ". ");
        System.out.println();
    }


    public static class Ride {
        private String name;
        private int price;

        public Ride(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public void info() {
            System.out.println("Название аттракциона: " + name + ". " + "Стоимость: " + price + " бел.руб.");
        }
    }

}