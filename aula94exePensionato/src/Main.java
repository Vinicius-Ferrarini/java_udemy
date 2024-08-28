import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa[] vect = new Pessoa[10];
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++){
            System.out.println("\nRent #"+ i );
            System.out.print("Name.: ");
            sc.nextLine();
            String tempName = sc.nextLine();

            System.out.print("Email: ");
            String temEmail = sc.next();

            System.out.print("Rooms: ");
            int tempNumero = sc.nextInt();

            vect[tempNumero] = new Pessoa(tempName,temEmail);
        }
        System.out.println("\nBusy rooms:");
        for(int i = 0;i < vect.length;i++){
            if(vect[i] != null)
                System.out.println(i +": "+ vect[i]);
        }

        sc.close();
    }
}