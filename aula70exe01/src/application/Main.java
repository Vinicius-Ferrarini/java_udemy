package application;

import Retangulo.Retangulo;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        System.out.println("           Calcula Retangulo:");
        System.out.print("Altura: ");
        retangulo.altura = sc.nextDouble();
        System.out.print("Largura: ");
        retangulo.largura = sc.nextDouble();

        System.out.printf("Area      = %.2f%n",retangulo.Area());
        System.out.printf("Perimetro = %.2f%n",retangulo.Perimetro());
        System.out.printf("Diagonal  = %.2f%n",retangulo.Diagonal());

        sc.close();
    }
}