package modulo4.Aula2.programacaowebIsb.service;

import modulo4.Aula2.programacaowebIsb.model.Veiculo;
import modulo4.Aula2.programacaowebIsb.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {
    @Autowired // anotação para injetar uma nova classe
    // ou podemos fazer dentro do construtor:
//    public VeiculoService(VeiculoRepository veiculoRepository){
//        this.veiculoRepository = veiculoRepository;
//    }
    private VeiculoRepository veiculoRepository;
    public void createVeiculo(Veiculo veiculo){
        this.veiculoRepository.save(veiculo);
    }

    public List<Veiculo> listarTodos() {
        return this.veiculoRepository.findAll();
    }

    public Optional<Veiculo> buscarPorVeiculoId(Long id) {
        return this.veiculoRepository.findById(id);
    }
}
