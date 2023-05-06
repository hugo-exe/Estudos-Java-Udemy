import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int A, B;

        A = scn.nextInt();
        B = scn.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        scn.close();

    }
}
