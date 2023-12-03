package aqatest.lesson6;

import java.util.Arrays;

import static aqatest.lesson6.CSVHandler.load;
import static aqatest.lesson6.CSVHandler.save;

public class Example {
    public static void main(String[] args) {
        AppData data = new AppData();
        data.setHeader(new String[]{"Value 1", "Value 2", "Value 3"});
        data.addRow(new int[]{100, 200, 123});
        data.addRow(new int[]{300, 400, 500});

        save(data, "data.csv");

        AppData loadedData = load("data.csv");

        System.out.println(String.join(";", loadedData.getHeader()));
        for (int[] row : loadedData.getData()) {
            String rowString = Arrays.stream(row)
                    .mapToObj(String::valueOf)
                    .reduce((s1, s2) -> s1 + ";" + s2)
                    .orElse("");
            System.out.println(rowString);
        }
    }
}
