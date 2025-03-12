package com.unicsul.tadnumjava;
import java.util.Scanner;

public class TadNumJava {

    public static void main(String[] args) {
        //CRIAÇÃO DOS OBJETOS
        Scanner scn = new Scanner(System.in);
        Numero numero = new Numero();
        while (true){
            System.out.println("0 - Fim do Programa");
            System.out.println("Digite um valor: ");
            System.out.println("2 - Atribua um novo valor: ");
            
            System.out.println("Qual a sua opção: ");
            int opc = scn.nextInt();
            
            if(opc == 0) {
                break;
            }
            else if (opc == 1){
                System.out.println("\n\n" +numero.getValor()+"\n\n");
            }
            else if (opc == 2){
                System.out.print("Forneça o novo valor");
                float v = scn.nextFloat();
                numero.setValor(v);
            }
            
        }
        System.out.println("Finalizado o programa");
       
    }
}
