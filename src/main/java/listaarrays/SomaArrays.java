package listaarrays;

//Escreva um programa que receba um array de números inteiros e
//retorne a soma de todos os elementos do array

public class SomaArrays {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40};

        Integer soma = 0;

        for (var x = 0; x < num.length; x++){
            soma += num[x];
        }

        System.out.println("A soma total do array é: " + soma);
    }
}
