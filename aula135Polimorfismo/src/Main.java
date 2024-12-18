import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> lista =new ArrayList<>();

        System.out.println("quaantos?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Funcionaio "+ n + " :");
            System.out.println("Tercerizado(y/n)?");
            char ch = sc.next().charAt(0);
            System.out.println("name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Horas");
            int hours = sc.nextInt();
            System.out.println("Valor hora");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y'){
                System.out.println("Adicional:");
                double adicional = sc.nextDouble();
                lista.add(new Tercerizado(name,hours,valuePerHour,adicional));
            }else{
                lista.add(new Employee(name,hours,valuePerHour));
            }
        }

        System.out.println("PAYMENT:");
            for(Employee emp : lista){
                System.out.println(emp.getName() + " - $" + String.format("%.2f",emp.payment()));
            }


        sc.close();
    }
}