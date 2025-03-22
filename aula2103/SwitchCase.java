public class SwitchCase {
    public static void main(String[] args) {

        int nota = 0;
        switch (nota) {
            case 0,1,2:
                System.out.println("Reprovado");
                break;
            case 3,4,5:
                System.out.println("Exame");
                break;
            case 6,7:
                System.out.println("Aprovado");
                break;
            case 8,9,10:
                System.out.println("Parabéns, APROVADO!");
        }
    }
}
