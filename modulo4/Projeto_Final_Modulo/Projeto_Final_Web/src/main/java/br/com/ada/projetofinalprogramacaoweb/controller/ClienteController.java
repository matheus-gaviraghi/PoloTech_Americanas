package br.com.ada.projetofinalprogramacaoweb.controller;

import br.com.ada.projetofinalprogramacaoweb.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
}
