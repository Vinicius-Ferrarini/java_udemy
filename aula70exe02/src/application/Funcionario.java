package application;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double tax;


    public double SalarioLiquido(){
        return salarioBruto - tax;
    }

    public void IncreaseSalary(double porcentagem){
        salarioBruto = salarioBruto * (1 + porcentagem/100);
    }

    public String toString(){
        return nome + ", $ " + String.format("%.2f",SalarioLiquido());
    }
}
