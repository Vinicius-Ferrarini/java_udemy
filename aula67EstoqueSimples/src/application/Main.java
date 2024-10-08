package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();


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