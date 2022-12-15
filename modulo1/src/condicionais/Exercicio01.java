package condicionais;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Tempo tempo = new Tempo();
		
		System.out.println("Informe o ano: ");
		tempo.ano = scanner.nextInt();
		
		System.out.println("Informe o mes: ");
		tempo.mes = scanner.nextInt();
		
		System.out.println("Informe o dia: ");
		tempo.dia = scanner.nextInt();
		
		System.out.println("Informe a hora: ");
		tempo.hora = scanner.nextInt();
		
		System.out.println("Informe o minuto: ");
		tempo.minuto = scanner.nextInt();
		
		System.out.println("Informe o segundo: ");
		tempo.segundo = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Agora informe o valor a adicionar e o parametro [y, m, d, h, M, s]: ");
		tempo.incremento = scanner.nextLine();
		
		tempo.manipularTempo();
		
		System.out.println(tempo);
		
	}
}

class Tempo{
	
	int ano, mes, dia, hora, minuto, segundo;
	String incremento;
	
	public void manipularTempo() {
		
		int tamanho = incremento.length();
		char opcao = incremento.charAt(tamanho-1);
		
		int valorIncremento = Integer.parseInt(incremento.substring(0, tamanho-1));
		
		if(opcao == 'y') {
			ano += valorIncremento;
		} else if(opcao == 'm') {
			mes += valorIncremento;
		} else if(opcao == 'd') {
			dia += valorIncremento;
		} else if(opcao == 'h') {
			hora += valorIncremento;
		} else if(opcao == 'M') {
			minuto += valorIncremento;
		} else if (opcao == 's'){
			segundo += valorIncremento;
		}
	}	
	
	public String toString() {
		String retorno = "\nA nova data eh: %02d/%02d/%02d  %02d:%02d:%02d".formatted(dia, mes, ano, hora, minuto, segundo);
		
		return retorno;
	}
}

