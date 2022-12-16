package projetoFinalModuloI;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo ao Jogo da Velha em Java!\n");
		
		String[] dadosJogador1 = inserirJogador(1, scanner, "");
		
		Jogador jogador1 = new Jogador();
		jogador1.nome = dadosJogador1[0];
		jogador1.peca = dadosJogador1[1];
			
		String[] dadosJogador2 = inserirJogador(2, scanner, jogador1.peca);
		
		Jogador jogador2 = new Jogador();
		jogador2.nome = dadosJogador2[0];
		jogador2.peca = dadosJogador2[1];
		
		System.out.println("\nJogadores: ");
		System.out.println("Nome jogador 1: " + jogador1.nome + "\nOpcao jogador 1: " + jogador1.peca);
		System.out.println("Nome jogador 2: " + jogador2.nome + "\nOpcao jogador 2: " + jogador2.peca);
		
	}
	
	public static String[] inserirJogador(int jogador, Scanner scanner, String pecaAdversario) {
		System.out.println("Digite o nome do Jogador %s: ".formatted(jogador));
		String nomeJogador = scanner.nextLine();
		
		if(jogador == 1) {
			String pecaJogador1="";
			byte opcao;
			
			do {
				System.out.println("Qual opcao voce deseja ser?");
				System.out.println("Digite 1 para X ou 2 para O: ");
				opcao = scanner.nextByte();
				scanner.nextLine();
				
				if(opcao<1 || opcao>2) {
					System.out.println("Opcao invalida!");
				}
			} while(opcao<1 || opcao>2);
			
			if(opcao==1) {
				pecaJogador1 = "X";
			} else {
				pecaJogador1 = "O";
			}
			
			return new String[] {nomeJogador, pecaJogador1};
			
		} else {
			String pecaJogador2="";
			
			if(pecaAdversario.equals("X")) {
				pecaJogador2 = "O";
			} else {
				pecaJogador2 = "X";
			}
			return new String[] {nomeJogador, pecaJogador2};
		}
	}
}

class Jogador {
	public String nome;
	public String peca;
}
