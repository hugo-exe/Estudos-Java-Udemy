import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int HoraInicial, HoraFinal;
        int DuracaoFinal;

        HoraInicial = scn.nextInt();
        HoraFinal = scn.nextInt();

        if (HoraInicial < HoraFinal) {
            DuracaoFinal = HoraFinal - HoraInicial;
        } else {
            DuracaoFinal = 24 - HoraInicial + HoraFinal;
        }

        System.out.println("O jogo teve duração de " + DuracaoFinal + " hora(s)");

        scn.close();

    }
}
