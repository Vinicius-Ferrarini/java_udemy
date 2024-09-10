package org.example;

public class SistemaTransporte {
    public static void main(String[] args) {
        Transporte biscreta = new Bicicleta();
        Transporte caris = new Carro();

        biscreta.calcularTrajeito(100);
        caris.calcularTrajeito(100);

        execeutar(biscreta,100);
        execeutar(caris,100);

    }

    static void execeutar(Transporte t,double distancia){
        t.calcularTrajeito(distancia);
    }
}
