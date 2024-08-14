import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor diferente de zero:");
        int x = sc.nextInt();

        while (x != 0){
            x = sc.nextInt();
        }

        sc.close();
    }
}