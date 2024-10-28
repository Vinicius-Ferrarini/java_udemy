import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01     = LocalDate    .now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03       = Instant      .now();

        LocalDate d04     = LocalDate    .parse("2024-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-20T01:30:26");
        Instant d06       = Instant      .parse("2024-07-20T01:30:26Z");
        Instant d07       = Instant      .parse("2024-07-20T01:30:26-03:00");

        LocalDate     d08 = LocalDate    .parse("25/10/2024",fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30",fmt2);

        LocalDate     d10 = LocalDate.of(2024,10,20);
        LocalDateTime d11 = LocalDateTime.of(2024,10,28,10,10);

        System.out.println("====Now====");
        System.out.println("LocalDate....: " + d01);
        System.out.println("LocalDateTime: " + d02);
        System.out.println("Instant......: " + d03);
        System.out.println("====Parse====");
        System.out.println("LocalDate....: " + d04);
        System.out.println("LocalDateTime: " + d05);
        System.out.println("Instant......: " + d06);
        System.out.println("====Formatado====");
        System.out.println("Instant......: " + d07);
        System.out.println("LocalDate....: " + d08);
        System.out.println("LocalDateTime: " + d09);
        System.out.println("====Escrevendo separado====");
        System.out.println("LocalDate....: " + d10);
        System.out.println("LocalDateTime: " + d11);
    }
}