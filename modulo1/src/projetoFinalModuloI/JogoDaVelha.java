package projetoFinalModuloI;

import java.util.Scanner;

public class JogoDaVelha {

	private static int rodada = 1, vez = 1, jogo = 1, empates=0;
	private static boolean vencedorOUEmpate = false;
	
	private static Jogador jogador1 = new Jogador();
	private static Jogador jogador2 = new Jogador();
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("===================================");
		System.out.println("Bem vindo ao Jogo da Velha em Java!");
		System.out.println("===================================\n");
		
		// Inserindo os dados e a peça de cada jogador
		String[] dadosJogador1 = inserirJogador(1, scanner, "");
		jogador1.nome = dadosJogador1[0];
		jogador1.peca = dadosJogador1[1];
			
		String[] dadosJogador2 = inserirJogador(2, scanner, jogador1.peca);
		jogador2.nome = dadosJogador2[0];
		jogador2.peca = dadosJogador2[1];
		
		System.out.println("\nJogadores: ");
		System.out.println("Nome jogador 1: " + jogador1.nome + " | Opcao jogador 1: " + jogador1.peca);
		System.out.println("Nome jogador 2: " + jogador2.nome + " | Opcao jogador 2: " + jogador2.peca + "\n");
		
		// criação do tabuleiro para o jogo
		String[][] tabuleiro = new String[3][3];	
		
		boolean jogarNovamente = false;
		
