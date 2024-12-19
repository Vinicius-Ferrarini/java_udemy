import jdk.dynalink.support.SimpleRelinkableCallSite;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy):");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy):");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reserva: " + reservation);

            System.out.println("\n***Update Date ***");
            System.out.print("Check-in date (dd/MM/yyyy):");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy):");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reserva: " + reservation);
        }
        catch (ParseException e){
            System.out.println("Data digitada Incorreta!");
        }
        catch (IllegalArgumentException e){
            System.out.println("Erro " + e.getMessage());
        }



        sc.close();
    }
}