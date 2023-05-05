package primeiroExercicioCurso;

import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int pecas1, npecas1, pecas2, npecas2;
        double vu1, vu2, contaTotal;

        pecas1 = scn.nextInt();
        npecas1 = scn.nextInt();
        vu1 = scn.nextDouble();

        pecas2 = scn.nextInt();
        npecas2 = scn.nextInt();
        vu2 = scn.nextDouble();

        contaTotal = npecas1 * vu1 + npecas2 * vu2;

        System.out.printf("Valor a ser pago = R$ %.2f%n", contaTotal);

        scn.close();
    }
}
