package repeticaoArray;

import java.util.Scanner;

public class CharImparMaiuscula {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = scanner.nextLine();
		
		char[] arrayPalavra = palavra.toCharArray();
		for(int indice=0; indice<arrayPalavra.length; indice++) {
			if(indice%2==1) {
				arrayPalavra[indice] = Character.toUpperCase(arrayPalavra[indice]);
			}
		}
		
		String palavraComMaiusculas = new String(arrayPalavra);
		
		System.out.println("Palavra com caracteres impares em maiuscula: " + palavraComMaiusculas);
	}
}
