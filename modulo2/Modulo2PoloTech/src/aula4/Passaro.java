package aula4;

public class Passaro extends Animal{

	private String plumagem;

	public String getPlumagem() {
		return plumagem;
	}

	public void setPlumagem(String plumagem) {
		this.plumagem = plumagem;
	}
	
	@Override
	public void fazerBarulho() {
		System.out.println("Piu piu");
	}
}
