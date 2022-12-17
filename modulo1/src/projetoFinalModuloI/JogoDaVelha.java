package projetoFinalModuloI;

import java.util.Scanner;

public class JogoDaVelha {

	private static int rodada = 1, vez = 1, jogo = 1;
	private static boolean vencedor = false;
	
	private static Jogador jogador1 = new Jogador();
	private static Jogador jogador2 = new Jogador();
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo ao Jogo da Velha em Java!\n");
		
		// Inserindo os dados e a peça de cada jogador
		String[] dadosJogador1 = inserirJogador(1, scanner, "");
		jogador1.nome = dadosJogador1[0];
		jogador1.peca = dadosJogador1[1];
			
		String[] dadosJogador2 = inserirJogador(2, scanner, jogador1.peca);
		jogador2.nome = dadosJogador2[0];
		jogador2.peca = dadosJogador2[1];
		
		System.out.println("\nJogadores: ");
		System.out.println("Nome jogador 1: " + jogador1.nome + "\nOpcao jogador 1: " + jogador1.peca);
		System.out.println("Nome jogador 2: " + jogador2.nome + "\nOpcao jogador 2: " + jogador2.peca);
		
		// criação do tabuleiro para o jogo
		String[][] tabuleiro = new String[3][3];	
		
		while(!vencedor) {

			jogar(scanner, tabuleiro);
				
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
			if(linha == 0) {
				System.out.println("     1   2   3\n");
			}
			System.out.print(" " + (linha+1) + "  ");
			for(int coluna=0; coluna<tabuleiro.length; coluna++) {
				if (!(tabuleiro[linha][coluna].equals(" "))) {
					System.out.print(" " + tabuleiro[linha][coluna] + " ");
				}else {
					System.out.print("   ");
				}
				
				if(coluna == 0 || coluna == tabuleiro.length - 2) {
					System.out.print("|");
				}
				
			}
			if(linha == 0 || linha == tabuleiro.length - 2) {
				System.out.println("\n    _ _ _ _ _ _\n");
			} else System.out.println();
		}
		System.out.println();
	}
	
	public static int[] requisitarCoordenada(Scanner scanner) {
		
		int[] coordenada = new int[2];
		
		System.out.println("Informe a coordenada de sua jogada!");
		System.out.println("Linha: ");
		coordenada[0] = scanner.nextInt();
		
		System.out.println("Coluna: ");
		coordenada[1] = scanner.nextInt();
		
		return coordenada;
	}
	
	public static void jogar(Scanner scanner, String[][] tabuleiro) {
		
		if(rodada == 1) {
			
			tabuleiro = zerarTabuleiro(tabuleiro);
			
			System.out.println("----------------------");
			System.out.println("   Esse e o jogo " + jogo);
			System.out.println("----------------------");
		}
		
		System.out.println("Rodada " + rodada);
		
		imprimirTabuleiro(tabuleiro);
		
		String nomeJogadorVez;
		if(verificarVezJogador()==1) {
			nomeJogadorVez = jogador1.nome;
		} else {
			nomeJogadorVez = jogador2.nome;
		}
		System.out.println(nomeJogadorVez + " - Sua vez de jogar!\n");
		
		int[] coordenadaJogada = requisitarCoordenada(scanner);
		
		while(!isJogadaValida(tabuleiro, coordenadaJogada)) {
			System.out.println(nomeJogadorVez + ", digite uma coordenada valida!");
			imprimirTabuleiro(tabuleiro);
			coordenadaJogada = requisitarCoordenada(scanner);
		}
		
		
		if(nomeJogadorVez.equals(jogador1.nome)) {
			tabuleiro[coordenadaJogada[0]-1][coordenadaJogada[1]-1] = jogador1.peca;
		}else {
			tabuleiro[coordenadaJogada[0]-1][coordenadaJogada[1]-1] = jogador2.peca;
		}
				
		
		if(verificarDiagonais(tabuleiro)==1) {
			imprimirTabuleiro(tabuleiro);
			System.out.println(jogador1.nome + " venceu!");
		} else if(verificarDiagonais(tabuleiro)==2) {
			imprimirTabuleiro(tabuleiro);
			System.out.println(jogador2.nome + " venceu!");
		} else {
			rodada++;
			vez++;
		}
						
	}
	
	
	public static boolean isJogadaValida(String[][] tabuleiro, int[] coordenada) {
		
		int linha = coordenada[0] - 1;
		int coluna = coordenada[1] - 1;
		
		if(linha<0 || linha>2 || coluna<0 || coluna>2) {
			return false;
		}
		
		if(tabuleiro[linha][coluna].equals("O") || tabuleiro[linha][coluna].equals("X")) {
			return false;
		}
		
		return true;
	}
	
	
	public static int verificarVezJogador() {
		
		if(vez%2 == 1) {
			return 1;
		} 
		return 2; 
	}
	
	
	public static int verificarDiagonais(String[][] tabuleiro) {
		
		if(tabuleiro[0][0].equals(jogador1.peca) &&
			tabuleiro[1][1].equals(jogador1.peca) &&
			 tabuleiro[2][2].equals(jogador1.peca)) {
			vencedor = true;
			return 1;
		}
		if(tabuleiro[0][2].equals(jogador1.peca) &&
			tabuleiro[1][1].equals(jogador1.peca) &&
			 tabuleiro[2][0].equals(jogador1.peca)) {
				vencedor = true;
				return 1;
		}
		
		if(tabuleiro[0][0].equals(jogador2.peca) &&
			tabuleiro[1][1].equals(jogador2.peca) &&
			 tabuleiro[2][2].equals(jogador2.peca)) {
			vencedor = true;
			return 2;
		}
		if(tabuleiro[0][2].equals(jogador2.peca) &&
			tabuleiro[1][1].equals(jogador2.peca) &&
			 tabuleiro[2][0].equals(jogador2.peca)) {
			vencedor = true;
			return 2;
		}
		
		return 0;
		
	}
	
	
	
}

class Jogador {
	public String nome;
	public String peca;
}
