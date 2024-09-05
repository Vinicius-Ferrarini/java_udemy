import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int [] [] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] =sc.nextInt();
            }
        }
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.println(matrix[i][i]);
        }

        int cont = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0){
                    cont++;
                }
            }
        }
        System.out.println("Quantidade de negativos "+ cont);
        sc.close();
    }
}