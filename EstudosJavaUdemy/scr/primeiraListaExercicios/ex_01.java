package primeiroExercicioCurso;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a, b;

        System.out.println("Digite um valor: ");
        a = scn.nextInt();
        System.out.println("Digite um valor: ");
        b = scn.nextInt();

        int soma = a + b;

        System.out.println("A soma é: " + soma);

        scn.close();
    }
}