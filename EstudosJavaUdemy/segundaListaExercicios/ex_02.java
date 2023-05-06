import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N;

        N = scn.nextInt();

        if (N % 2 == 0) {
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é impar");
        }
        
        scn.close();

    }
}
