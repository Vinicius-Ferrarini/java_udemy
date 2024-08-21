import entities.conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int tempConta = sc.nextInt();
        System.out.print("Enter account holder: ");
        String tempName = sc.next();
        System.out.println("Is there na initial deposit (y/n)? ");
        char vaiDepositar = sc.next().charAt(0);
        conta cliente = new conta(tempConta,tempName);

        if (vaiDepositar == 'y' ){
            System.out.println("Enter valor inicial:");
            double tempInicial = sc.nextDouble();
            cliente.depositar(tempInicial);
        }
        System.out.println(cliente + "\n");

        System.out.print("Add to deposit: ");
        double tempValor = sc.nextDouble();
        cliente.depositar(tempValor);
        System.out.println(cliente +"\n");

        System.out.println("Enter a withdraw value:");
        tempValor = sc.nextDouble();
        cliente.retirar(tempValor);
        System.out.print(cliente);

        sc.close();
    }
}