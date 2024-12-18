import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> lista = new ArrayList<>();

        System.out.println("Numero de produtos;");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Datos do produto #" + i + ":");
            System.out.print("Common,used or imported(c/u/i)?");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Preco: ");
            double price = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                lista.add(new ImportedProduct(name, price, customsFee));
            } else if (ch == 'c') {
                lista.add(new Product(name, price));
            } else {
                System.out.println("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                lista.add(new UsedProduct(name, price, date));
            }
        }

            System.out.println();
            for (Product prods : lista) {
                System.out.println(prods.priceTag());
            }

            sc.close();

    }
}