import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        metodo1();

        System.out.println("----Fim programa!!---");

    }

    public static void metodo1(){
        System.out.println("----Inicio METODO1---");
        metodo2();
        System.out.println("----Fim METODO1---");
    }

    public static void metodo2(){
        System.out.println("----Inicio METODO2---");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            String[] vetus = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vetus[position]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posição invalida!");
            e.printStackTrace(); //para mostrar o erro sem trava o programa
        }
        catch (InputMismatchException e) {
            System.out.println("Digite um numero!");
        }

        sc.close();
        System.out.println("----Fim METODO2---");
    }
}