		do {
			while(!vencedorOUEmpate ) {
				jogar(scanner, tabuleiro);
			}
			
			String continuarJogando;
			
			do {
				System.out.println("Deseja jogar mais uma vez? [S,N]");
				continuarJogando = scanner.nextLine().toLowerCase();
				
				if(continuarJogando.equals("s")) {
					jogarNovamente = true;
					reiniciarJogo(tabuleiro);
				} else {
					jogarNovamente = false;
					System.out.println("\n--------------------------------------------");
					System.out.println("Jogo da Velha encerrado! Obrigado por jogar!");
					System.out.println("\nResumo do jogo:");
					System.out.println("Vitorias: ");
					System.out.println("  " + jogador1.nome + ": " + jogador1.vitorias + " | " + jogador2.nome + ": " + jogador2.vitorias);
					System.out.println("Empates: " + empates);
				}	
			} while(!continuarJogando.equals("s") && !continuarJogando.equals("n"));
			
			
		} while(jogarNovamente);
				
	}
	
	
	public static String[] inserirJogador(int jogador, Scanner scanner, String pecaAdversario) {
		System.out.println("Digite o nome do Jogador %s: ".formatted(jogador));
		String nomeJogador = scanner.nextLine();
		
		if(jogador == 1) {
			String pecaJogador1="";
			String opcao;
			
			do {
				System.out.println("Qual opcao voce deseja ser? Digite 1 para X ou 2 para O:");
				opcao = scanner.nextLine();
				
				if(!opcao.equals("1") && !opcao.equals("2")) {
					System.err.println("Opcao invalida!");
				}
			} while(!opcao.equals("1") && !opcao.equals("2"));
			
			if(opcao.equals("1")) {
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
	
	
	public static void reiniciarJogo(String[][] tabuleiro) {
		vencedorOUEmpate  = false;
		zerarTabuleiro(tabuleiro);
		rodada = 1; 
		vez = 1;
		jogo++;
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
		System.out.println("     Tabuleiro");
		
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
		
		System.out.println("\n");
	}
	
	public static String[] requisitarCoordenada(Scanner scanner) {
		
		String[] coordenada = new String[2];
		
		System.out.println("Informe a coordenada de sua jogada!");
		System.out.println("Linha: ");
		coordenada[0] = scanner.nextLine();
		
		System.out.println("Coluna: ");
		coordenada[1] = scanner.nextLine();
		
		return coordenada;
	}
	
	public static void jogar(Scanner scanner, String[][] tabuleiro) {
				
		if(rodada == 1) {
			
			tabuleiro = zerarTabuleiro(tabuleiro);
			
			System.out.println("----------------------");
			System.out.println("   Esse e o jogo " + jogo);
			System.out.println("----------------------");
			
			System.out.println("   Placar dos jogos ");
			System.out.println("Vitorias: ");
			System.out.println("  " + jogador1.nome + ": " + jogador1.vitorias + " | " + jogador2.nome + ": " + jogador2.vitorias);
			System.out.println("Empates: " + empates);
			System.out.println("----------------------");
			System.out.println("Rodada " + rodada);
		} else {
			System.out.println("\n----------------------");
			System.out.println("Rodada " + rodada);
		}
		
		imprimirTabuleiro(tabuleiro);
		
		String nomeJogadorVez;
		if(verificarVezJogador()==1) {
			nomeJogadorVez = jogador1.nome;
		} else {
			nomeJogadorVez = jogador2.nome;
		}
		System.out.println(nomeJogadorVez + " - Sua vez de jogar!\n");
		
		String[] coordenadaJogada = requisitarCoordenada(scanner);
		
		while(!isJogadaValida(tabuleiro, coordenadaJogada)) {
			System.err.println("\n" + nomeJogadorVez + ", digite uma coordenada valida!");
			imprimirTabuleiro(tabuleiro);
			coordenadaJogada = requisitarCoordenada(scanner);
		}
		
		
		if(nomeJogadorVez.equals(jogador1.nome)) {
			tabuleiro[Integer.parseInt(coordenadaJogada[0])-1][Integer.parseInt(coordenadaJogada[1])-1] = jogador1.peca;
		}else {
			tabuleiro[Integer.parseInt(coordenadaJogada[0])-1][Integer.parseInt(coordenadaJogada[1])-1] = jogador2.peca;
		}
		
		int haVencedor = verificarSeHaVencedor(tabuleiro);
				
		if(haVencedor!=0) {
			if(haVencedor==1) {
				imprimirTabuleiro(tabuleiro);
				System.out.println(jogador1.nome + " venceu!");
				jogador1.vitorias++;
			} else if(haVencedor==2) {
				imprimirTabuleiro(tabuleiro);
				System.out.println(jogador2.nome + " venceu!");
				jogador2.vitorias++;
			}
		} else {
			
			if(verificarSeDeuVelha(tabuleiro)) {
				imprimirTabuleiro(tabuleiro);
				System.out.println("Este jogo deu empate!");
				empates++;
			} else {
				rodada++;
				vez++;
			}
		}
						
	}
	
	
	public static boolean isJogadaValida(String[][] tabuleiro, String[] coordenada) {
		
		if(!coordenada[0].equals("1") && !coordenada[0].equals("2") && !coordenada[0].equals("3")
				|| !coordenada[1].equals("1") && !coordenada[1].equals("2") && !coordenada[1].equals("3")) {
			
			return false;
			
		} else {
			
			int linha = Integer.parseInt(coordenada[0]) - 1;
			int coluna = Integer.parseInt(coordenada[1]) - 1;
			
			if(linha<0 || linha>2 || coluna<0 || coluna>2) {
				return false;
			}
			
			if(tabuleiro[linha][coluna].equals("O") || tabuleiro[linha][coluna].equals("X")) {
				return false;
			}
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
			vencedorOUEmpate  = true;
			return 1;
		}
		if(tabuleiro[0][2].equals(jogador1.peca) &&
			tabuleiro[1][1].equals(jogador1.peca) &&
			 tabuleiro[2][0].equals(jogador1.peca)) {
			vencedorOUEmpate  = true;
			return 1;
		}
		
		if(tabuleiro[0][0].equals(jogador2.peca) &&
			tabuleiro[1][1].equals(jogador2.peca) &&
			 tabuleiro[2][2].equals(jogador2.peca)) {
			vencedorOUEmpate  = true;
			return 2;
		}
		if(tabuleiro[0][2].equals(jogador2.peca) &&
			tabuleiro[1][1].equals(jogador2.peca) &&
			 tabuleiro[2][0].equals(jogador2.peca)) {
			vencedorOUEmpate  = true;
			return 2;
		}
		
		return 0;	
	}
	
	
	public static int verificarColunas(String[][] tabuleiro) {
		
		for(int coluna=0; coluna<tabuleiro.length; coluna++) {
			
			if(tabuleiro[0][coluna].equals(jogador1.peca) &&
				tabuleiro[1][coluna].equals(jogador1.peca) &&
				 tabuleiro[2][coluna].equals(jogador1.peca)) {
				vencedorOUEmpate  = true;
				return 1;
			}
			
			if(tabuleiro[0][coluna].equals(jogador2.peca) &&
				tabuleiro[1][coluna].equals(jogador2.peca) &&
				 tabuleiro[2][coluna].equals(jogador2.peca)) {
				vencedorOUEmpate  = true;
				return 2;
			}
		}
		return 0;
	}
	
	
	public static int verificarLinhas(String[][] tabuleiro) {
		
		for(int linha=0; linha<tabuleiro.length; linha++) {
			
			if(tabuleiro[linha][0].equals(jogador1.peca) &&
				tabuleiro[linha][1].equals(jogador1.peca) &&
				 tabuleiro[linha][2].equals(jogador1.peca)) {
				vencedorOUEmpate  = true;
				return 1;
			}
			
			if(tabuleiro[linha][0].equals(jogador2.peca) &&
				tabuleiro[linha][1].equals(jogador2.peca) &&
				 tabuleiro[linha][2].equals(jogador2.peca)) {
				vencedorOUEmpate  = true;
				return 2;
			}
		}
		return 0;
	}
	
	
	public static int verificarSeHaVencedor(String[][] tabuleiro) {
		int haVencedor = 0;
		
		int vencedorColuna = verificarColunas(tabuleiro);
		int vencedorDiagonal = verificarDiagonais(tabuleiro);
		int vencedorLinha = verificarLinhas(tabuleiro);
		
		if(vencedorColuna!= 0) {
			haVencedor = vencedorColuna;
			return haVencedor;
		}
		
		if(vencedorDiagonal!= 0) {
			haVencedor = vencedorDiagonal;
			return haVencedor;
		}
		
		if(vencedorLinha!= 0) {
			haVencedor = vencedorLinha;
			return haVencedor;
		}
		
		return haVencedor;
	}
	
	
	public static boolean verificarSeDeuVelha(String[][] tabuleiro) {
		
		boolean deuVelha = true;
		
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				if(tabuleiro[linha][coluna] == " ") {
					deuVelha = false;
					return deuVelha;
				}
			}
		}
		
		vencedorOUEmpate = true;
		return deuVelha;
	}
	
}

class Jogador {
	public String nome;
	public String peca;
	public int vitorias = 0;
}
