package exceptions;

import java.io.IOException;

public class Exemplo1 {

	public static void main(String[] args) {
		
		
		// peguei o cadastro do usuario
		// transformei no meu objeto
		
		// abri conexao com o BD
		
		try {
			conectaComOBancoDeDados("localhost", 5432);
		} catch (IOException excecaoCapturada) {
			System.out.println("Problemas na nossa infra, tente novamente!");
			System.err.println(excecaoCapturada.getMessage());
		}
		
		// salvei o cadastro
		
		// retornei msg sucesso para o cliente
		
		
		
		
	}
	
	public static void conectaComOBancoDeDados(String host, int port) throws IOException{
		
		if(isBDDisponivel()) {
			System.out.println("Conectou no banco de dados! " + host + ":" + port);
		} else {
			throw new IOException("CONEXAO FALHOU -> "+ host + ":" + port);
		}
	}
	
	
	public static boolean isBDDisponivel() {
		return false;
	}
}
