package listaarrays;

//Crie um programa que leia um array de números inteiros e encontre o
//maior e o menor valor presente no array.

import java.util.Arrays;
import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 55, 105, 99, 1057, 5669, 2214, 55321, 552};

        Integer menor = num[0];
        Integer maior = num[0];

        for(var x = 0; x < num.length; x++){
            if(num[x] < menor){
                menor = num[x];
            }

            if (num[x] > maior){
                maior = num[x];
            }
        }

        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);

    }
}
