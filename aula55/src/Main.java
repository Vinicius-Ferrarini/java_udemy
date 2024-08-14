import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char resp;
        do {
            System.out.print("Digite o valor em Celsius: ");
            double C = sc.nextDouble();
            double F = 9 * C / 5 + 32;
            System.out.printf("O valor em Fahrenheit :%.1f%n", F);
            System.out.println("Deseja continuar (s/n) ?");
            resp = sc.next().charAt(0);
        }while (resp == 's');


    }
}