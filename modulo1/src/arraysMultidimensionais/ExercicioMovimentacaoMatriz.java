package arraysMultidimensionais;

/*Enunciado: 
 *
 *	Matriz de characteres
 
	Iniciar com o X na primeira posição
	Devo ser capaz de mover o X
	Ao mover, ele será movido uma vez para a direita. Caso seja a 
	ultima casa da linha, ele deve ser movido para a primeira casa 
	da próxima coluna.
	Caso seja a ultima coluna da ultima linha, não deve mover
 * */

public class ExercicioMovimentacaoMatriz {

	public static void main(String[] args) {
	
		Character[][] matriz = new Character[5][5];
		matriz[0][0] = 'X';
		
		System.out.println("Posicao inicial de X na matriz: ");
		imprimir(matriz);
		
		for(int i=0; i<30;i++) {
			System.out.print("\nMovimentacao " + (i+1) + ": ");
			mover(matriz);
			imprimir(matriz);
		}
		
	}
	
	public static int[] encontrarX(Character[][] matriz) {
		int posicaoElementoLinha = 0;
		int posicaoElementoColuna = 0;
		
		for(int indiceLinha=0; indiceLinha<matriz.length; indiceLinha++) {
			for(int indiceColuna=0; indiceColuna<matriz[indiceLinha].length; indiceColuna++) {
				Character elemento = matriz[indiceLinha][indiceColuna];
				if(elemento != null ) {
					posicaoElementoLinha = indiceLinha;
					posicaoElementoColuna = indiceColuna;
				} 
			}
		}
		
		return new int[] {posicaoElementoLinha,posicaoElementoColuna};
	}
	
	public static void mover(Character[][] matriz) {
		int[] posicao = encontrarX(matriz);
		int linha = posicao[0];
		int coluna = posicao[1];
		
		if(coluna<matriz[linha].length-1) {
			matriz[linha][coluna] = '_';
			matriz[linha][coluna+1] = 'X';
		} else if(linha<matriz.length-1) {
			moverParaProximaLinha(matriz);
		}
	}
	
	private static void moverParaProximaLinha(Character[][] matriz) {
		int[] posicao = encontrarX(matriz);
		int linha = posicao[0];
		int coluna = posicao[1];
		
		matriz[linha][coluna] = '_';
		matriz[linha+1][0] = 'X';
	}
	
	public static void imprimir(Character[][] matriz) {
		System.out.println();
		
		for(int indiceLinha=0; indiceLinha<matriz.length; indiceLinha++) {
			Character[] linha = matriz[indiceLinha];
			System.out.print("[ ");
			for(int indiceColuna=0; indiceColuna<matriz[indiceLinha].length; indiceColuna++) {
				Character elemento = matriz[indiceLinha][indiceColuna];
				if(elemento == null) {
					System.out.print("_");
				} else {
					System.out.print(elemento);
				}
				
				if(indiceColuna == linha.length-1) {
					System.out.print(" ]");
				} else {
					System.out.print(" , ");
				}
			}		
			System.out.println();
		}
	}
}
