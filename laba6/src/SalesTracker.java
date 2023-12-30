import java.util.*;

class SalesRecord {
    private String productName;
    private double price;

    public SalesRecord(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

public class SalesTracker {
    private HashSet<SalesRecord> salesRecords;

    public SalesTracker() {
        salesRecords = new HashSet<>();
    }

    public void addSale(String productName, double price) {
        salesRecords.add(new SalesRecord(productName, price));
    }

    public void displaySales() {
        for (SalesRecord record : salesRecords) {
            System.out.println("Product: " + record.getProductName() + " Price: " + record.getPrice());
        }
    }

    public double calculateTotalSales() {
        double totalSales = 0;
        for (SalesRecord record : salesRecords) {
            totalSales += record.getPrice();
        }
        return totalSales;
    }

    public String mostPopularProduct() {
        HashMap<String, Integer> productCounts = new HashMap<>();

        for (SalesRecord record : salesRecords) {
            String productName = record.getProductName();
            if (productCounts.containsKey(productName)) {
                productCounts.put(productName, productCounts.get(productName) + 1);
            } else {
                productCounts.put(productName, 1);
            }
        }

        String mostPopularProduct = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : productCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostPopularProduct = entry.getKey();
            }
        }

        return mostPopularProduct;
    }
}

