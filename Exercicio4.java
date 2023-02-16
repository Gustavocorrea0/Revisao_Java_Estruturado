import java.util.Scanner;

public class Exercicio4 {
    static Scanner capturaDeDados = new Scanner(System.in);

    public static void main(String[] args) {
        String genero;
        boolean controleDegenero;
        int idade;
        int tempoDeContribuicao;

        do {
            System.out.println("+----------------------------------------------------------+");
            System.out.println("|            Calculo de Tempo para aposentadoria           |");
            System.out.println("+----------------------------------------------------------+");
            System.out.println("|                   Qual seu seu gênero:                   |");
            System.out.println("|                    M - Para Maculino                     |");
            System.out.println("|                    F - Para Feminino                     |");
            System.out.println("| > ");
            genero = capturaDeDados.next();

            controleDegenero = !genero.equalsIgnoreCase("M") && !genero.equalsIgnoreCase("F");

            if (controleDegenero) {
                System.out.println("+----------------------------------------------------------+");
                System.out.println("|                      Opção Inválida                      |");
            } else if (genero.equalsIgnoreCase("F")) {
                System.out.println("+----------------------------------------------------------+");
                System.out.println("|                   Seu gênero é Feminino                  |");
                System.out.println("+----------------------------------------------------------+");
                System.out.println("| > Qual a sua idade: ");
                idade = capturaDeDados.nextInt();
                System.out.println("| > Qual o seu tempo de Contribuição: ");
                tempoDeContribuicao = capturaDeDados.nextInt();

                if (tempoDeContribuicao < 30) {
                    System.out.println("Você não pode se aposentar, pois, não possui o tempo mínino de 30 anos de contribuição");
                    System.exit(0);
                }

                int soma = tempoDeContribuicao + idade;

                if (soma >= 89) {
                    System.out.println("+----------------------------------------------------------+");
                    System.out.println("|               Você pode se aposentar este Ano            |");
                    System.out.println("+----------------------------------------------------------+");
                } else if (soma < 89) {
                    System.out.println("+----------------------------------------------------------+");
                    System.out.println("|           Você não pode se aposentar este ano            |");
                    System.out.println("|       Pois não possui o tempo necessário para tal        |");
                    System.out.println("+----------------------------------------------------------+");
                }

            } else if (genero.equalsIgnoreCase("M")) {
                System.out.println("+----------------------------------------------------------+");
                System.out.println("|                  Seu gênero é Masculino                  |");
                System.out.println("+----------------------------------------------------------+");
                System.out.println("| > Qual a sua idade: ");
                idade = capturaDeDados.nextInt();
                System.out.println("| > Qual o seu tempo de Contribuição: ");
                tempoDeContribuicao = capturaDeDados.nextInt();

                int minContribuicaoMasculina = 35;

                if (tempoDeContribuicao < minContribuicaoMasculina) {
                    System.out.println("+----------------------------------------------------------+");
                    System.out.println("|           Você não pode se aposentar este ano            |");
                    System.out.println("| Pois não possui o tempo mínino de contribuição (35 anos) |");
                    System.out.println("+----------------------------------------------------------+");
                    System.exit(0);
                }

                int soma = tempoDeContribuicao + idade;
                int somaNecesssaria = 99;

                if (soma >= somaNecesssaria) {
                    System.out.println("+----------------------------------------------------------+");
                    System.out.println("|               Você pode se aposentar este Ano            |");
                    System.out.println("+----------------------------------------------------------+");
                } else if (soma < somaNecesssaria) {
                    System.out.println("+----------------------------------------------------------+");
                    System.out.println("|           Você não pode se aposentar este ano            |");
                    System.out.println("|       Pois não possui o tempo necessário para tal        |");
                    System.out.println("+----------------------------------------------------------+");
                }
            }
        } while (controleDegenero);
    }
}
