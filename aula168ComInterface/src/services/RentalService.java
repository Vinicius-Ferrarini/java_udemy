package services;

import entities.CarRental;
import entities.Invoice;
import java.time.Duration;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxServices;

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxServices) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxServices = taxServices;
    }

    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours   = minutes / 60.0;

        double basicPayment;

        if (hours <= 12){
            basicPayment = pricePerHour * Math.ceil(hours); //Math.ceil(hours) arredonda pra cima a hora
        }else{
            basicPayment = pricePerDay  * Math.ceil(hours / 24);
        }

        double tax = taxServices.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment,tax));
    }
}
