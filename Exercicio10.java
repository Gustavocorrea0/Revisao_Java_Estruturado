import java.util.Scanner;

public class Exercicio10 {
    public static Scanner capturaDeDados = new Scanner(System.in);

    private static int[][] estacionamento;
    public int vagas;
    static String placa;
    static int posicaoDaVaga;
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        Exercicio10 estacionamento = new Exercicio10(2);

        String opcao;
        do {
            System.out.println("+-----------------------------------+");
            System.out.println("|    Controle do Estacionamento     |");
            System.out.println("+-----------------------------------+");
            System.out.println("|       1 - Adicionar Carro         |");
            System.out.println("|       2 - Liberar Carro           |");
            System.out.println("|       3 - Verificar Status        |");
            System.out.println("|       9 - Sair                    |");
            System.out.println("| > Qual opção desejada: ");
            opcao = capturaDeDados.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("+-----------------------------------+");
                    System.out.println("|          Adicionar Carro          |");
                    String placa;
                    int posicaoDaVaga;
                    System.out.println("| > Qual a Placa do Veiculo: ");
                    placa = capturaDeDados.nextLine();
                    System.out.println("| > Qual a Vaga desejada: ");
                    posicaoDaVaga = capturaDeDados.nextInt();

                    if (estacionamento.vagaComVeiculo(placa, posicaoDaVaga)){
                        System.out.println(" Vaga Com Veiculo");
                    } else {
                        estacionamento.addVeiculoAVaga(placa, posicaoDaVaga);
                        menu();
                    }
                    break;
                case "2":
                    System.out.println("+-----------------------------------+");
                    System.out.println("|          Liberar Carro            |");
                    System.out.println("Qual a placa do Veiculo");
                    placa = capturaDeDados.nextLine();

                    System.out.println("Qual a vaga do Veiculo");
                    posicaoDaVaga = capturaDeDados.nextInt();
                    if (!estacionamento.vagaComVeiculo(placa, posicaoDaVaga )){
                        System.out.println("Não ha carro nesta vaga");
                    } else {
                        estacionamento.limparVaga(placa, posicaoDaVaga);
                    }
                    break;
                case "3":
                    statusEstacionamento();
                    break;
                case "9":
                    break;
                default:
                    System.out.println("+-----------------------------------+");
                    System.out.println("|          OPÇÃO INVÁLIDA           |");
                    System.out.println("+-----------------------------------+");
                    break;
            }
        } while (opcao == "9");
    }

    public Exercicio10(int vagas) {
        this.vagas = vagas;
        this.estacionamento = new int[vagas][5];
    }

    public static void statusEstacionamento() {
        System.out.println("+-----------------------------------+");
        System.out.println("|       Placa      |     Posição    |");
        for (int p = 0; p < estacionamento.length; p++) {
            for (int v = 0; v < estacionamento[p].length; v++) {
                System.out.println(estacionamento[p][v] + "");
            }
            System.out.println();
        }
    }

    public boolean vagaComVeiculo(String placa, int numeroDaVaga){
        return estacionamento[Integer.parseInt(placa)][numeroDaVaga] != 0;
    }

    public static void addVeiculoAVaga(String placa, int numeroDaVaga){
        estacionamento[Integer.parseInt(placa)][numeroDaVaga] = 1;
        System.out.println("Vaga:" + numeroDaVaga + " | Placa: " + placa + " | Possui Veiculo |");
    }

    public static void limparVaga(String placa, int numeroDaVaga){
        estacionamento[Integer.parseInt(placa)][numeroDaVaga] = 0;
        System.out.println("Vaga:" + numeroDaVaga + " | Placa: " + placa + " | Não Possui Veiculo |");
    }
}
