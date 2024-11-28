//Leia uma matriz 3x3 com valores positivos e negativos.
//Após a entrada de dados, deve realizar a soma dos positivos e negativos,
//imprimindo na tela.

package listaMatrizDois;

public class Matriz3x3 {
    public static void main(String[] args) {
        int[][] matriz = {{10, 20, 50},
                            {-5, 8, 7},
                        {-20, -15, 3}};

        int resultado = 0;
        int num = 0;

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.print(matriz [linha] [coluna] + ", ");
                resultado += matriz [linha] [coluna];
            }
        }

        System.out.println("\n" + resultado);
    }



}
