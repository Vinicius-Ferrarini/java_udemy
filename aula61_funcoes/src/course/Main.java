package  course;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maior = maior(a,b,c);



        System.out.println(maior);

        sc.close();
    }

    public static int maior(int n1,int n2,int n3){
        int aux = n1;
        if(n2 > aux){
             aux = n2;
        }
        if(n3 > aux){
            return n3;
        }
        return aux;
    }
}