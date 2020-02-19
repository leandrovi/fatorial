package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 30. FATORIAL
        // Faça um programa que solicite um número e exiba o fatorial deste número.
        // ex.
        // 5! = 5*4*3*2*1 = 120
        // Lembre-se: pode ser também 1*2*3*4*5 = 120.
        // Não precisa ir exibindo as multiplicações. Basta exibir o valor final.

        double numero, fatorial;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatoral: ");
        numero = scan.nextInt();

        System.out.println();

        fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.println(numero + "! = " + fatorial);
        scan.nextInt();
    }
}