package Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int numOfProducts;
        int pid, quantity;
        double price;


        System.out.println("Enter number of products");
        numOfProducts = scanner.nextInt();

        Product[] products = new Product[numOfProducts];

        for (int i = 0; i < numOfProducts; i++) {
            System.out.println("Enter pid");
            pid = scanner.nextInt();
            System.out.println("Enter quantity");
            quantity = scanner.nextInt();
            System.out.println("Enter price");
            price = scanner.nextDouble();
            products[i] = new Product(pid, quantity, price);
        }

        System.out.println("Finding pid of product with highest price ");
        double highestPrice = Double.NEGATIVE_INFINITY;
        int requiredPid = 0;
        for (Product p : products) {
            if (p.price > highestPrice) {
                highestPrice = p.price;
                requiredPid = p.pid;
            }
        }
        System.out.println("The pid of product with highest price is " + requiredPid);

        System.out.println("Finding the total amount : ");
        System.out.print(main.getTotalAmountSpentOnAllProducts(products));
    }

    double getTotalAmountSpentOnAllProducts(Product... products) {
        double totalAmount = 0.0;
        for (Product p : products) {
            totalAmount += p.price * p.quantity;
        }
        return totalAmount;
    }
}
