import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pesssoas serao digitadas?");
        int temp = sc.nextInt();
        sc.nextLine();

        Pessoas[] vet = new Pessoas[temp];
        double sumAltura = 0;
        int contMenos16 = 0;
        for(int i = 0; i < vet.length;i++){
            vet[i] = new Pessoas();
            System.out.printf("Pessoa %d°:\n",i+1);
            System.out.print("Nome: ");
            vet[i].setNome(sc.nextLine());
            System.out.print("Idade: ");
            vet[i].setIdade(sc.nextInt());
            sc.nextLine();
            System.out.print("Altura: ");
            vet[i].setAltura(sc.nextDouble());
            sc.nextLine();
            sumAltura += vet[i].getAltura();
            if (vet[i].getIdade() < 16){
                contMenos16++;
            }
        }
        double alturaMedia    = sumAltura   / vet.length;
        double percentMenos16 = contMenos16 * 100.00/ vet.length;

        System.out.printf("Altura media : %.2f%n", alturaMedia);
        System.out.printf("Pessoa com menos de 16 anos : %.1f%% %n",percentMenos16);
        for (Pessoas pessoas : vet) {
            System.out.println(pessoas.getNome());
        }


        sc.close();
    }
}