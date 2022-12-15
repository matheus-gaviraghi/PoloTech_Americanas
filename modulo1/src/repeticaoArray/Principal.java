package repeticaoArray;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Estrutura de repeticao: for");
		for (int numero = 0; numero <= 10; numero++) {
			System.out.print(numero + " ");
		}
		
		System.out.println("\nEstrutura de repeticao: while");
		int numero = 0;
		while(numero <= 10) {
			System.out.print(numero + " ");
			numero++;
		}
		
		System.out.println("\nEstrutura de repeticao: do-while");
		int number = 10;
		do {
			System.out.print(number + " ");
			number--;
		}while(number>=0);
	}
}
