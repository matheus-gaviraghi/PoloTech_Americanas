package modulo4.Aula2.programacaowebIsb.repository;

import modulo4.Aula2.programacaowebIsb.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    // JpaRepository recebe 2 parâmetros: classe modelo e o tipo da PK da classe modelo


}
