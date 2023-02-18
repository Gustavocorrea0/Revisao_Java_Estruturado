import java.util.Scanner;

public class Exercicio6 {
    public static Scanner capturaDeDados = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        System.out.println("Digite um numero: ");
        numero = capturaDeDados.nextInt();
        int calculo = 11;
        System.out.println("Esta é a tabuada do " + numero);
        for (int i = 0; i < calculo; i++) {
            System.out.println(numero + " x " + i + " = " + (i * numero));
        }
    }
}
