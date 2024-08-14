import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String original = " abcde FGHIJ ABC abc DEFG    ";

        String minusculo  = original.toLowerCase();
        String semEspaco  = original.trim();
        String subsString = original.substring(4,9);//comeca string do a partir do caracter 4
        String replace    = original.replace('a','x');
        String replaceSub = original.replace("abc","wym");
        int i = original.indexOf("FG");
        int j = original.lastIndexOf("bc");

        System.out.println("\nOriginal:           -" + original  + "-");
        System.out.println("toLowerCase()       -" + minusculo  + "-");
        System.out.println("trim()              -" + semEspaco  + "-");
        System.out.println("substring(4,9)      -" + subsString + "-");
        System.out.println("replace('a','x')    -" + replace    + "-");
        System.out.println("replace('abc','wy') -" + replaceSub + "-");
        System.out.println("indexOf('FG')       :" + i);
        System.out.println("lastIndexOf('bc')   :" + j);
//-------------------------------------------------------------------------------

        String frase = "potato apples lemon orange";

        String[] vect =  frase.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);


    }
}