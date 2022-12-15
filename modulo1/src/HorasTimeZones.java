/*Programa que solicita a hora e minutos e imprima
 * essa hora, formatada, em 3 timezones diferentes*/

import java.time.LocalTime;
import java.util.Scanner;

public class HorasTimeZones {
	
	public static void main(String[] args) {
		/*
		LocalTime time = LocalTime.now();
		int hora = time.getHour();
		int minutos = time.getMinute();
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a hora: ");
		int hora = scanner.nextInt();
		
		System.out.println("Digite os minutos: ");
		int minutos = scanner.nextInt();
		
		System.out.println("\nHorarios nas 3 diferentes time zones:");
		
		// System.out.println("Brasil: %d:%d".formatted(hora, minutos));
		// System.out.println("Mexico (DST): %d:%d".formatted(hora-3, minutos));
		// System.out.println("Londres: %d:%d".formatted(hora+3, minutos));
		
		System.out.printf("Brasil: %d:%d", hora, minutos);
		System.out.printf("\nMexico (DST): %d:%d",((hora-3)+24)%24, minutos);
		System.out.printf("\nLondres: %d:%d",(hora+3)%24, minutos);
	}
}