package metodos;
import java.util.Scanner;

public class Exercicio_TimeZones_Completo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano:");
        int ano = scan.nextInt();
        System.out.println("Digite o mes:");
        int mes = scan.nextInt();
        System.out.println("Digite o dia:");
        int dia = scan.nextInt();
        System.out.println("Digite a hora:");
        int hora = scan.nextInt();
        System.out.println("Digite os minutos:");
        int minutos = scan.nextInt();
        System.out.println("Digite os segundos:");
        int segundos = scan.nextInt();

        Tempo tempo = new Tempo(ano,mes,dia,hora,minutos,segundos);

        System.out.println(tempo);

        System.out.println("Digite oq deseja adicionar: ");
        String input = scan.next();

        tempo.addValue(input);

        System.out.println(tempo);
    }
}