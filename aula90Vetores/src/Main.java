
import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("              Estoque");
        System.out.println("Digite a quantidade de produto para adiciona em estoque:");
        int n = sc.nextInt();
        Product[] vect = new Product[n];
        double sum = 0;

        for(int i = 0 ; i < vect.length ; i++){
            System.out.printf("Digite o nome do produto [%d]: ",i+1);
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("Digite o preco do produto[%d]: ",i+1);
            double price = sc.nextDouble();
            vect[i] = new Product(name,price);
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length ;
        System.out.printf("AVERAGE PRICE = %.2f",avg);

        sc.close();
    }


}