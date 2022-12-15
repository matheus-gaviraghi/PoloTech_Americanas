package metodos;

import java.util.Scanner;

public class ClasseCalculadora {
	
	static Scanner ler = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		int numero1 = solicitarValor("Primeiro numero: ");
		int numero2 = solicitarValor("Segundo numero: "); 
		
		System.out.printf("Resultado da soma: %d", somarDoisNumeros(numero1,numero2));
		System.out.printf("\nResultado da subtracao: %d", subtrairDoisNumeros(numero1,numero2));
		System.out.printf("\nResultado da multiplicacao: %d", multiplicarDoisNumeros(numero1,numero2));
		System.out.printf("\nResultado da divisao: %f", dividirDoisNumeros(numero1,numero2));
	
	}
	
	public static int somarDoisNumeros(int numero1, int numero2) {
		return numero1+numero2;
	}
	
	public static double dividirDoisNumeros(int numero1, int numero2) {
		if(numero2 == 0) {
			return 0.0;
		}
		return numero1/numero2;
		
	}
	
	public static int multiplicarDoisNumeros(int numero1, int numero2) {
		return numero1*numero2;
	}
	
	public static int subtrairDoisNumeros(int numero1, int numero2) {
		return numero1-numero2;
	}
	
	public static int solicitarValor(String mensagem) {
		System.out.println(mensagem);
		int numeroLido = ler.nextInt();
		return numeroLido;
	}
}
