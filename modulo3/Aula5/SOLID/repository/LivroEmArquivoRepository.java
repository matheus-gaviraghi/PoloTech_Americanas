package Aula5.SOLID.repository;

public class LivroEmArquivoRepository extends RepositorioEmArquivoGenerico<Livro> {
    public LivroEmArquivoRepository() {
        super("livros.txt");
    }
}