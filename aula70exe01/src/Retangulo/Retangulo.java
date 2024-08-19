package Retangulo;

public class Retangulo {
    public double altura;
    public double largura;

    public double Area(){
        return altura * largura;
    }

    public double Perimetro(){
        return 2 * (altura + largura);
    }

    public double Diagonal(){
        return Math.sqrt( Math.pow(altura,2) + Math.pow(largura,2) );
    }
}
