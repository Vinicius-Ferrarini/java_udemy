import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Pessoa> lista = new ArrayList<>();

        System.out.print("Digite a quantidade de pessoas: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Pessoa " + i );
            System.out.print("Fisica ou Juridica (f/j)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome:");
            String nome = sc.next();
            System.out.print("Renda Anual:");
            double rendaAnual = sc.nextDouble();
            if (ch == 'f'){
                System.out.print("Gasto saude:");
                double gastoSaude = sc.nextDouble();
                lista.add(new PessoaFisica(nome,rendaAnual,gastoSaude));
            }else {
                System.out.print("Quantidade Funcionarios:");
                int quantidadeFuncionario = sc.nextInt();
                lista.add(new PessoaJuridica(nome,rendaAnual,quantidadeFuncionario));
            }
        }

        System.out.println("\nImposto pago:");
        for(Pessoa pessua : lista){
            System.out.println(pessua.getNome() + ": $ "+ String.format("%.2f",pessua.calculaImposto()));
        }

        sc.close();
    }
}