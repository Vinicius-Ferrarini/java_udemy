package org.example;

public class FizzBuzz {
    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }
    public void executar() {
        String saida = "";
        for (int i = 1; i <= n; i++) {
            saida = "";
            if (i % 3 == 0)
                saida += "Fizz";
            if (i % 5 == 0)
                saida += "Buzz";

            if (saida == "")
                System.out.println(i);
            else
                System.out.println(saida);
        }
    }
}
