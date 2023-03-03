package modulo4.Aula2.programacaowebIsb.controller;

import modulo4.Aula2.programacaowebIsb.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class VeiculoControllerMVC {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping("/veiculos")
    public String veiculos(){
        return "veiculos";
    }

}
