package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String[] frutas = {"banana", "pera", "melancia", "uva"};
//
////        for(var x = 0; x < 4; x++) {
////            System.out.println(frutas[x]);
////        }
//
//        for(String fruta : frutas) {
//            System.out.println(fruta);
//        }
//
//
//    }

            String[] matriculas = {"matricula 1: ", "matricula 2: ", "matricula 3: ", "matricula 4: ", "matricula 5: "};
            String[] nomes = {"Ana", "Maria", "Jose", "Jhon", "Dani"};

            for (var x = 0; x < 5; x++){
                    System.out.println(matriculas[x] + nomes[x]);
            }
        }
    }
