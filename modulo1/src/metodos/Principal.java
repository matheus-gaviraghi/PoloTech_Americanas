package metodos;

import java.util.Scanner;

public class Principal {
	
	// static Scanner ler = new Scanner(System.in);
	Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		Principal principal = new Principal();
		
		int numero1 = principal.solicitarValor("Primeiro numero: ");
		int numero2 = principal.solicitarValor("Segundo numero: "); 
		
		int resultadoSomaClasse = calculadora.somarDoisNumerosClasse(numero1,numero2);
		int resultadoSomaStatic = somarDoisNumeros(numero1,numero2);
		
		System.out.printf("Resultado da soma metodo static: %d", resultadoSomaStatic);
		System.out.printf("\nResultado da soma metodo classe: %d", resultadoSomaClasse);
	}
	
	public static int somarDoisNumeros(int numero1, int numero2) {
		return numero1+numero2;
	}
	
	/*
	public static int solicitarValor() {
		System.out.println("Digite um numero: ");
		int numeroLido = ler.nextInt();
		
		return numeroLido;
	}
	*/
	
	public int solicitarValor(String mensagem) {
		System.out.println(mensagem);
		int numeroLido = ler.nextInt();
		
		return numeroLido;
	}
	
	/*public  int somarDoisNumerosPrincipal(int numero1, int numero2) {
		return numero1+numero2;
	}*/
}

class Calculadora{
	public int somarDoisNumerosClasse(int numero1, int numero2) {
		return numero1+numero2;
	}
}
