package repeticaoArray;

public class Arrays {

	public static void main(String[] args) {
		
		int[] numeros;
		
		numeros = new int[3];
		int valorPrimeiraPosicao = numeros[0];
		
		System.out.println("Valor da primeira posicao do array: " + valorPrimeiraPosicao);
		
		numeros[0] = 10;
		numeros[1] = 101231;
		numeros[2] = -23;
		
		System.out.println("For normal:");
		for(int i=0; i<numeros.length; i++) {
			System.out.println("posicao %d: %d".formatted(i, numeros[i]));
		}
		
		System.out.println("For-each:");
		for(int num: numeros) {
			System.out.println(num);
		}
		
		
		String[] estados = new String[4];
		estados[0] = "Distrito Federal";
		estados[1] = "Bahia";
		estados[2] = "Sao Paulo";
		
		System.out.println("For-each Estados:");
		for(String estado: estados) {
			System.out.println(estado);
		}
		
	}
	
	public char[] deStringParaArray(String txt) {
		return txt.toCharArray();
	}
	
	public String deArrayParaString(char[] txt) {
		return new String(txt);
	}
}
