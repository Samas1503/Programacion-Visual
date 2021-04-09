package ar.edu.unju.edm.tp1pto1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ar.edu.unju.edm.tp1pto1.models.Inmueble;

@Controller
public class InmuebleController {
    @Autowired
    Inmueble unInmueble;
}
