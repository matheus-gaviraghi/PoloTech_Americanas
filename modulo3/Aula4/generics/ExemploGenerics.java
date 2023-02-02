package Aula4.generics;

import Aula2.zoologicoInterface.Comedor;

public class ExemploGenerics {

    public static void main(String[] args) {
        Integer dez = 10;
        Integer vinte = 20;

        Integer maior = maior(dez, vinte);
        Integer menor = menor(dez, vinte);
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }

    public static Integer menor(Integer i1, Integer i2){
        Integer menorNumero = Integer.MAX_VALUE;

        if(i1 < menorNumero){
            menorNumero = i1;
        }

        if(i2 < menorNumero){
            menorNumero = i2;
        }

        return menorNumero;
    }

    public static Integer maior(Integer i1, Integer i2){
        Integer maiorNumero = Integer.MIN_VALUE;

        if(i1 > maiorNumero){
            maiorNumero = i1;
        }

        if(i2 > maiorNumero){
            maiorNumero = i2;
        }

        return maiorNumero;
    }

    public static <T extends Comparable> T maior(T i1, T i2){
        if(i1.compareTo(i2) > 0){
            return i1;
        }
        return i2;
    }
}
