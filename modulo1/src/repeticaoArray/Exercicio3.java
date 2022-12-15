package repeticaoArray;

// Imprimir a tabuada de 1 até 9

public class Exercicio3 {

	public static void main(String[] args) {
		
		System.out.println("Tabuadas de 1 ate 9: ");
		for(int linha=1; linha<10; linha++) {
			System.out.println("Tabuada do " + linha);
			for(int coluna=1; coluna<10; coluna++) {
				System.out.println("%dx%d = %d".formatted(linha, coluna, linha*coluna));
			}
			System.out.println();
		}
	}
}
