package repeticaoArray;

import java.util.Scanner;

public class AnalisePessoas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] pessoas = new String[5];
		int[] idades = new int[5];
		
		boolean idadesOK = true;
		
		for(int indice=0; indice<pessoas.length; indice++) {
			System.out.println("Digite o nome de uma pessoa: ");
			pessoas[indice] = scanner.nextLine();
			System.out.println("Digite a idade dessa pessoa: ");
			idades[indice] = scanner.nextInt();
			if(idades[indice]<0) {
				System.out.println("Idade nao existe (idade negativa)!");
				idadesOK = false;
				break;
			}
			scanner.nextLine();
			System.out.println();
		}
		if(idadesOK) {
			int indiceMaisVelho = 0;
			int indiceMaisNovo = 0;
			int idadeMaisVelho = Integer.MIN_VALUE;
			int idadeMaisNovo = Integer.MAX_VALUE;
			int somaIdades = 0;
			
			for(int indice=0; indice<idades.length; indice++) {
				if(idades[indice]>idadeMaisVelho) {
					idadeMaisVelho = idades[indice];
					indiceMaisVelho = indice;
				}
				if(idades[indice]<idadeMaisNovo) {
					idadeMaisNovo = idades[indice];
					indiceMaisNovo = indice;
				}
				somaIdades += idades[indice];
			}
			
			System.out.println("Nome da pessoa mais velha: " + pessoas[indiceMaisVelho] + " Idade: " + idades[indiceMaisVelho]);
			System.out.println("Nome da pessoa mais nova: " + pessoas[indiceMaisNovo] + " Idade: " + idades[indiceMaisNovo]);
			System.out.println("Media de idades: " + somaIdades/(double) idades.length);
		}
	}
}
