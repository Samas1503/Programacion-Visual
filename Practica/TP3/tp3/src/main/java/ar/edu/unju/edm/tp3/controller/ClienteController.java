package ar.edu.unju.edm.tp3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.tp3.model.Clientes;
import ar.edu.unju.edm.tp3.service.IClienteService;

@Controller
public class ClienteController {
    @Autowired
    @Qualifier("unImp")
    IClienteService clienteService;

    @GetMapping(value="/cliente/mostrar")
    public String cargarCliente(Model modelo){
        modelo.addAttribute("unCliente", clienteService.crearCliente());
        modelo.addAttribute("clientes", clienteService.obtenerTodosClientes());
        return "cliente";
    }
    
    @PostMapping(value="/cliente/guardar")
    public String guardarCliente(@ModelAttribute("unCliente") Clientes nuevoCliente,Model modelo){
        clienteService.guardarCliente(nuevoCliente);
        return "redirect:/cliente/mostrar";
    }
}
