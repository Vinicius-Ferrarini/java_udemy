import java.io.*;
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

        List<Produto> lista = new ArrayList<>();

        System.out.println("Digite o caminho arquivo:");
        String arquivoOrigemStr = sc.nextLine();

        File arquivoOrigem  = new File(arquivoOrigemStr);
        String diretorioFonte = arquivoOrigem.getParent();

        boolean sucess = new File(diretorioFonte+"\\out").mkdir();
        System.out.println("Arquivo criado? " + sucess);

        String arquivoSaidaStr = diretorioFonte + "\\out\\sumary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(arquivoOrigem))){

            String itemCsv = br.readLine();
            while(itemCsv != null){

                String[] campos = itemCsv.split(",");//separados por virgula
                String name = campos[0];
                double price = Double.parseDouble(campos[1]);
                int quantidade = Integer.parseInt(campos[2]);

                lista.add(new Produto(name,price,quantidade));

                itemCsv = br.readLine();//proximo produto

            }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoSaidaStr))) {
                for(Produto items : lista){
                    bw.write(items.getName() + "," + String.format("%.2f",items.total()));
                    bw.newLine();
                }

            }
            catch (IOException e){
                System.out.println("Erro de ler arquivo " + e.getMessage());
            }


        }
        catch (IOException e){
            System.out.println("Erro de ler arquivo " + e.getMessage());
        }


        sc.close();
    }
}