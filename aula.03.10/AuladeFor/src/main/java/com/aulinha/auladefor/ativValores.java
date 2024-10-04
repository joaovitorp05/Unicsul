package com.aulinha.auladefor;
import javax.swing.JOptionPane;

public class ativValores {

    
    public static void main(String[] args) {
        float valor1, valor2, valor3;
        valor1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor"));
        valor2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor"));
        valor3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o terceiro valor"));
      
        if (valor1 == valor2 && valor2 == valor3){
            JOptionPane.showMessageDialog(null, "O valor é um equilatero");
        } else {
             if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3){
                 JOptionPane.showMessageDialog(null, "O valor é um isosceles");
             } else {
                 JOptionPane.showMessageDialog(null, "Os valores formam um triângulo escaleno.");
             }
        }
    }
    
}
