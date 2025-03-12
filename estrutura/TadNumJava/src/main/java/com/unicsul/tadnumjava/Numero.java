package com.unicsul.tadnumjava;

public class Numero {
    private float valor;

    public Numero() {
        this.valor = 0;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        if (valor < 0) {
            valor = 0;
            msg("Valor menor que zero - igual a zero");
        } else if (valor > 40 && valor < 50) {
            valor = 40;
            msg("Valor incorreto alterado para 40");
        } else if (valor < 50) {
            valor = 40;
            msg("Valor incorreto alterado para 40");
        } else if (valor > 100) {
            valor = 100;
            msg("Valor maior que 100 - corrigido para 100");
        } else {
            valor = 60;
            msg("Valor incorreto alterado para 60");
        }
        
        this.valor = valor;
        System.out.println("Novo valor atribuído");
    }

    private void msg(String texto) {
        System.out.println("\n\nATENÇÃO: " + texto + "\n\n");
    }
}
