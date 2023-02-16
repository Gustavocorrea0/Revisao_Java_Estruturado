import java.util.Scanner;

public class Exercicio3 {
    static Scanner capturaDeDados = new Scanner(System.in);

    public static void main(String[] args) {
        int provaUm;
        int provaDois;
        int projeto;
        String nomeDoAluno;

        System.out.println("+---------------------------------------------------------+");
        System.out.println("|              Calculo de Situção da Escolar              |");
        System.out.println("+---------------------------------------------------------+");
        System.out.println("| > Qual é o nome do Aluno: ");
        nomeDoAluno = capturaDeDados.next();

        System.out.println("+---------------------------------------------------------+");
        System.out.println("| > Entre com a nota da primeira prova (de 0 a 10): ");
        provaUm = capturaDeDados.nextInt();

        if (provaUm > 10 || provaUm < 0) {
            do {
                System.out.println("+---------------------------------------------------------+");
                System.out.println("|    A nota da primeira prova está em formato inválido    |");
                System.out.println("+---------------------------------------------------------+");
                System.out.println("| > Entre com a nota da primeira prova (de 0 a 10):");
                provaUm = capturaDeDados.nextInt();
            } while (provaUm > 10 || provaUm < 0);
        }

        System.out.println("+---------------------------------------------------------+");
        System.out.println("| > Entre com a nota da Segunda prova (de 0 a 10): ");
        provaDois = capturaDeDados.nextInt();

        if (provaDois > 10 || provaDois < 0) {
            do {
                System.out.println("+---------------------------------------------------------+");
                System.out.println("|    A nota da segunda prova está em formato inválido     |");
                System.out.println("+---------------------------------------------------------+");
                System.out.println("| > Entre com a nota da Segunda prova (de 0 a 10): ");
                provaDois = capturaDeDados.nextInt();
            } while (provaDois > 10 || provaDois < 0);
        }

        System.out.println("+---------------------------------------------------------+");
        System.out.println("| > Entre com a nota do Projeto (de 0 a 10): ");
        projeto = capturaDeDados.nextInt();

        if (projeto > 10 || projeto < 0) {
            do {
                System.out.println("+---------------------------------------------------------+");
                System.out.println("|        A nota da Projeto está em formato inválido       |");
                System.out.println("+---------------------------------------------------------+");
                System.out.println("| > Entre com a nota do Projeto (de 0 a 10): ");
                projeto = capturaDeDados.nextInt();
            } while (projeto > 10 || projeto < 0);
        }

        int resultadoDeProvas = (provaUm + provaDois) / 2;
        double notaDeProva = resultadoDeProvas * 0.7;
        double notaDeProjeto = projeto * 0.3;
        double mediaFinal = notaDeProjeto + notaDeProva;

        if (mediaFinal >= 6.0){
            System.out.println("+---------------------------------------------------------+");
            System.out.println("| Aluno: " + nomeDoAluno + " | Média Final: " + mediaFinal + " | Situação: Aprovado");
            System.out.println("+---------------------------------------------------------+");
        } else if (mediaFinal < 6.0) {
            System.out.println("+---------------------------------------------------------+");
            System.out.println("| Aluno: " + nomeDoAluno + " | Média Final: " + mediaFinal + " | Situação: Reprovado");
            System.out.println("+---------------------------------------------------------+");
        }
    }
}
