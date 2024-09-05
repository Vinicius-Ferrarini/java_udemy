package org.example;

import java.security.SecureRandom;

public class GeradorDeSenhas {
    private static final String LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String LETRAS_MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private static final String SIMBOLOS = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    private static SecureRandom random = new SecureRandom();

    public String gerarSenha(int tam,boolean letraMinuscula,boolean letraMausculas, boolean numeros,boolean simbolos){
        if(tam < 1){
            return "";
        }

        String possiveisCaracteres ="";
        if (letraMinuscula){
            possiveisCaracteres += LETRAS_MINUSCULAS;
        }
        if (letraMausculas){
            possiveisCaracteres += LETRAS_MAIUSCULAS;
        }
        if (numeros){
            possiveisCaracteres += NUMEROS;
        }
        if (simbolos){
            possiveisCaracteres += SIMBOLOS;
        }
        String senha ="";
        for (int i = 0;i < tam;i++){
            int index = random.nextInt(possiveisCaracteres.length());
            senha += possiveisCaracteres.charAt(index);
        }

        return senha;
    }

}
