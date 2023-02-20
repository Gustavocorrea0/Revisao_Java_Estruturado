import java.util.Scanner;

public class Exercicio8 {
    public static Scanner capturaDeDados = new Scanner(System.in);
    public static void main(String[] args){

        String frase;
        String fraseInvertida = "";
        int local = 0;

        System.out.println("+-----------------------------------------+");
        System.out.println("| > Digite uma Frase: ");
        frase = capturaDeDados.nextLine();

        int tamanhoDaFrase = frase.length();

        for (int i = tamanhoDaFrase - 1; i >= 0; i-- ){
            fraseInvertida += frase.charAt(i);
        }

        System.out.println("+-----------------------------------------+");
        System.out.println("| Frase Invertida: " + fraseInvertida);



        String fraseSemEspaco = frase.trim().replaceAll("\\s+"," ");

        if (fraseSemEspaco.equals(fraseInvertida)){
            System.out.println("+-----------------------------------------+");
            System.out.println("|        Esta frase é um palíndromo       ");
        } else {
            System.out.println("+-----------------------------------------+");
            System.out.println("|     Esta frase não é um palíndromo      ");
        }

        System.out.println("+-----------------------------------------+");
        System.out.println("| A frase possui " + tamanhoDaFrase + " caracteres");

        for (int f = 0; f < frase.length(); f++){
            if (frase.charAt(f) == 'a'){
                local = f;
                break;
            }
        }

        if (local != -1){
            System.out.println("+-----------------------------------------+");
            System.out.println("| A primeira letra A esta na posição: " + local);

        } else {
            System.out.println("+-----------------------------------------+");
            System.out.println("|       A Frase não possui letra A        ");
        }


        System.out.println("+-----------------------------------------+");
        System.out.println("| Frase em letras maiúsculas: " + frase.toUpperCase() );

    }
}
