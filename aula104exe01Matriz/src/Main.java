import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de colunas");
        int m = sc.nextInt();
        System.out.print("Digite a quantidade de linhas");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Digite o numero a procurar:");
        int cade = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == cade){
                    System.out.println("Posicao "+ i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left " + matrix[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up " + matrix[i - 1][j]);
                    }
                    if (j < matrix[i].length -1 ) {
                        System.out.println("Right " + matrix[i][j + 1]);
                    }
                    if (i < matrix.length -1) {
                        System.out.println("Left " + matrix[i + 1][j]);
                    }

                }
            }
        }


        sc.close();
    }
}