package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x1,x2,x3 , y1,y2,y3;

        System.out.println("Digite os valor do triangulo X: ");
        x1 = sc.nextDouble();
        x2 = sc.nextDouble();
        x3 = sc.nextDouble();
        System.out.println("Digite os valor do triangulo Y: ");
        y1 = sc.nextDouble();
        y2 = sc.nextDouble();
        y3 = sc.nextDouble();

        double p = (x1+x2+x3) / 2;
        double areaX = Math.sqrt(p * (p - x1) * (p - x2) * (p - x3));

        p = (y1+y2+y3) / 2;
        double areaY = Math.sqrt(p * (p - y1) * (p - y2) * (p - y3));

        System.out.printf("Triangle X area: %.4f%n" , areaX);
        System.out.printf("Triangle y area: %.4f%n" , areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X");
        }else{
            System.out.println("Larger area :Y");
        }

        sc.close();
    }
}
