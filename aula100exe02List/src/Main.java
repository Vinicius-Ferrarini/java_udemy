import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Funcionario> list = new ArrayList<>();

        System.out.println("Quantas funcionarios ira digitar? ");
        int n = sc.nextInt();

        for (int i = 1 ; i<= n ; i++){
            System.out.println("\nFuncionario #" + i);

            System.out.print("Id : ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Funcionario(id,name,salary));
        }

        System.out.println();

        System.out.print("Digite o porcentagem que ira incrementar: ");
        double porcentagem = sc.nextDouble();


    }
}