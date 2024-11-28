//Leia uma matriz 6x6, conte e escreva quantos valores maiores que 10 ela possui.

package listaMatrizDois;

public class Matriz6x6 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36}};

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.print(matriz [linha] [coluna] + ", ");
            }
        }

        int contador = 0;
        StringBuilder valoresMaioresQueDez = new StringBuilder();
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz.length; col++) {
                if (matriz[lin][col] > 10) {
                    contador++;
                    valoresMaioresQueDez.append(matriz[lin][col]).append(" "); }
            }
        }

        System.out.println("\nA matriz possui " + contador + " maiores que 10");
        System.out.println("Os numeros maiores que 10 da matriz são: " + valoresMaioresQueDez);

    }
}