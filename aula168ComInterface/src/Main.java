import entities.CarRental;
import entities.Vehicle;
import services.BrazilTaxServices;
import services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        System.out.print("Digite o modelo do carro:");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);
        System.out.print("Devolvida (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);

        CarRental carRental = new CarRental(start,finish,new Vehicle(carModel));

        System.out.print("Digite o preco por hora: ");
        Double pricePerHour = sc.nextDouble();
        System.out.print("Digite o preco por dia: ");
        Double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay,pricePerHour,new BrazilTaxServices());

        rentalService.processInvoice(carRental);

        System.out.println("**Fatura**");
        System.out.println("Pagamento base : " + String.format("%.2f" ,carRental.getInvoice().getBasicPayment()));
        System.out.println("Impostro : "       + String.format("%.2f" ,carRental.getInvoice().getTax()));
        System.out.println("Total : "          + String.format("%.2f" ,carRental.getInvoice().getTotalPayment()));

        sc.close();
    }
}