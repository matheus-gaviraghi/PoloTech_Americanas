package repeticaoArray;

import java.util.Scanner;

// Descobrir se a entrada do usuario é palíndromo ou não
public class Palindromo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma palavra para verificar se eh palindromo: ");
		String palavra = scanner.nextLine();
		
		char[] vetorPalavra = palavra.toCharArray(); 
		char[] palavraReversa = new char[vetorPalavra.length];
		
		for(int indice = vetorPalavra.length - 1; indice>=0; indice--) {
			palavraReversa[vetorPalavra.length-indice-1] = vetorPalavra[indice];
		}
		System.out.println("Palavra do usuario: " + palavra);
		System.out.println("Palavra do usuario invertida: " + new String(palavraReversa));
		
		String palavraReversaComparacao = new String(palavraReversa).replace(" ", "");
		palavra = palavra.replace(" ", "");
		System.out.println("Eh palindromo? %s".formatted(palavra.equals(palavraReversaComparacao)));
	}
}
