package school.lesson7;


public class MainApp {
    private static final String fileName = "Data.csv";
    private static final String splitBY = ";";


    public static void main(String[] args) {
        String[] testHeader = {"Value 1", "Value 2", "Value 3", "Value 4"};
        int[][] testData = {
                {100, 200, 200, 600},
                {100, 200, 200, 600},
                {300, 400, 600, 800}
        };
        AppData appDataNew = new AppData(testHeader, testData);
        appDataNew.print();
        appDataNew.saveData();
        appDataNew.getData(fileName, splitBY);
        appDataNew.print();
    }
}