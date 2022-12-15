package repeticaoArray;

import java.util.Scanner;

public class NomeMaisLongo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] listaConvidados = new String[5];
		
		for(int indice=0; indice<listaConvidados.length; indice++) {
			System.out.println("Digite o nome do convidado " + (indice+1) + ":");
			listaConvidados[indice] = scanner.nextLine();
		}
		
		String nomeMaisLongo = listaConvidados[0].replace(" ", ""); // inicialização
		
		for(String nome: listaConvidados) {
			if(nome.replace(" ", "").length()>nomeMaisLongo.replace(" ", "").length()) {
				nomeMaisLongo = nome;
			}
		}
		
		System.out.println("Convidado com nome mais longo na lista: " + nomeMaisLongo);
	}
}
