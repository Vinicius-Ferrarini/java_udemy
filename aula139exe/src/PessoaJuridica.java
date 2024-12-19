public class PessoaJuridica extends Pessoa{
    private int quantidadeFuncionario;

    public PessoaJuridica(String nome, Double rendaAnual, int quantidadeFuncionario) {
        super(nome, rendaAnual);
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    public int getQuantidadeFuncionario() {
        return quantidadeFuncionario;
    }

    public void setQuantidadeFuncionario(int quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    @Override
    public double calculaImposto() {
        //se menos que 10 funcionarios 16% se mais 14%
        return (getQuantidadeFuncionario() <= 10 ? getRendaAnual() * 0.16 : getRendaAnual() * 0.14);
    }
}
