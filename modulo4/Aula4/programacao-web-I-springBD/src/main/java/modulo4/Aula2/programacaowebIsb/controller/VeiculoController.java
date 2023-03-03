package modulo4.Aula2.programacaowebIsb.controller;

import modulo4.Aula2.programacaowebIsb.model.Veiculo;
import modulo4.Aula2.programacaowebIsb.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

//    @PostMapping("/") // verbo requisitado para o padrão REST
//    // Poderia usar o @RequestMapping(method = RequestMethod.POST, path="/"), seria a mesma coisa
//    public void createVeiculo(@RequestBody Veiculo veiculo){
//        this.veiculoService.createVeiculo(veiculo);
//    }
//    // Se não colocarmos a anotação RequestBody teremos a criação de objetos vazios

    @PostMapping("/")
    public ResponseEntity<String> createVeiculo(@RequestBody Veiculo veiculo){
        try{
            this.veiculoService.createVeiculo(veiculo);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body("Veículo criado!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/todos")
    public List<Veiculo> listarTodos(){
        return this.veiculoService.listarTodos();
    }

    @GetMapping("/by/{id}")
    public ResponseEntity<Veiculo> buscarVeiculoPorId(@PathVariable("id") Long id){

        Optional<Veiculo> optionalVeiculo = this.veiculoService.buscarPorVeiculoId(id);

        if(optionalVeiculo.isPresent()){
            return ResponseEntity.ok(optionalVeiculo.get());
        }

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/")
    public void atualizarVeiculo(){

    }
}
