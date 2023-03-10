package br.com.ada.projetofinalprogramacaoweb.repository;

import br.com.ada.projetofinalprogramacaoweb.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByDocumentoIdContaining(String documento);
}
