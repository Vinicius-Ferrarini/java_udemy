import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String[] linhas = new String[] {"Tapioca" , "Carioca","Safado"};
        String path = "c:\\temp\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            for( String linhu : linhas){
                bw.write(linhu);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}