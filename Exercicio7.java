import java.util.Random;

public class Exercicio7 {
    public static void main(String[] args) {
        Random lancador = new Random();

        int jogadorA = lancador.nextInt(6) + 1;
        int jogadorB = lancador.nextInt(6) + 1;
        System.out.println("+------------------------------------+");
        System.out.println("|  Simulador de Lançamento de Dados  |");
        System.out.println("+------------------------------------+");
        System.out.println("| Jogador A: " + jogadorA + "                       |");
        System.out.println("| Jogador B: " + jogadorB + "                       |");

        if (jogadorA > jogadorB ){
            System.out.println("+------------------------------------+");
            System.out.println("|         O jogador A Ganhou !!!     |");
            System.out.println("+------------------------------------+");
        } else if (jogadorA < jogadorB) {
            System.out.println("+------------------------------------+");
            System.out.println("|        O jogador B Ganhou !!!      |");
            System.out.println("+------------------------------------+");
        } else if (jogadorA == jogadorB) {
            System.out.println("+------------------------------------+");
            System.out.println("|               Empate!!!            |");
            System.out.println("+------------------------------------+");
        }
    }
}
