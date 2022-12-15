package repeticaoArray;

import java.util.Scanner;

public class NumerosParesImpares {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[5];
		for(int indice=0; indice<numeros.length; indice++) {
			System.out.println("Digite um numero inteiro: ");
			numeros[indice] = scanner.nextInt();
		}
		
		System.out.println("\nImpressao dos numeros - primero os impares e depois os pares");
		for(int numero: numeros) {
			if(numero%2==1) {
				System.out.println(numero);
			}
		}
		for(int numero: numeros) {
			if(numero%2==0) {
				System.out.println(numero);
			}
		}

	}
}
