package listaMatriz;

public class Exemplo {
    public static void main(String[] args) {

        int[][] matriz = { {0,1,2},
                {3,4,5} };

        System.out.println(matriz[1][0]);

        String[][] hortifruti = { {"acerola", "maca", "jaboticaba", "figo"},
                { "manga", "banana", "laranja", "limao" } };

        for (var linhas = 0; linhas < hortifruti.length; linhas++){
            for (var colunas = 0; colunas < hortifruti[linhas].length; colunas++){
                System.out.println(hortifruti[linhas][colunas]);
            }
        }



    }


}