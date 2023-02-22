import java.util.Scanner;

public class Exercicio11 {
    static Scanner capturaDeDados = new Scanner(System.in);

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu(){
        String escolha;
        do {

            System.out.println("+------------------------------------------+");
            System.out.println("|           Escolha de Exercícios          |");
            System.out.println("+------------------------------------------+");
            System.out.println("|            1 - Exercício 1               |");
            System.out.println("|            2 - Exercício 2               |");
            System.out.println("|            3 - Exercício 3               |");
            System.out.println("|            4 - Exercício 4               |");
            System.out.println("|            5 - Exercício 5               |");
            System.out.println("|            6 - Exercício 6               |");
            System.out.println("|            7 - Exercício 7               |");
            System.out.println("|            8 - Exercício 8               |");
            System.out.println("|            9 - Exercício 9               |");
            System.out.println("|           10 - Exercício 10              |");
            System.out.println("|                S - Sair                  |");
            System.out.println("+------------------------------------------+");
            System.out.println("| > Qual a opção desejada: ");
            escolha = capturaDeDados.nextLine();

            switch (escolha) {
                case "1":
                    Exercicio1.CalculoDeVitorias();
                    break;
                case "2":
                    Exercicio2.CalaculoDeVitoriasComEmpate();
                    break;
                case "3":
                    Exercicio3.CalculoDeMedia();
                    break;
                case "4":
                    Exercicio4.CalculoDeAposentadoria();
                    break;
                case "5":
                    Exercicio5.SistemaDeLoginESenha();
                    break;
                case "6":
                    Exercicio6.CriadorDeTabuada();
                    break;
                case "7":
                    Exercicio7.LencamentoDeDados();
                    break;
                case "8":
                    Exercicio8.Frases();
                    break;
                case "9":
                    Exercicio9.Imagem();
                    break;
                case "10":
                    Exercicio10.SistemaDoEstacionamento();
                    break;
                case "s":
                    System.out.println("+------------------------------------------+");
                    System.out.println("|                 Saindo...                |");
                    System.out.println("+------------------------------------------+");
                    System.exit(0);
                default:
                    System.out.println("+------------------------------------------+");
                    System.out.println("|               Opção Inválida             |");
                    System.out.println("+------------------------------------------+");
            }
        } while (escolha.equalsIgnoreCase("s"));
    }
}

