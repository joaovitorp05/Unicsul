package com.aulinha.auladefor;
import java.util.Scanner;

public class Tabuada {

    
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int cont, result = 0;
        System.out.print("Digite um numero: ");
        int num = numero.nextInt();
        for(cont = 0; cont<=10; cont++){
            result = num * cont;
            System.out.println(num+"*"+cont+"="+result);
            
        }
    }
    
}
