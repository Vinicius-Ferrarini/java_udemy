public class PessoaFisica extends Pessoa{
    private double gastoSaude;

    public PessoaFisica(String nome, Double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double calculaImposto() {
        double impostoBasico = (getRendaAnual() < 20000 ? getRendaAnual() * 0.15 : getRendaAnual() * 0.25);
        impostoBasico -= getGastoSaude() * 0.5;

        if (impostoBasico < 0){
            impostoBasico = 0;
        }

        return impostoBasico;
    }
}
