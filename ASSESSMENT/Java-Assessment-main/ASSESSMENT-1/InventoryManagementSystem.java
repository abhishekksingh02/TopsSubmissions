package ASSESSMENT1;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private String company;

    // Constructor
    public Product(int id, String name, double price, int quantity, String company) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.company = company;
    }

    // Getters
    public int getId() {
        return id;
    }

    

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCompany() {
        return company;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    // toString method to display product details
    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Price: Rs." + price + ", Quantity: " + quantity + ", Company: " + company;
    }
}

public class InventoryManagementSystem {
    private static ArrayList<Product> productList = new ArrayList<>();
    private static int productIdCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Inventory Management System");
            System.out.println("1. Add Stock");
            System.out.println("2. View Stock");
            System.out.println("3. Search Stock");
            System.out.println("4. Edit Stock");
            System.out.println("5. Delete Stock");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addStock(scanner);
                    break;
                case 2:
                    viewStock();
                    break;
                case 3:
                    searchStock(scanner);
                    break;
                case 4:
                    editStock(scanner);
                    break;
                case 5:
                    deleteStock(scanner);
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }

    private static void addStock(Scanner scanner) {
        System.out.println("Add Stock:");
        System.out.print("Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Product Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Product Company: ");
        String company = scanner.nextLine();

        Product product = new Product(productIdCounter++, name, price, quantity, company);
        productList.add(product);

        System.out.println("Product added successfully!");
    }

    private static void viewStock() {
        System.out.println("View Stock:");
        if (productList.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    private static void searchStock(Scanner scanner) {
        System.out.println("Search Stock:");
        System.out.print("Enter Product ID: ");
        int productId = scanner.nextInt();

        for (Product product : productList) {
            if (product.getId() == productId) {
                System.out.println("Product found:");
                System.out.println(product);
                return;
            }
        }
        System.out.println("Product not found with ID: " + productId);
    }

    private static void editStock(Scanner scanner) {
        System.out.println("Edit Stock:");
        System.out.print("Enter Product ID: ");
        int productId = scanner.nextInt();

        for (Product product : productList) {
            if (product.getId() == productId) {
                System.out.println("Product found. Enter new information:");

                System.out.print("Product Name: ");
                String name = scanner.nextLine();
                System.out.print("Product Price: ");
                double price = scanner.nextDouble();
                System.out.print("Product Quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                System.out.print("Product Company: ");
                String company = scanner.nextLine();

                product.setName(name);
                product.setPrice(price);
                product.setQuantity(quantity);
                product.setCompany(company);

                System.out.println("Product information updated successfully!");
                return;
            }
        }
        System.out.println("Product not found with ID: " + productId);
    }

    private static void deleteStock(Scanner scanner) {
        System.out.println("Delete Stock:");
        System.out.print("Enter Product ID: ");
        int productId = scanner.nextInt();

        for (Product product : productList) {
            if (product.getId() == productId) {
                productList.remove(product);
                System.out.println("Product deleted successfully!");
                return;
            }
        }
        System.out.println("Product not found with ID: " + productId);
    }
}
