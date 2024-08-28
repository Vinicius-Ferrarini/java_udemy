public class Main {
    public static void main(String[] args) {
        String[] vect = new String[]{"Maria" ,"Joao","Teste"};

        for (int i=0;i< vect.length;i++){
            System.out.println(vect[i]);
        }
        System.out.println("-----------------------------");
        for (String testa: vect){ // 'testa' virou o apelido para 'vect[i]'
            System.out.println(testa);
        }
    }
}