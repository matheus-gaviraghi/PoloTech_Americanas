package repeticaoArray;
/*
* 2.Faça um programa que receba dois números inteiros e
*      gere os números inteiros que estão no
*      intervalo compreendido por eles. */

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero1, numero2, temp;
		System.out.println("Digite o primeiro numero: ");
		numero1 = scanner.nextInt();
		System.out.println("Digite o segundo numero: ");
		numero2 = scanner.nextInt();
		
		if(numero1>numero2) {
			temp = numero1;
			numero1 = numero2;
			numero2 = temp;
		}
		
		System.out.println("Numeros no intervalo [%d,%d]:".formatted(numero1,numero2));
		for(int valor=numero1; valor<=numero2; valor++) {
			System.out.print(valor + " ");
		}
		
		
	}
}
