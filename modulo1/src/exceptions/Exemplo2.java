package exceptions;
import java.io.IOException;

public class Exemplo2 {

    private static String conexaoBD = "fechado";

    public static void main(String[] args) {


        // peguei o cadastro do usuário
        // transformei no meu objeto

        // abri conexao com o bd
        cadastrarUsuario();


        System.out.println("projeto finalizado...");
        System.out.println("Conexao com bd esta " + conexaoBD);
        // salvei o cadastro





    }

    public static String cadastrarUsuario() {
        try {

            abrirConexaoComBD();
            salvarCadastro();
            return "salvo!";
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.out.println("Tente novamente!");
        } finally {
            fecharConexaoComBD();
        }
        return "salvo!";
    }


    public static void salvarCadastro() throws IOException {
        if (isBDDisponivel()) {
            System.out.println("Cadastro salvo com sucesso!");
        } else {
            throw new IOException("BD indisponivel!");
        }
    }

    public static void abrirConexaoComBD() {
        conexaoBD = "aberto";
        System.out.println("abriu conexao com bd");
    }

    public static void fecharConexaoComBD() {
        if (conexaoBD.equals("aberto")) {
            conexaoBD = "fechado";
            System.out.println("fechou a conexao com bd");
        }
    }

    public static boolean isBDDisponivel() {
        return true;
    }
}
