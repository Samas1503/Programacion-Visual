package ar.edu.unju.edm.tp1pto1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.tp1pto1.models.Provincia;

@Controller
public class ProvinciaController {
    @Autowired
    private Provincia unaProvincia;
    
    @GetMapping(value="/provincia")
    public String controladorProvincia(Model model){
		//Provincia unaProvincia = new Provincia();
        unaProvincia.setNombre("Jujuy");
        model.addAttribute("prov", unaProvincia);
        return "provincia";
    }
}
