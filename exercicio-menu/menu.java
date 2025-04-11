// RGM: 38392267
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("\nOlá, " + nome + "! Veja nosso menu:");

        double total = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n---------------- CARDÁPIO ----------------");
            System.out.println("3 - X-Burguer ......... R$ 10,00");
            System.out.println("38 - X-Salada ......... R$ 12,00");
            System.out.println("383 - X-Especial ...... R$ 15,00");
            System.out.println("3839 - X-Bacon ........ R$ 15,00");
            System.out.println("2 - Refrigerante ...... R$ 7,00");
            System.out.println("22 - Suco Natural ..... R$ 10,00");
            System.out.println("226 - Sorvete ......... R$ 6,00");
            System.out.println("2267 - Torta de Limão . R$ 10,00");
            System.out.println("0 - Finalizar pedido");
            System.out.println("------------------------------------");

            System.out.print("\nDigite o código do item: ");
            int codigo = scanner.nextInt();

            if (codigo == 0) {
                continuar = false;
                continue;
            }

            String item = "";
            double preco = 0;

            switch (codigo) {
                case 3: item = "X-Burguer"; preco = 10; break;
                case 38: item = "X-Salada"; preco = 12; break;
                case 383: item = "X-Especial"; preco = 15; break;
                case 3839: item = "X-Bacon"; preco = 15; break;
                case 2: item = "Refrigerante"; preco = 7; break;
                case 22: item = "Suco Natural"; preco = 10; break;
                case 226: item = "Sorvete"; preco = 6; break;
                case 2267: item = "Torta de Limão"; preco = 10; break;
                default:
                    System.out.println("Código inválido!");
                    continue;
            }

            System.out.print("Quantidade de " + item + ": ");
            int qtd = scanner.nextInt();

            double subtotal = preco * qtd;
            total += subtotal;

            System.out.printf("\n%d x %s = R$ %.2f\n", qtd, item, subtotal);
            System.out.printf("Total: R$ %.2f\n", total);

            System.out.print("\nAdicionar mais itens? (S/N) ");
            String resposta = scanner.next().toLowerCase();

            if (resposta.equals("n")) {
                continuar = false;
            }
        }

        System.out.println("\n=========== PEDIDO FINAL ===========");
        System.out.println("Cliente: " + nome);
        System.out.printf("Total a pagar: R$ %.2f\n", total);
        System.out.println("\nObrigado pela preferência");

        scanner.close();
    }
}