import application.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyConverter novo = new CurrencyConverter();

        System.out.print("What is the dollar price?");
        novo.precoMoeda = sc.nextDouble();
        System.out.print("How many dollars will be bought?");
        novo.valor = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f",novo.totalReias());
        sc.close();
    }
}