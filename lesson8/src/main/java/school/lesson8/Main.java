package school.lesson8;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook1 = new PhoneBook();
        phoneBook1.add("+375299087650", "Сидоров");
        phoneBook1.add("+375299089650", "Петров");
        phoneBook1.add("+375299080650", "Сидоров");
        phoneBook1.add("+375299081650", "Вовочкин");
        phoneBook1.add("+375299084650", "Васильев");
        phoneBook1.get("Сидоров");
        phoneBook1.get("Петров");
        phoneBook1.get("Князев");
    }
}
