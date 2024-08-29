import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
         List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Marcos");
        list.add("AAAA");
        list.add("Jose");
        list.add("Vinicius");
        list.add("AAAA");
        list.add(2,"teste");
        list.add("Ferrarini");
        list.add("Joao");

        list.remove("AAAA");
        list.remove(4);

        System.out.println("Tamanho da lista: " + list.size());
        for(String x : list) {
            System.out.println(x);
        }
        System.out.println("-------------------");

        list.removeIf(x -> x.charAt(0) == 'M');
        System.out.println("Tamanho da lista: " + list.size());
        for(String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------------");
        System.out.println("index of Jose: " + list.indexOf("Jose"));
        System.out.println("index of nao existe:: " + list.indexOf("nao"));
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').toList();

        System.out.println("-------------------");
        for(String x : result) {
            System.out.println(x);
        }


        String primeiroNomeComJ = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(primeiroNomeComJ);
    }
}