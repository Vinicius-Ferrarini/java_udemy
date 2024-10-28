import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate     d01 = LocalDate     .parse("2003-04-13");
        LocalDateTime d02 = LocalDateTime.parse("2003-04-13T01:30:26");
        Instant       d03 = Instant      .parse("2003-04-13T01:30:26Z");

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate     semanaPassadaLocalDate      = d01.minusDays(7);
        LocalDate     semanaQueVemLocalDate       = d01.plusDays(7);
        LocalDateTime semanaQueVemLocalDateTime   = d02.plusDays(7);
        LocalDateTime semanaPassadaLocalDateTime  = d02.minusDays(7);
        Instant       semanaPassadaInstant        = d03.minus(7, ChronoUnit.DAYS);
        Instant       semanaQueVemInstant         = d03.plus(7, ChronoUnit.DAYS);

        LocalDateTime d04 = LocalDate.now().atStartOfDay();

        Duration t1 = Duration.between(d04,d01.atStartOfDay());
        Duration t2 = Duration.between(semanaPassadaLocalDateTime,d02);
        Duration t3 = Duration.between(semanaPassadaInstant,d03);


        System.out.println(semanaPassadaLocalDate);
        System.out.println(semanaQueVemLocalDate);
        System.out.println(semanaPassadaInstant);
        System.out.println(semanaQueVemInstant);
        System.out.println(t1.toDays());
        System.out.println(t2.toDays());
        System.out.println(t3);
    }
}