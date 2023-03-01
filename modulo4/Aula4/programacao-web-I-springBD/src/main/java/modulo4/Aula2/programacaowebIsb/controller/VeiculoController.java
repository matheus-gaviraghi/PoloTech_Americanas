package modulo4.Aula2.programacaowebIsb.controller;

import modulo4.Aula2.programacaowebIsb.model.Veiculo;
import modulo4.Aula2.programacaowebIsb.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping("/") // verbo requisitado para o padrão REST
    public void createVeiculo(@RequestBody Veiculo veiculo){
        this.veiculoService.createVeiculo(veiculo);
    }
    // Se não colocarmos a anotação RequestBody teremos a criação de objetos vazios
}
