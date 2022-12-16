package entradasETipos;

public class ProgramaMinimo {
	
	public static void main(String[] args) {
		
		final double CONVERSAO_KG_PARA_LB = 2.20462D;
		
		System.out.println("Hello World");
		
		System.out.println(FasesDaLua.GIBOSA_CRESCENTE);
		
		System.out.println(CONVERSAO_KG_PARA_LB);
	}
	
	public enum FasesDaLua{
		NOVA, MINGUANTE, QUARTO_MINGUANTE, GIBOSA_MINGUANTE, CHEIA, GIBOSA_CRESCENTE, QUARTO_CRESCENTE, CRESCENTE 
	}
}
