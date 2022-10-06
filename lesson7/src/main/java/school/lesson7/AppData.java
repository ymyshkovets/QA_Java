package school.lesson7;

import java.io.*;
import java.util.ArrayList;

public class AppData {
    private String[] header;
    private int[][] data;
    private String fileName = "Data.csv";
    private String splitBy = ";";

    public AppData(String[] newHeader, int[][] newData) {
        this.header = newHeader;
        this.data = newData;
    }

    public void getData(String fileName, String splitBy) {
        this.fileName = fileName;
        this.splitBy = splitBy;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            header = br.readLine().split(splitBy);
            String line;
            ArrayList<String> lines = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            data = new int[lines.size()][header.length];
            for (int i = 0; i < lines.size(); i++) {
                data[i] = stringIntoIntArray(lines.get(i), splitBy);
                if (data[i].length != header.length) {
                    throw new IllegalArgumentException("Несовпадение между кол-вом столбцов и строк");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int[] stringIntoIntArray(String strToConvert, String splitBy) {
        String[] strArray = strToConvert.split(splitBy);
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            try {
                intArray[i] = Integer.parseInt(strArray[i]);
            } catch (NumberFormatException e) {
            }
        }
        return intArray;

    }

    public void saveData() {
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))) {
            StringBuffer line = new StringBuffer();
            for (int i = 0; i < header.length; i++) {
                line.append(header[i]);
                if (i != header.length - 1) {
                    line.append(splitBy);
                }
            }
            pw.println(line);
            for (int[] datum : data) {
                line.delete(0, line.length());
                for (int j = 0; j < datum.length; j++) {
                    line.append(datum[j]);
                    if (j != datum.length - 1) {
                        line.append(splitBy);
                    }
                }
                pw.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println();
        for (int[] datum : data) {
            for (int j = 0; j < datum.length; j++) {
                System.out.print(header[j] + ":" + datum[j]);
                if (j < datum.length - 1) {
                    System.out.print(splitBy + "  ");
                }
            }
            System.out.println();
        }
    }
}