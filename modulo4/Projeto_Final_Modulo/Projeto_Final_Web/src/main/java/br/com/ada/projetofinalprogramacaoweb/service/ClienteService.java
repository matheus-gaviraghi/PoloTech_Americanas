package br.com.ada.projetofinalprogramacaoweb.service;

import br.com.ada.projetofinalprogramacaoweb.model.Cliente;
import br.com.ada.projetofinalprogramacaoweb.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void createCliente(Cliente cliente){
        this.clienteRepository.save(cliente);
    }

    public List<Cliente> listarTodos(){
        return this.clienteRepository.findAll();
    }

    public Optional<Cliente> buscarClientePorId(Long id){
        return this.clienteRepository.findById(id);
    }

    public Optional<Cliente> buscarClientePeloDocumentoId(String documentoId){
        return this.clienteRepository.findByDocumentoIdContaining(documentoId);
    }

    public void removerClientePorId(Long id){
        this.clienteRepository.deleteById(id);
    }
}
