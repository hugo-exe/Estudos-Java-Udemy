import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int codigo, quantidade;
        double total;

        codigo = scn.nextInt();
        quantidade = scn.nextInt();

        if (codigo == 1) {
            total = quantidade * 4.00;
        } else if (codigo == 2) {
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            total = quantidade * 5.00;
        } else if (codigo == 4) {
            total = quantidade * 2.00;
        } else {
            total = quantidade * 1.50;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        scn.close();

    }
}
