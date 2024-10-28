import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate     d01 = LocalDate    .parse("2024-10-28");
        LocalDateTime d02 = LocalDateTime.parse("2024-10-28T10:25:13");
        Instant       d03 = Instant      .parse("2024-10-28T10:25:13Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d01 = "+ d01 .format(fmt1));
        System.out.println("d01 = "+ fmt1.format(d01));
        System.out.println("d02 = "+ fmt1.format(d02));
        System.out.println("d02 = "+ fmt2.format(d02));
        System.out.println("d03 = "+ fmt3.format(d03));
        System.out.println("d02 = "+ fmt4.format(d02));
        System.out.println("d03 = "+ fmt5.format(d03));



    }
}