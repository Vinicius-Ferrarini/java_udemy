import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros vai digitar?");
        int cont = sc.nextInt();;

        double[] vet = new double[cont];

        System.out.print("Digite um numero :");
        vet[0] = sc.nextDouble();

        double maior = vet [0];
        int posicao  = 0;

        for (int i = 1; i < vet.length; i++){
            System.out.print("Digite um numero :");
            vet[i] = sc.nextDouble();
            if(vet[i] > maior){
                maior = vet[i];
                posicao = i;
            }
        }
        System.out.printf("O maior valor = %.1f%n",maior);
        System.out.println("A posicao dele = " + posicao);

        sc.close();
    }
}