package Test;

import java.util.ArrayList;
import java.util.List;

public class Workshop extends Evento {
    private List<String> participantes = new ArrayList<>();

    public List<String> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<String> participantes) {
        this.participantes = participantes;
    }

    public Workshop(String nome, String date) {
        super(nome, date);
    }

    public boolean inscreverParticipante(String s) {
        if (participantes.size() < 30){
            participantes.add(s);
            return true;
        }else{
            return false;
        }
    }
}
