package repeticaoArray;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] nomes = new String[5];
		double[] alturas = new double[5];
		double[] pesos = new double[5];
		double[] IMCs = new double[5];
		
		boolean variaveisOK = true;
		
		for(int indice=0; indice<nomes.length; indice++) {
			System.out.println("Digite o nome da pessoa: ");
			nomes[indice] = scanner.nextLine();
			System.out.println("Digite a altura da pessoa: ");
			alturas[indice] = scanner.nextDouble();
			System.out.println("Digite o peso da pessoa: ");
			pesos[indice] = scanner.nextDouble();
			
			if(alturas[indice]<0||pesos[indice]<0) {
				variaveisOK = false;
				System.out.println("Altura ou peso incorreto! Valor negativo informado.");
				break;
			}
			
			scanner.nextLine();
			
			IMCs[indice] = pesos[indice]/(alturas[indice]*alturas[indice]);
			System.out.println();
		}
		
		if(variaveisOK) {
			for(int indice=0; indice<IMCs.length; indice++) {
				if(IMCs[indice]<18.5 || IMCs[indice]> 25.0) {
					System.out.println(nomes[indice] + " esta fora do peso ideal!");
				}
			}
		}
	}
}
