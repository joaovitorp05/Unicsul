package com.exercicios;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        float kiloperc, litroconsu, calculokm;
        
        String inputDistancia = JOptionPane.showInputDialog("Digite a distancia percorrida (em km):");
        kiloperc = Float.parseFloat(inputDistancia);

        String inputCombustivel = JOptionPane.showInputDialog("Digite a quantidade de combustivel consumido (em litros):");
        litroconsu = Float.parseFloat(inputCombustivel);

        calculokm = kiloperc / litroconsu;
        JOptionPane.showMessageDialog(null,"Consumo médio do veículo: "+ calculokm + "km/l");
    }
}