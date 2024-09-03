import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Funcionario> lista = new ArrayList<>();

        System.out.print("Quantos funcionarios para digitar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {


            System.out.println("\nFuncionario #" + (i+1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Funcionario funcionario = new Funcionario(id,name,salary);
            lista.add(funcionario);
        }
        System.out.println("Digite o id do funcionario que ira aumentar o salario");
        int idTemp = sc.nextInt();
        Funcionario tempFuncionario = lista.stream().filter(x -> x.getId() == idTemp).findFirst().orElse(null);

        if (tempFuncionario == null) {
            System.out.println("ID inexistente!!");
        }else {
            System.out.println("Qual a porcentagem que ira aumenter?");
            double porcento = sc.nextDouble();
            tempFuncionario.increaseSalary(porcento);
        }

        for (Funcionario funcionario : lista) {
            System.out.println(funcionario);
        }

        sc.close();

    }
    public static boolean hasId(List<Funcionario> liste,int tmpId){
        Funcionario fun = liste.stream().filter(x ->x.getId() == tmpId).findFirst().orElse(null);
        return fun != null;
    }

}