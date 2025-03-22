import java.util.Scanner;

public class CalculadoraComplexa {
    Scanner scanner = new Scanner(System.in);

    public void interacao(){
        System.out.println("Seja bem vindo ao sistema de calculo de Bhaskara");
        System.out.println("Voce deverá digitar tres numeros (a, b, c) para o calculo ser realizado ");
        System.out.println("Digite o primeiro número: ");
        float a = scanner.nextFloat();

        System.out.println("Digite o segundo número: ");
        float b = scanner.nextFloat();

        System.out.println("Digite o terceiro número: ");
        float c = scanner.nextFloat();

        System.out.println(bhaskara(a, b, c));
    }
    public String bhaskara(float a, float b, float c){
        double delta = Math.pow(b, 2) - 4 * a * c;

        double x1 = (-b + Math.sqrt(delta))/ 2 * a;
        double x2 = (-b - Math.sqrt(delta))/ 2 * a;
        return "O delta é " + delta + "\n" + "As raízes são: x' = " + x1 + "x'' = " + x2;
    }
}
