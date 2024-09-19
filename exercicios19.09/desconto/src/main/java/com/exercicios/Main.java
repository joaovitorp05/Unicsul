package com.exercicios;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        float valorprod, calcdesconto;

        String inputValor = JOptionPane.showInputDialog("Digite o valor do produto: ");
        valorprod = Float.parseFloat(inputValor);

        calcdesconto = valorprod * 0.90f;

        JOptionPane.showMessageDialog(null,"Valor com desconto: "+ calcdesconto);

    }
}