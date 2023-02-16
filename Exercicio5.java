import java.util.Scanner;

public class Exercicio5 {
    public static Scanner capturaDeDados = new Scanner(System.in);

    public static void main(String[] args) {
        String senha;
        String loginRecebido;
        int tentativas = 2;
        int contador = 1;

        System.out.println("+---------------------------------+");
        System.out.println("|        Acesso ao Sistema        |");
        System.out.println("+---------------------------------+");
        System.out.println("| > Qual o seu login: ");
        loginRecebido = capturaDeDados.next();

        while (contador < 3) {
            System.out.println("+---------------------------------+");
            System.out.println("| > Digite a Senha: ");
            senha = capturaDeDados.next();

            if (senha.equals("batatinha123")) {
                System.out.println("+---------------------------------+");
                System.out.println("|        Acesso Permitido         |");
            } else {
                if (tentativas == 0) {
                    System.out.println("+---------------------------------+");
                    System.out.println("|   Você Não tem mais tentativas  |");
                    System.out.println("|        Sistema Bloqueado        |");
                    System.out.println("+---------------------------------+");
                    System.exit(0);
                    break;
                } else {
                    System.out.println("+---------------------------------+");
                    System.out.println("|          Senha Incorreta        | ");
                    System.out.println("+---------------------------------+");
                    System.out.println("|  Restam " + (tentativas--) + " tentativa(s)!   |");
                }
            }
        }
    }
}
