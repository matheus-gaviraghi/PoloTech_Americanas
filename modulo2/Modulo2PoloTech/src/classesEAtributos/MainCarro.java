package classesEAtributos;

import java.util.Scanner;

public class MainCarro {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Marca fiat = new Marca();
		fiat.nome = "FIAT";
		fiat.ano = 1800;
		
		Marca bmw = new Marca();
		bmw.nome = "BMW";
		bmw.ano = 1900;
		
		Carro carro1 = new Carro();
		carro1.isLigado = true;
		carro1.cor = "vermelho";
		carro1.marca.nome = fiat.nome;
		carro1.modelo = "Uno";
		carro1.velocidade = 20;
			
		int escolha;
		
		while(carro1.isLigado) {
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
				carro1.isLigado = false;
			} else if(escolha == 1) {
				carro1.velocidade += 10;
				System.out.printf("Voce acelerou e sua velocidade atual eh de: %dkm/h", carro1.velocidade);
			} else if(escolha == 2) {
				carro1.velocidade -= 10;
				System.out.printf("Voce freou e sua velocidade atual eh de: %dkm/h", carro1.velocidade);
			} else if(escolha == 3) {
				System.out.println("O seu " + carro1.modelo + " esta atualmente a " + carro1.velocidade + "km/h");
			}
		}
		
		System.out.println("Voce desligou o carro!");
	}
}
