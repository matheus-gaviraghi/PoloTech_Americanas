package projetoFinalModuloI;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo ao Jogo da Velha em Java!\n");
		
		// Inserindo os dados e a peça de cada jogador
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
		
		// criação do tabuleiro para o jogo
		String[][] tabuleiro = new String[3][3];	
		tabuleiro = zerarTabuleiro(tabuleiro);

		imprimirTabuleiro(tabuleiro);
		
		
		tabuleiro[0][2] = " O ";
		if(isJogadaValida(tabuleiro, new int[] {1,3})) {
			System.out.println("Jogada valida!");
		} else {
			System.out.println("Jogada invalida!");
		}
		
		
		
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
	

	public static String[][] zerarTabuleiro(String[][] tabuleiro){
		
		for(int linha=0; linha<tabuleiro.length; linha++) {
			for(int coluna=0; coluna<tabuleiro.length; coluna++) {
				tabuleiro[linha][coluna]=" ";
			}
		}
		
		return tabuleiro;
	}
	
	
	public static void imprimirTabuleiro(String[][] tabuleiro) {
		
		System.out.println();
		System.out.println("Tabuleiro:");
		
		for(int linha=0; linha<tabuleiro.length; linha++) {
			for(int coluna=0; coluna<tabuleiro.length; coluna++) {
				if(tabuleiro[linha][coluna] != " ") {
					System.out.print(" " + tabuleiro[linha][coluna] + " ");
				}else {
					System.out.print("   ");
				}
				
				if(coluna == 0 || coluna == tabuleiro.length - 2) {
					System.out.print("|");
				}
				
			}
			if(linha == 0 || linha == tabuleiro.length - 2) {
				System.out.println("\n_ _ _ _ _ _\n");
			} else System.out.println();
		}
	}

	
	public static void jogar() {
		
	}
	
	
	public static boolean isJogadaValida(String[][] tabuleiro, int[] coordenada) {
		
		int linha = coordenada[0] - 1;
		int coluna = coordenada[1] - 1;
		
		if(linha<0 || linha>2 || coluna<0 || coluna>2) {
			return false;
		}
		
		if(tabuleiro[linha][coluna].equals(" O ") || tabuleiro[linha][coluna].equals(" X ")) {
			return false;
		}
		
		return true;
	}
	
}

class Jogador {
	public String nome;
	public String peca;
}
