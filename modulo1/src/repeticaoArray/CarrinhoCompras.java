package repeticaoArray;

import java.util.Scanner;

public class CarrinhoCompras {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] carrinhoCompras = new String[5];
		
		for(int indice=0; indice<carrinhoCompras.length; indice++) {
			System.out.println("Digite o nome de uma fruta: ");
			carrinhoCompras[indice] = scanner.nextLine();
		}
		
		System.out.println("\nCarrinho de compras: ");
		for(String item: carrinhoCompras) {
			System.out.println(item);
		}
	}
}