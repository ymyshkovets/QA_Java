package school.lesson4;

public class Payment {
    protected String cardNumber;
    protected String cardHolderName;
    protected String cardValidTo;

    public Payment(String cardNumber, String cardHolderName, String cardValidTo) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cardValidTo = cardValidTo;
    }

    public void info() {
        System.out.println("Номер карты: " + cardNumber);
        System.out.println("Владелец карты: " + cardHolderName);
        System.out.println("Срок действия карты: " + cardValidTo);

    }

    public class Item {
        private String name;
        private int price;
        private int amount;

        public Item(String name, int price, int amount) {
            this.name = name;
            this.price = price;
            this.amount = amount;
        }

        public void totalPrice() {
            int totalPrice = this.price * this.amount;
            System.out.println("Общая стоимость: " + totalPrice + " бел. руб.");
        }


        public final static int minAmount = 1;

        public void info() {
            if (this.amount < minAmount) {
                System.out.println("Количество купленного товара не может равняться 0.");
            } else {
                System.out.println("Название товара: " + name);
                System.out.println("Количество товара: " + amount);
                totalPrice();
                System.out.println();
            }
        }

    }
}