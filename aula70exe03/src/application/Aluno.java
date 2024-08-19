package application;

public class Aluno {
    public String nome;
    public double n1;
    public double n2;
    public double n3;

    public double totalNota(){
        return n1 + n2 + n3;
    }

    public void resultado(){
        double tempNota = totalNota();
        System.out.printf("Nota final: %.2f%n",tempNota);
        if(tempNota >= 60){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60 - tempNota);
        }
    }
}

