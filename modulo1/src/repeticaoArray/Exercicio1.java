package repeticaoArray;

import java.util.Scanner;

// Faça um programa que leia 5 números e informe o menor valor
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int menorValor = Integer.MAX_VALUE;
		int valorLido;
		for(int i=0; i<5; i++) {
			System.out.println("Digite o %d numero : ".formatted(i+1));
			valorLido = scanner.nextInt();
			
			if(valorLido<menorValor) {
				menorValor = valorLido;
			}
		}
		System.out.println("O menor numero digitado foi: " + menorValor); 
	}
}
