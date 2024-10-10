package com.atividade;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        float salario;

        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu salário: "));

        while (true) { 
            float vlrEmprestimo = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que deseja emprestado (ou digite 0 para sair): "));
            
            if (vlrEmprestimo == 0) {
                JOptionPane.showMessageDialog(null, "Saindo do programa.");
                break;
            }
            
            float limiteEmprestimo = salario * 0.30f;

            if (vlrEmprestimo <= limiteEmprestimo) {
                JOptionPane.showMessageDialog(null, "Empréstimo concedido. Valor aprovado: " + vlrEmprestimo);
                
                int parcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de parcelas que deseja pagar: "));
                
                float valorTotal = vlrEmprestimo * (float) Math.pow(1.1, parcelas); 
                float valorParcela = valorTotal / parcelas;

                String mensagem = String.format(
                    "Valor do Empréstimo: %.2f\n" +
                    "Quantidade de Parcelas: %d\n" +
                    "Valor de Cada Parcela: %.2f\n" +
                    "Valor Total Pago ao Final: %.2f",
                    vlrEmprestimo, parcelas, valorParcela, valorTotal
                );

                JOptionPane.showMessageDialog(null, mensagem);
            } else {
                JOptionPane.showMessageDialog(null, "Empréstimo negado. O valor solicitado ultrapassa 30% do seu salário.");
            }
        }
    }
}
