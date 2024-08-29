import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos funcionarios ira digitar? ");
        int n = sc.nextInt();

        Funcionario[] vet = new Funcionario[n];

        for(int i = 0; i < n ; i++){
            System.out.println("\n funcionario");
            System.out.print("Id.....: ");
            int tempId = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome...: ");
            String tempName = sc.nextLine();
            System.out.print("Salario: ");
            double tempSalario = sc.nextDouble();
            vet[i] = new Funcionario(tempName,tempId,tempSalario);
        }

        System.out.print("Digite o id do funcionario para aumentar salario: ");
        int achou = 0,tempId = sc.nextInt();

        for(int i = 0; i < n ; i++){
            if (tempId == vet[i].getId()){
                achou = i;
                System.out.print("Digite a porcentagem: ");
                vet[i].aumentaSalario(sc.nextDouble());
                i = n;
            }
        }
        if(achou == 0){
            System.out.println("Funcionario nao encontrado!");
        }

        for (Funcionario x : vet){
            System.out.println(x);
        }

        sc.close();
    }
}