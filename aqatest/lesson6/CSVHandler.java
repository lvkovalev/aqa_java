package aqatest.lesson6;

import java.io.*;
import java.util.Arrays;

public class CSVHandler {
    public static void save(AppData data, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println(String.join(";", data.getHeader()));
            for (int[] row : data.getData()) {
                String rowString = Arrays.stream(row)
                        .mapToObj(String::valueOf)
                        .reduce((s1, s2) -> s1 + ";" + s2)
                        .orElse("");
                writer.println(rowString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AppData load(String filename) {
        AppData data = new AppData();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String headerLine = reader.readLine();
            String[] header = headerLine.split(";");
            data.setHeader(header);

            String line;
            int rowCount = 0;
            while ((line = reader.readLine()) != null) {
                String[] rowValues = line.split(";");
                int[] row = new int[rowValues.length];
                for (int i = 0; i < rowValues.length; i++) {
                    row[i] = Integer.parseInt(rowValues[i]);
                }
                data.addRow(row);
                rowCount++;
            }
            data.setRowCount(rowCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
