import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId +
                ", Name: " + productName +
                ", Category: " + category;
    }
}

public class SearchTest {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Mobile", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(102, "Watch", "Accessories"),
                new Product(104, "Bag", "Fashion")
        };

        int targetId = 102;

        // Linear Search
        Product result1 = linearSearch(products, targetId);

        System.out.println("Linear Search Result:");
        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product not found.");

        // Sort array for Binary Search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        // Binary Search
        Product result2 = binarySearch(products, targetId);

        System.out.println("\nBinary Search Result:");
        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product not found.");

        // Time Complexity Analysis
        System.out.println("\nTime Complexity Comparison:");
        System.out.println("Linear Search -> Best: O(1), Average: O(n), Worst: O(n)");
        System.out.println("Binary Search -> Best: O(1), Average: O(log n), Worst: O(log n)");

        System.out.println("\nBinary Search is more suitable for an e-commerce platform");
        System.out.println("because it provides faster search performance on sorted data.");
    }
}