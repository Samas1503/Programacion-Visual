package ar.edu.unju.edm.tp1pto1.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class menuController {
    @GetMapping(value="/index")
    public String menuInicio(){
        return "index";
    }
}
