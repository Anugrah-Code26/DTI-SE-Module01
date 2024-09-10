package exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSummary {
    private static final String path = "/home/anugrah/Documents/GitHub/DTI-SE-Module01/resources/product_sales_data.csv";

    public static List<String> readColumnData(String filePath, String columnName) {
        List<String> result = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(filePath));

            if (scanner.hasNextLine()) {
                String headerLine = scanner.nextLine();
                String[] headers = headerLine.split(",");
                int columnIndex = -1;

                // Find the index of the column by name
                for (int i = 0; i < headers.length; i++) {
                    if (headers[i].equalsIgnoreCase(columnName)) {
                        columnIndex = i;
                        break;
                    }
                }

                // Handle if column name is not found
                if (columnIndex == -1) {
                    System.out.println("'" + columnName + "' column not found.");
                    return result;
                }

                // Read the values from the identified column
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] columns = line.split(",");

                    if (columns.length > columnIndex) {
                        result.add(columns[columnIndex].trim());
                    } else {
                        System.out.println("Invalid line format: " + line);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (Exception e) {
            System.out.println("Global Exception");
        } finally {
            System.out.println("File reading done!");
        }
        return result;
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

    public static List<Integer> readItemPrice(String filePath) {
        List<String> stringData = readColumnData(filePath, "Item Price");
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

    // Read all the data
    static List<String> productNames = readProductNames(path);
    static List<Integer> itemPrices = readItemPrice(path);
    static List<Integer> totalSold = readTotalSold(path);

    public static int totalSales() {
        int sumSales = 0;
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
            if (totalSold.get(i-1) < totalSold.get(i)) {
                mostBoughtIndex = i;
            }
        }
        System.out.println("Most Bought Product: " + productNames.get(mostBoughtIndex) + " (Total Sold: " + totalSold.get(mostBoughtIndex) + " unit)");
    }

    public static void leastBoughtProduct() {
        int leastBoughtIndex = 0;
        for (int i = 1; i < productNames.size(); i++) {
            if (totalSold.get(i-1) > totalSold.get(i)) {
                leastBoughtIndex = i;
            }
        }
        System.out.println("Least Bought Product: " + productNames.get(leastBoughtIndex) + " (Total Sold: " + totalSold.get(leastBoughtIndex) + " unit)");
    }

    public static void summary() {
        System.out.println("Total Sales: " + totalSales());
        System.out.println("Total Product Sold: " + totalProductSold() + " unit");
        mostBoughtProduct();
        leastBoughtProduct();
    }
}
