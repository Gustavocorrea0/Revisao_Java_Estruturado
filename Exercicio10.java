import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio10 {
    public static Scanner capturaDeDados = new Scanner(System.in);
    static boolean sistemaEstiverLigado = true;
    private int quantidadeDeVagas;
    private Map<String, Integer> estacionamento;

    public Exercicio10(int quantidadeDeVagas) {
        this.quantidadeDeVagas = quantidadeDeVagas;
        this.estacionamento = new HashMap<>();
    }

    public void statusEstacionamento() {
        String continuar;
        System.out.println("+-------------------------------------------------+");
        System.out.println("|             Vagas Ocupadas e Carros             |");
        System.out.println("+-------------------------------------------------+");
        System.out.println("|          Vaga          |          Placa         |");
        for (String placa : estacionamento.keySet()) {
            System.out.println("|           " + estacionamento.get(placa) + "            |         " + placa + "        |");
        }

        System.out.println("+-------------------------------------------------+");
        System.out.println("|                  Vagas Livres                   |");
        System.out.println("+-------------------------------------------------+");
        if (estacionamento.size() == 9){
            System.out.println("|              Todas Estão Livres                 |");
        } else {
            for (int desocupadas = 0; desocupadas <= quantidadeDeVagas; desocupadas++) {
                boolean vagaComCarro = false;
                for (int vaga : estacionamento.values()) {
                    if (vaga == desocupadas) {
                        vagaComCarro = true;
                        break;
                    }
                    if (!vagaComCarro) {
                        System.out.println("|         Vaga: " + desocupadas + "          |         Vazio        |");
                    }
                }
            }
        }
        System.out.println("+-------------------------------------------------+");
        System.out.println("|       Deseja Continuar Ou Voltar ao Menu ?      |");
        System.out.println("|          (C) Continuar ou (V) Voltar            |");
        System.out.println("| > ");
        continuar = capturaDeDados.nextLine();
        if (continuar.equalsIgnoreCase("C")){
            statusEstacionamento();
        }
    }

    public boolean vagaComVeiculo(int numeroDaVaga) {
        return estacionamento.containsValue(numeroDaVaga);
    }

    public void addVeiculoAVaga(String placa, int numeroDaVaga) {
        estacionamento.put(placa, numeroDaVaga);

        System.out.println("+-------------------------------------------------+");
        System.out.println("|                 Carro Adicionado                |");
        System.out.println("| Vaga:               "  +   numeroDaVaga + " | Placa:          " + placa + " |");
    }

    public void removerCarro(String placa) {
        int numeroDaVaga = estacionamento.remove(placa);
        System.out.println("+-------------------------------------------------+");
        System.out.println("|                  Carro Removido                 |");
        System.out.println("| Vaga:               "  +   numeroDaVaga + " | Placa:          " + placa + " |");
    }


    public static void main(String[] args) {

        Exercicio10 estacionamento = new Exercicio10(9);
        String opcao;
        boolean sair = false;

        while (!sair) {
            System.out.println("+-------------------------------------------------+");
            System.out.println("|             Controle do Estacionamento          |");
            System.out.println("+-------------------------------------------------+");
            System.out.println("|             1 - Adicionar Carro                 |");
            System.out.println("|             2 - Liberar Carro                   |");
            System.out.println("|             3 - Verificar Status                |");
            System.out.println("|             9 - Sair                            |");
            System.out.println("| > Qual opção desejada: ");
            opcao = capturaDeDados.nextLine();

            switch (opcao) {
                case "1":

                    System.out.println("+-------------------------------------------------+");
                    System.out.println("|                 Adicionar Carro                 |");
                    String placa;
                    int posicaoDaVaga;
                    System.out.println("| > Qual a Placa do Veiculo: ");
                    placa = capturaDeDados.nextLine();
                    System.out.println("| > Qual a Vaga desejada: ");
                    posicaoDaVaga = capturaDeDados.nextInt();
                    if (estacionamento.vagaComVeiculo(posicaoDaVaga)) {
                        System.out.println("+-------------------------------------------------+");
                        System.out.println("|                 Vaga com Carro                  |");
                        break;
                    } else {
                        estacionamento.addVeiculoAVaga(placa, posicaoDaVaga);
                        break;
                    }

                case "2":
                        System.out.println("+-------------------------------------------------+");
                        System.out.println("|                   Liberar Carro                 |");
                        System.out.println("| > Qual a placa do Carro");
                        placa = capturaDeDados.nextLine();
                        System.out.println("| > Qual a Vaga do Carro");
                        posicaoDaVaga = capturaDeDados.nextInt();

                        if (!estacionamento.estacionamento.containsKey(placa)) {
                            System.out.println("+-------------------------------------------------+");
                            System.out.println("|             Veiculo não Encontrado              |");
                            System.out.println("+-------------------------------------------------+");
                        } else {
                            estacionamento.removerCarro(placa);
                        }
                    break;
                case "3":
                    estacionamento.statusEstacionamento();
                    break;
                case "9":
                    sairDoSistema();
                    break;
            }
        }
    }

    private static void sairDoSistema() {
        boolean desejaContinuarForInvalido;
        String continuar;
        do {
            System.out.println("+-------------------------------------------------+");
            System.out.println("|      Deseja Continuar? (S) Sim ou (N) Não       |");
            System.out.println("| > ");
            continuar = capturaDeDados.next();
            desejaContinuarForInvalido = !continuar.equalsIgnoreCase("S") && !continuar.equalsIgnoreCase("N");

            if (desejaContinuarForInvalido) {
                System.out.println("+-------------------------------------------------+");
                System.out.println("|                Opção não listada                |");

            } else if (continuar.equalsIgnoreCase("s")) {
                sistemaEstiverLigado = false;
                System.out.println("+-------------------------------------------------+");
                System.out.println("|                     Saindo                      |");
                System.out.println("+-------------------------------------------------+");
                System.exit(0);

            } else if (continuar.equalsIgnoreCase("n")) {
                sistemaEstiverLigado = true;
            }

        } while (desejaContinuarForInvalido);
    }
}