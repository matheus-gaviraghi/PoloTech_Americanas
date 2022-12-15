/*Desenvolva um programa que vai pedir a hora e o minuto,
depois solicite quantidade de minutos para adicionar
e imprima a nova hora (com os minutos adicionados);

ex.:

ENTRADA ->

informe a hora: 10
informe o minuto: 12

informe a quantidade de minutos para adicionar: 40

SAIDA ESPERADA ->

10 h 52 min
*/

package metodos;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int hora = solicitarUsuario("Informe a hora desejada: ", scanner);
		int minutos = solicitarUsuario("Informe o minuto desejado: ", scanner);
		int minutosAdd = solicitarUsuario("Informe quantos minutos devem ser adicionados: ", scanner);
		
		operarHorario("Brasil", hora, minutos, minutosAdd, 0);
		operarHorario("Mexico", hora, minutos, minutosAdd, -3);
		operarHorario("Londres", hora, minutos, minutosAdd, 3);
	}
	
	public static int solicitarUsuario(String mensagem, Scanner scanner) {
		System.out.println(mensagem);
		return scanner.nextInt();
	}
	
	public static void operarHorario(String localizacao, int hora, int minutos, int minutosAdd, int dif) {
		
		int somaMinutos = minutos + minutosAdd;
		int minutoFinal;
		if (somaMinutos % 59 > 0) {
			minutoFinal = somaMinutos % 59 - 1;
			hora += somaMinutos/60;
		}
		else {
			minutoFinal = somaMinutos;
		}
		
		System.out.printf("\nHorario %s: %02d:%02d", localizacao, (((hora+dif)+24)%24), minutoFinal);
	}
}
