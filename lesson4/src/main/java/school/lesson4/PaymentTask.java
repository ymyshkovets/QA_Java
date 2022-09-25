package school.lesson4;

public class PaymentTask {

    public static void main(String[] args) {
        Payment yulia = new Payment("3698 5862 6244 3697", "MYSHKOVETS YULIA", "06.23");
        yulia.info();
        Payment.Item books = yulia.new Item("Стивен кинг", 3, 4);
        Payment.Item notebook = yulia.new Item("Общая тетрадь", 7, 0);
        books.info();
        notebook.info();
    }

    public static class Payment {
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
}





