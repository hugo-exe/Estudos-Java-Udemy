package primeiroExercicioCurso;

import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a, b, c, d, conta;

        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();
        d = scn.nextInt();

        conta = a * b - c * d;

        System.out.println("Diferença = " + conta);

        scn.close();
    }
}
