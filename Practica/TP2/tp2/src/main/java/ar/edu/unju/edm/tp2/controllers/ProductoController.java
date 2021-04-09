package ar.edu.unju.edm.tp2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.tp2.models.Producto;
import ar.edu.unju.edm.tp2.service.ProductoService;

@Controller
public class ProductoController {
	
	@Autowired
	ProductoService iProductoService;
	
	@GetMapping(value="/producto")
	public String cargarProducto(Model model) {
		model.addAttribute("unProducto", iProductoService.obtenerProductoNuevo());
		return("producto");
	}

	
	@PostMapping(value="/nuevoProducto")
	public String guardarNuevoProducto(@ModelAttribute("unProducto") Producto nuevoProducto, Model model) {
		iProductoService.guardarProducto(nuevoProducto);
		return "producto";
	}
}
