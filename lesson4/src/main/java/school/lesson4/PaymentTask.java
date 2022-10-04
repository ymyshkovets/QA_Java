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


}





