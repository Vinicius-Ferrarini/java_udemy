package Test;

public class Reuniao extends Evento{
    private boolean temSenha;
    private String senha;

    public boolean isTemSenha() {
        return temSenha;
    }

    public void setTemSenha(boolean temSenha) {
        this.temSenha = temSenha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Reuniao(String nome, String date, boolean temSenha, String senha) {
        super(nome, date);
        this.temSenha = temSenha;
        this.senha = senha;
    }

    public boolean acessarReuniao(String senha) {
        if (temSenha){
            return senha != null && senha.equals(this.senha) ;
        }else return true;
    }

    @Override
    public boolean validar() {
        return super.validar();
    }
}
