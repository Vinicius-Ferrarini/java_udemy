package application;

public class CurrencyConverter {
    public double valor;
    public double precoMoeda;

    public double totalReias(){
        return valor * precoMoeda * 1.06 ;
    }
}
