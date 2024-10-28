import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate     d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant       d03 = Instant.now();

        LocalDate     r1 = LocalDate    .ofInstant(d03,ZoneId.systemDefault());
        LocalDate     r2 = LocalDate    .ofInstant(d03,ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03,ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03,ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1 );
        System.out.println("r2 = " + r1 );
        System.out.println("r3 = " + r3 );
        System.out.println("r4 = " + r4 );

        System.out.println("d01 dia = "+ d01.getDayOfMonth());
        System.out.println("d01 mes = "+ d01.getMonth());
        System.out.println("d01 ano = "+ d01.getYear());
    }
}