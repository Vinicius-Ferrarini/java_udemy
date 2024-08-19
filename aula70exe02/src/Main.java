import application.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Name:");
        funcionario.nome = sc.nextLine();
        System.out.print("Salario bruto:");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Taxa:");
        funcionario.tax = sc.nextDouble();

        System.out.println("funcionario"+ funcionario);

        System.out.print("Digite a porcentagem para incremetar ao salario:");
        double temp = sc.nextDouble();
        funcionario.IncreaseSalary(temp);

        System.out.println("Update "+ funcionario);

        sc.close();
    }
}