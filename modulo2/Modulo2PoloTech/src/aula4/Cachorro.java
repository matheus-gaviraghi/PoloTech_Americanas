package aula4;

public class Cachorro extends Animal{

	private String raca;

	public void fazerBarulho() {
		System.out.println("Au au au!");
	}
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
}
