import java.util.Scanner;

/*
 *  Escreva um projeto, em java, que solicite as horas
	(da mesma forma do exercício anterior)
	depois solicite uma quantidade de horas
	para adicionar e imprima imprima a hora somada,
	e formatada, em 3 timezones diferentes;
	Ex.:
	informe a hora: 20
	informe os minutos: 30
	quantidade adicionar: 1
	Saída:
	
	Brasil:       21h30min
	Mexico (dst): 18h30min
	Londres:      00h30m
 * */

public class HoraTimeZoneSoma {

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
		int minutos = scanner.nextInt()%59;
		
		System.out.printf("Horario informado: %02d:%02d", hora, minutos);
		
		System.out.println("\nDigite a hora que deseja adicionar: ");
		int horaAdd = scanner.nextInt();
		
		System.out.println("\nHorarios nas 3 diferentes time zones:");
		
		System.out.printf("Brasil: %02d:%02d", (hora+horaAdd)%24, minutos);
		System.out.printf("\nMexico (DST): %02d:%02d",((hora-3)+horaAdd+24)%24, minutos);
		System.out.printf("\nLondres: %02d:%02d",(hora+3+horaAdd)%24, minutos);
	}
}
