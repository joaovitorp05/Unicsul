package com.aulinha.auladefor;
import javax.swing.JOptionPane;

public class AuladeFor {

    public static void main(String[] args) {
        float cont, total, nota1, nota2;
        for (cont = 0; cont<=2; cont++){
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
        total = (nota1 + nota2)/2;
        JOptionPane.showMessageDialog(null, "A média é: "+total);
         
        }}
}
