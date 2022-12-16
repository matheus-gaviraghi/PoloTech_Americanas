package entradasETipos;
import java.io.InputStream;
import java.util.Scanner;

public class EntradasESaidas {

	public static void main(String[] args) {
		
		InputStream entradaSistema = System.in;

		System.out.println("Digite algum texto: ");
		Scanner scanner = new Scanner(entradaSistema);
		
		String linha = scanner.nextLine(); // espera uma entrada (linha toda)
	
		System.out.println(linha);
	
	}
	
}
