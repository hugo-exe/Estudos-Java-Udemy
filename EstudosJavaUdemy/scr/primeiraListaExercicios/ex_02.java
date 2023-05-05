package primeiroExercicioCurso;

import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double pi = 3.14159;
        double r, raio;

        r = scn.nextDouble();
        raio = pi * r * r;

        System.out.printf("A soma do raio do quadrado é: %.4f%n", raio);

        scn.close();
    }
}
