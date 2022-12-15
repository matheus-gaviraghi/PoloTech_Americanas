package repeticaoArray;

import java.util.Scanner;

public class OperacoesNumeros {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[5];
		for(int indice=0; indice<numeros.length; indice++) {
			System.out.println("Digite um numero inteiro: ");
			numeros[indice] = scanner.nextInt();
		}
		
		int valorMax = Integer.MIN_VALUE;
		int valorMin = Integer.MAX_VALUE;
		double soma = 0;
		
		for(int numero: numeros) {
			if(numero>valorMax) {
				valorMax = numero;
			}
			if(numero<valorMin) {
				valorMin = numero;
			}
			soma += numero;
		}
		
		System.out.println("Valor maximo informado: " + valorMax);
		System.out.println("Valor minimo informado: " + valorMin);
		System.out.println("Media dos valores informados: " + soma/numeros.length);
	}
}
