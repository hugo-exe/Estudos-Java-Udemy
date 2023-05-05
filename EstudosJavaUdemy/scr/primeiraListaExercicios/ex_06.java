package primeiroExercicioCurso;

import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A = scn.nextDouble();
        B = scn.nextDouble();
        C = scn.nextDouble();

        triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("triangulo: %.3f%n", triangulo);
		System.out.printf("circulo: %.3f%n", circulo);
		System.out.printf("trapezio: %.3f%n", trapezio);
		System.out.printf("quadrado: %.3f%n", quadrado);
		System.out.printf("retangulo: %.3f%n", retangulo);
		
		scn.close();


    }
}
