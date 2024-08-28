public class Main {
    public static void main(String[] args) {
        int x =20;

        Object obj = x ;

        System.out.println(obj);

        int y = (int) obj;

        Integer objs = x * 2 ;

        y = objs;

        System.out.println(y);
    }
}