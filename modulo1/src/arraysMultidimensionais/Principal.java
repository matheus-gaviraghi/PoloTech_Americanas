package arraysMultidimensionais;

public class Principal {

	public static void main(String[] args) {
		
		int[][] matrizInteiros = new int[3][3];
		
		System.out.println("For-each:");
		for(int[] valor: matrizInteiros) {
			for(int valor2: valor) {
				System.out.print(valor2 + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nFor tradicional:");
		for(int linha=0; linha<matrizInteiros.length; linha++) {
			for(int coluna=0; coluna<matrizInteiros[linha].length; coluna++) {
				System.out.print(matrizInteiros[linha][coluna] + " ");
			}
			System.out.println();
		}
		
	}
}
