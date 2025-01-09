import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho:");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName..: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath..: " + path.getPath());
        sc.close();
    }
}