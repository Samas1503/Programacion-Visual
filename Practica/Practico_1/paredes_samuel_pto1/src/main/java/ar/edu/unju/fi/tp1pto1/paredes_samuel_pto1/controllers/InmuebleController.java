package ar.edu.unju.fi.tp1pto1.paredes_samuel_pto1.controllers;

import org.springframework.stereotype.Controller;

import ar.edu.unju.fi.tp1pto1.paredes_samuel_pto1.models.Inmueble;

@Controller
public class InmuebleController {
    public String ControladorInmueble(Inmueble inmueble){
        inmueble.setEstado("vendida");
        System.out.println(inmueble.getEstado());
        return inmueble.getEstado();
    }
}
