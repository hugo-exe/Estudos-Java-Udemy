package primeiroExercicioCurso;

import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int nf, nht;
        double vht, salario;

        nf = scn.nextInt();
        nht = scn.nextInt();
        vht = scn.nextDouble();

        salario = vht * nht;

        System.out.println("Número do funcionário: " + nf);
        System.out.printf("Salário: R$ %.2f%n", salario);

        scn.close();
    }
}
