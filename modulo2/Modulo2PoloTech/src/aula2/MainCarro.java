package aula2;

import java.util.Scanner;

public class MainCarro {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Marca fiat = new Marca();
		fiat.setNome("FIAT");
		fiat.setAno(1800);
		
		Marca bmw = new Marca();
		bmw.setNome("BMW");
		bmw.setAno(1900);
		
		Carro carro1 = new Carro("Vermelho", fiat, "Uno");
		/*
		carro1.isLigado = true;
		carro1.cor = "vermelho";
		carro1.marca.nome = fiat.nome;
		carro1.modelo = "Uno";
		carro1.velocidade = 0;
		*/
			
		int escolha;
		
		while(carro1.isLigado()) {
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
				carro1.desligar();
				
			} else if(escolha == 1) {
				carro1.acelerar();
				
			} else if(escolha == 2) {
				carro1.frear();
				
			} else if(escolha == 3) {
				carro1.mostrarEstadoAtual();
			}
		}
		
		System.out.println("Voce desligou o carro!");
		System.out.println("Modelo do seu carro: " + carro1.getModelo());
	}
}
