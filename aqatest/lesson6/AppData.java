package aqatest.lesson6;

public class AppData {
    private String[] header;
    private int[][] data;
    private int rowCount;

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void addRow(int[] row) {
        if (data == null) {
            data = new int[1][];
            data[0] = row;
        } else {
            int[][] newData = new int[data.length + 1][];
            System.arraycopy(data, 0, newData, 0, data.length);
            newData[data.length] = row;
            data = newData;
        }
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }
}
