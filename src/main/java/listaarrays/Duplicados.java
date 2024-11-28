package listaarrays;

//Escreva um programa que identifique e imprima todos os elementos duplicados em um array.

public class Duplicados {

    public static void main(String[] args) {
        int[] elementos = {1, 2, 3, 3, 4, 5, 10, 10, 20, 35, 20, 50, 100, 156, 158, 190, 100};

        int contador = 0;

        for (int elemento : elementos) {
            for (int verificacao : elementos) {
                if (elemento == verificacao) {
                    contador++;
                }
            }

            if (contador >= 2) {
                System.out.println("Elemento duplicado: " + elemento);
            }

            contador = 0;

        }

    }
}
