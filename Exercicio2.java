import java.util.Scanner;

public class Exercicio2 {
    static Scanner capturaDeDados = new Scanner(System.in);

    public static void main(String[] args) {
        int lider;
        int lanterna;

        System.out.println("+-----------------------------------------------+");
        System.out.println("|   Calculo de Vitorias para Alcançar o Lider   |");
        System.out.println("+-----------------------------------------------+");
        System.out.println("| > Qual a pontuação de lider ?: ");
        lider = capturaDeDados.nextInt();
        System.out.println("| > Qual a pontuação do time que busca o lider ?: ");
        lanterna = capturaDeDados.nextInt();
        if (lider < lanterna) {
            do {
                System.out.println("+-----------------------------------------------+");
                System.out.println("|                Forma Inválida!!!              |");
                System.out.println("|     O Lanterna tem menos pontos que o Vice    |");
                System.out.println("| > Qual a pontuação de lider ?: ");
                lider = capturaDeDados.nextInt();
                System.out.println("| > Qual a pontuação do time que busca o lider ?: ");
                lanterna = capturaDeDados.nextInt();
            } while (lider <= lanterna);
        }

        int difereca;
        int vitoriasNecessarias;
        int vitoria = 3;

        difereca = lider - lanterna;
        vitoriasNecessarias = difereca / vitoria;

        if (difereca % 3 == 0) {
            if (vitoriasNecessarias >= 1){
                System.out.println("O Lider deve conseguir " + vitoriasNecessarias + " Vitorias");
            } else if (vitoriasNecessarias <= 2) {
                System.out.println("O Lider deve conseguir " + vitoriasNecessarias + " Vitorias");
            }

        } else if (difereca % 3 == 1){
            if (vitoriasNecessarias >= 1){
                System.out.println("O Lider deve conseguir " + vitoriasNecessarias + " Vitoria e 1 Empate");
            } else if (vitoriasNecessarias <= 2) {
                System.out.println("O Lider deve conseguir " + vitoriasNecessarias + " Vitorias e 1 Empate");
            }

        } else if (difereca % 3 == 2) {
            System.out.println("O Lider deve conseguir " + vitoriasNecessarias + " Vitorias e 2 Empates");
        }

    }
}
