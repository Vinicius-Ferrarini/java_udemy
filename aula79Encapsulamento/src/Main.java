import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name,price);
        product.setName("Test");
        System.out.println("linha teste: " + product.getName());

        System.out.println(product+"\n");

        System.out.print("Adicione produtos: ");
        int tempQuantity = sc.nextInt();
        product.addProducts(tempQuantity);
        System.out.println("\nUpdate  " + product);

        System.out.println("Remova produtos: ");
        tempQuantity = sc.nextInt();
        product.removeProducts(tempQuantity);
        System.out.println("\nUpdate  " + product);

        sc.close();
    }


}