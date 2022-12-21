package classesEAtributos;

import java.util.Scanner;

public class CarroSemPOO {

	public static void main(String[] args) {
		/*
		 * Funcionalidades:
		 * 
		 * Atributos: cor, marca, modelo, velocidade
		 * Ações: Ligar, Desligar, Acelerar e Frear
		 * 
		 * Só podemos acelerar ou frear um carro com ele Ligado
		 * 
		 * */
		Scanner scanner = new Scanner(System.in);
		
		// Meu carro
		String cor = "Preto";
		String marca = "FIAT";
		String modelo = "Uno";
		boolean isLigado = true;
		int velocidade = 0;
		
		int escolha;
		
		while(isLigado) {
			System.out.println();
			System.out.println("Escolha uma operacao: ");
			System.out.println("1 - Acelerar");
			System.out.println("2 - Frear");
			System.out.println("3 - Estado Atual");
			System.out.println("0 - Desligar");
			
			System.out.println("Operacao desejada:");
			escolha = scanner.nextInt();
			System.out.println();
			
			if(escolha == 0) {
				isLigado = false;
			} else if(escolha == 1) {
				velocidade += 10;
				System.out.printf("Voce acelerou e sua velocidade atual eh de: %dkm/h", velocidade);
			} else if(escolha == 2) {
				velocidade -= 10;
				System.out.printf("Voce freou e sua velocidade atual eh de: %dkm/h", velocidade);
			} else if(escolha == 3) {
				System.out.println("O seu " + modelo + " esta atualmente a " + velocidade + "km/h");
			}
		}
		
		System.out.println("Voce desligou o carro!");
	}
}
