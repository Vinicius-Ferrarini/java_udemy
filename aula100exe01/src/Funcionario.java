public class Funcionario {
    private String name;
    private int id;
    private double salario;

    public Funcionario(String name, int id, double salario) {
        this.name = name;
        this.id = id;
        this.salario = salario;
    }
    public void aumentaSalario(double porcentagem){
        salario += salario * porcentagem / 100;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id +", " + name +", " + String.format("%.2f",salario);
    }
}
