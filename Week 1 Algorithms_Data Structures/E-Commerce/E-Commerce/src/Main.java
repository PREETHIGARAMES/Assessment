public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Camera", "Electronics"),
            new Product(105, "Phone", "Electronics")
        };

        // Linear Search
        Product result1 = LinearSearch.linearSearch(products, "Camera");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Product not found"));

        // Binary Search
        Product result2 = BinarySearch.binarySearch(products, "Camera");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Product not found"));
    }
}

