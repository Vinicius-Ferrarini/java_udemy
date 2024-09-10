package org.example;

public class Carro implements Transporte{
    private String modelo;
    private String cor;


    @Override
    public void calcularTrajeito(double distancia) {
        double resultado = distancia/40;
    }
}
