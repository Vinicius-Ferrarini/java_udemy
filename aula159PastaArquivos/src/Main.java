import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma pasta:");
        String strDiretorio = sc.nextLine();

        File path = new File(strDiretorio);

        //pastas
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("**Diretório**");
        for(File foldis : folders){
            System.out.println(foldis);
        }

        //arquivos
        File[] arquivos = path.listFiles(File::isFile);
        System.out.println("\n**Arquivos**");
        for (File arquivis : arquivos){
            System.out.println(arquivis);
        }

        //cria subpasta
        boolean sucess = new File(strDiretorio+ "\\NovaSubPasta").mkdir();
        System.out.println("Diretório criado? " + sucess);

        sc.close();
    }
}