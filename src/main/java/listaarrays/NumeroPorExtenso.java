package listaarrays;

import java.util.Scanner;

public class NumeroPorExtenso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número entre 0 e 100:");
        int numero = scanner.nextInt();

        if (numero < 0 || numero > 100) {
            System.out.println("Número fora do intervalo permitido.");
        } else {
            System.out.println("O número por extenso é: " + numeroPorExtenso(numero));
        }

        scanner.close();
    }

    public static String numeroPorExtenso(int numero) {
        String[] unidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
                "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};
        String[] dezenas = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
        String cem = "cem";

        if (numero < 20) {
            return unidades[numero];
        } else if (numero < 100) {
            int dezena = numero / 10;
            int unidade = numero % 10;
            if (unidade == 0) {
                return dezenas[dezena];
            } else {
                return dezenas[dezena] + " e " + unidades[unidade];
            }
        } else {
            return cem;
        }
    }
}
