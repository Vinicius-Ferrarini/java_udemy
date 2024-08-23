import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros vai digitar? ");
        int n = sc.nextInt();

        double sum = 0;
        double[] vet = new double[n];

        for(int i = 0; i < vet.length;i++){
            System.out.printf("Digite um numero [%d]: ",i + 1);
            vet[i] = sc.nextDouble();
            sum += vet[i];
        }

        System.out.print("\nVALORES =");
        for (int i=0 ;i < vet.length ;i++)
            System.out.print(" " + vet[i] + " ");
        System.out.printf("\nSOMA = %.2f",sum );
        System.out.printf("\nMEDIA = %.2f",sum/vet.length );

        sc.close();
    }
}