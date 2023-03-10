package br.com.ada.projetofinalprogramacaoweb.controller;

import br.com.ada.projetofinalprogramacaoweb.model.Cliente;
import br.com.ada.projetofinalprogramacaoweb.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public String clientes(Model model) {
        List<Cliente> clientes = this.clienteService.listarTodos();
        model.addAttribute("clientes", clientes);
        return "clientes";
    }

    @GetMapping("/cliente/add")
    public String addCliente(Model model) {
        model.addAttribute("add", Boolean.TRUE);
        model.addAttribute("cliente", new Cliente());
        return "cliente-add";
    }
    
}
