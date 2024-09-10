//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String saida = "";
        for (int i = 1; i <= 100; i++) {
            saida = "";
            if (i % 3 == 0) saida += "Fizz";
            if (i % 5 == 0) saida += "Buzz";

            if (saida == "") System.out.println(i);

            else System.out.println(saida);
        }
    }
}