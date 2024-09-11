package exercise;

import exercise.utility.FormatNumber;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSummary {
    private static final String path = "/home/anugrah/Documents/GitHub/DTI-SE-Module01/resources/product_sales_data.csv";

    // Read column data
    public static List<String> readColumnData(String filePath, String columnName) {
        List<String> result = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filePath));

            if (scanner.hasNextLine()) {
                String[] headers = scanner.nextLine().split(",");
                int columnIndex = findColumnIndex(headers, columnName);

                // Handle if column name is not found
                if (columnIndex == -1) {
                    System.out.println("'" + columnName + "' column not found.");
                    return result;
                }

                // Read the values from the identified column
                while (scanner.hasNextLine()) {
                    String[] columns = scanner.nextLine().split(",");
                    if (columns.length > columnIndex) {
                        result.add(columns[columnIndex].trim());
                    } else {
                        System.out.println("Invalid line format!");
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        return result;
    }

    // Find the index of the column by name
    private static int findColumnIndex(String[] headers, String columnName) {
        for (int i = 0; i < headers.length; i++) {
            if (headers[i].equalsIgnoreCase(columnName)) {
                return i;
            }
        }
        return -1;
    }

    public static List<String> readProductNames(String filePath) {
        return readColumnData(filePath, "Product Name");
    }

    public static List<Integer> readTotalSold(String filePath) {
        List<String> stringData = readColumnData(filePath, "Total Sold");
        List<Integer> result = new ArrayList<>();
        for (String data : stringData) {
            try {
                result.add(Integer.parseInt(data));
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + data);
            }
        }
        return result;
    }

    public static List<Double> readItemPrice(String filePath) {
        List<String> stringData = readColumnData(filePath, "Item Price");
        List<Double> result = new ArrayList<>();
        for (String data : stringData) {
            try {
                result.add(Double.valueOf(data));
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + data);
            }
        }
        return result;
    }

    // Read all the data
    static List<String> productNames = readProductNames(path);
    static List<Integer> totalSold = readTotalSold(path);
    static List<Double> itemPrices = readItemPrice(path);

    // Summary Calculation
    public static double totalSales() {
        double sumSales = 0;
        for (int i = 0; i < productNames.size(); i++) {
            sumSales += itemPrices.get(i) * totalSold.get(i);
        }

        return sumSales;
    }

    public static int totalProductSold() {
        int sumProduct = 0;
        for (int i = 0; i < productNames.size(); i++) {
            sumProduct += totalSold.get(i);
        }
        return sumProduct;
    }

    public static void mostBoughtProduct() {
        int mostBoughtIndex = 0;
        for (int i = 1; i < productNames.size(); i++) {
            if (totalSold.get(mostBoughtIndex) < totalSold.get(i)) {
                mostBoughtIndex = i;
            }
        }
        System.out.println("Most Bought Product: " + productNames.get(mostBoughtIndex) +
                " (Total Sold: " + FormatNumber.formatNumber(totalSold.get(mostBoughtIndex)) + " unit)");
    }

    public static void leastBoughtProduct() {
        int leastBoughtIndex = 0;
        for (int i = 1; i < productNames.size(); i++) {
            if (totalSold.get(leastBoughtIndex) > totalSold.get(i)) {
                leastBoughtIndex = i;
            }
        }
        System.out.println("Least Bought Product: " + productNames.get(leastBoughtIndex) +
                " (Total Sold: " + FormatNumber.formatNumber(totalSold.get(leastBoughtIndex)) + " unit)");
    }

    public static void summary() {
        System.out.println();
        System.out.println("Total Sales: " + FormatNumber.formatNumber(totalSales()));
        System.out.println("Total Product Sold: " + FormatNumber.formatNumber(totalProductSold()) + " unit");
        mostBoughtProduct();
        leastBoughtProduct();
    }
}