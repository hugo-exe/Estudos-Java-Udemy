import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N;

        N = scn.nextInt();

        if (N < 0) {
            System.out.println("Esse número é negativo");
        } else {
            System.out.println("Esse número é positivo");
        }

        scn.close();

    }
}
