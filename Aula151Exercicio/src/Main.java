import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite os dados da conta:");
            System.out.print("Number:");
            int number = sc.nextInt();
            System.out.print("Holder:");
            String holder = sc.next();
            System.out.print("Initial balance:");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit:");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);
            System.out.print("\nEnter amount for withdraw:");
            account.whitdraw(sc.nextDouble());
        }
        catch (Exception e){
            System.out.println("Erro "+ e.getMessage());
        }

        sc.close();
    }
}