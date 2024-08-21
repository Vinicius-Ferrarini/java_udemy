package entities;

public class conta {
    private int numero;
    private String name;
    private double valor;

    //CONSTRUTOR

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValor() {
        return valor;
    }

    public conta(int numero, String name) {
        this.numero = numero;
        this.name = name;
    }

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor igual o menor que ZERO!");
        }else{
            this.valor += valor;
        }
    }

    public void retirar(double valor){
        double temp = this.valor - valor;
        if (temp < 0){
            System.out.println("Valor insuficiente!");
        }else{
            this.valor = temp - 5 ;
        }
    }

    @Override
    public String toString() {
        return String.format("Conta :%d, Holder: %s, Balance: $%.2f",numero,name,valor);
    }
}

