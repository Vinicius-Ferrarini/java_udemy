package course;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mask = 0b100000; //32
        int n = sc.nextInt();

        if((n & mask) != 0){     //se n 
            System.out.println("6th bit is true!");
        }else {
            System.out.println("6th bit is false!");
        }

        sc.close();
    }
}