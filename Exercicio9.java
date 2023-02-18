import java.util.Random;

public class Exercicio9 {

    public static void main(String[] args) {
        
        int[][] imagemUm = new int[10][10];
        Random geradorDeNumeros = new Random();

        for (int i = 0; i < imagemUm.length; i++) {
            for (int j = 0; j < imagemUm[i].length; j++) {
                imagemUm[i][j] = geradorDeNumeros.nextInt(255) + 1;
            }
        }

        for (int i = 0; i < imagemUm.length; i++) {
            for (int j = 0; j < imagemUm[i].length; j++) {
                System.out.print(imagemUm[i][j] + " ");
            }
            System.out.println();
        }

    }
}
