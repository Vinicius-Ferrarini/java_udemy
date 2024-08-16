package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.ladoA = sc.nextDouble();
        x.ladoB = sc.nextDouble();
        x.ladoC = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        y.ladoA = sc.nextDouble();
        y.ladoB = sc.nextDouble();
        y.ladoC = sc.nextDouble();

        double areaX = x.areaTriangle();
        double areaY = y.areaTriangle();

        System.out.printf("Area X : %.4f%n",areaX);
        System.out.printf("Area Y : %.4f%n",areaY);
        sc.close();
    }
}