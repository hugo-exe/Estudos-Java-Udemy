import java.util.Scanner;

public class ex_06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double N;

        N = scn.nextDouble();

        if (N < 0.0 || N > 100.0) {
            System.out.println("Fora do intervalo");
        } else if (N <= 25.0) {
            System.out.println("Intervalo (0,25)");
        } else if (N <= 50.0) {
            System.out.println("Intervalo (25,50)");
        } else if (N <= 75.0) {
            System.out.println("Intervalo (50,75)");
        } else {
            System.out.println("Intervalo (75,100)");
        }

        scn.close();
    }
}