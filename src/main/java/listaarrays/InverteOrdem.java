package listaarrays;

//Escreva um programa que receba um
//array de números inteiros e retorne a soma de todos os elementos do array

public class InverteOrdem {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int copiaArray: representa o tamanho do vetor original. Ou seja, 10;
        int copiaArray = num.length;
        //int[] numInvertido = new int[copiaArray]: cria um novo vetor/array com o mesmo tamanho do num;
        int[] numInvertido = new int[copiaArray];
        //inicia a posição da array no zero
        int copiaArrayZero = copiaArray - 1;

        for(int x = 0; x < copiaArray; x++){
            numInvertido[x] = num[copiaArrayZero - x];
            System.out.println(numInvertido[x]);
        }
    }
}
