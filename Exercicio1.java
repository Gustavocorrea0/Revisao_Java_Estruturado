import java.util.Scanner;

public class Exercicio1 {
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
        int pontosNecessarios;
        int vitoria = 3;

        difereca = lider - lanterna;
        pontosNecessarios = difereca / vitoria;

        if (pontosNecessarios == 1){
            System.out.println("+-----------------------------------------------+");
            System.out.println("| O Lanterna deve conseguir: " + pontosNecessarios + " Vitoria");
            System.out.println("+-----------------------------------------------+");
        } else if (pontosNecessarios == 0) {
            System.out.println("+-----------------------------------------------+");
            System.out.println("|   O Lanterna e Lider tem a mesma Pontuação    |");
            System.out.println("+-----------------------------------------------+");
        } else {
            System.out.println("+-----------------------------------------------+");
            System.out.println("| O Lanterna deve conseguir: " + pontosNecessarios + " Vitorias ");
            System.out.println("+-----------------------------------------------+");
        }
    }
}
