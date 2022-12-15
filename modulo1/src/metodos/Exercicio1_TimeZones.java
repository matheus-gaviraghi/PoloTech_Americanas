package metodos;
/*
Desenvolva um programa que vai pedir a hora e o minuto,
depois solicite quantidade de minutos para adicionar
e imprima a nova hora (com os minutos adicionados) em 3 fusos diferentes;
ex.:

ENTRADA ->

informe a hora: 10
informe o minuto: 12

informe a quantidade de minutos para adicionar: 40
SAIDA ESPERADA ->

Brasil, 10 h 52 min
Mexico, 07 h 52 min
Londres, 13 h 52 min */

import java.util.Scanner;

public class Exercicio1_TimeZones {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int hora = solicitarUsuario("Informe a hora desejada: ", scanner);
		int minutos = solicitarUsuario("Informe o minuto desejado: ", scanner);
		int minutosAdd = solicitarUsuario("Informe quantos minutos devem ser adicionados: ", scanner);
		
		minutos = (minutos + minutosAdd) % 60;
		
		horario("Brasil", hora, minutos, 0);
		horario("Mexico", hora, minutos, -3);
		horario("Londres", hora, minutos, 3);
	
	}
	
	public static int solicitarUsuario(String mensagem, Scanner scanner) {
		System.out.println(mensagem);
		return scanner.nextInt();
	}
	
	public static void horario(String localizacao, int hora, int minuto, int dif) {
		System.out.printf("\nHorario %s: %02d:%02d", localizacao, (((hora+dif)+24)%24), minuto);
	}
}
