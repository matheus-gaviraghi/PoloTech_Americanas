package Aula6.interfaceSegregations.projetoBiblioteca.persistence.arquivo;

import Aula6.interfaceSegregations.projetoBiblioteca.model.Entidade;
import Aula6.interfaceSegregations.projetoBiblioteca.persistence.Repository;

import java.util.List;

public class RepositorioEmArquivoGenerico<T extends Entidade> implements Repository<T> {

    private final Repository<T> cache;

    private final ManipuladorDeArquivo manipuladorDeArquivo;

    public RepositorioEmArquivoGenerico(ManipuladorDeArquivo manipuladorDeArquivo, Repository<T> cache) {
        this.manipuladorDeArquivo = manipuladorDeArquivo;
        this.cache = cache;

        carregarDadosNoCache(manipuladorDeArquivo);
    }

    private void carregarDadosNoCache(ManipuladorDeArquivo manipuladorDeArquivo) {
        List<T> dadosIniciais = (List<T>) manipuladorDeArquivo.lerDoArquivo();
        System.out.println("Dados iniciais: " + dadosIniciais);
        for (T dado: dadosIniciais) {
            this.cache.salvar(dado);
        }
    }

    @Override
    public T salvar(T entidade) {
        T entidadeSalva = this.cache.salvar(entidade);
        persistir();
        return entidadeSalva;
    }

    @Override
    public void atualizar(T entidade) {
        this.cache.atualizar(entidade);
        persistir();
    }

    @Override
    public boolean deletar(String id) {
        boolean foiDeletado = this.cache.deletar(id);
        if (foiDeletado) {
            persistir();
        }
        return foiDeletado;
    }

    @Override
    public T consultar(String id) {
        return this.cache.consultar(id);
    }

    @Override
    public List<T> listarTodos() {
        return this.cache.listarTodos();
    }

    private void persistir() {
        manipuladorDeArquivo.escreverNoArquivo(listarTodos());
    }
}