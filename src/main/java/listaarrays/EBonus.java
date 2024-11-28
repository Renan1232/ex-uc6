package listaarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EBonus {
    public static void main(String[] args) {
        int[] numeros = {1,5,7,2,6,10,23,55,20,35};
        int ordenar = 0;

        for(int x = 0; x < numeros.length; x++){
            for(int z = 0; z < numeros.length; z++){
                if(numeros[x] < numeros[z]){
                    ordenar = numeros[x];
                    numeros[x] = numeros[z];
                    numeros[z] = ordenar;
                }
            }
        }

        System.out.println(Arrays.toString(numeros));

    }
}
