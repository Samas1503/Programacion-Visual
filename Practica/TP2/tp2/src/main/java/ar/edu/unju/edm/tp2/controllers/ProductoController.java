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
	
	@PostMapping(value="/producto")
	public String guardarNuevoProducto(@ModelAttribute("unProducto") Producto nuevoProducto, Model model) {
		iProductoService.guardarProducto(nuevoProducto);
		System.out.println(iProductoService.obtenerTodosProductos().get(0).getMarca());
		model.addAttribute("productos", iProductoService.obtenerTodosProductos());
		return "resultado";
	}

	@GetMapping(value="/ultimo")
	public String cargarUltimoProducto(Model model) {
		model.addAttribute("ultimoProducto", iProductoService.obtenerUltimoProducto());
		return("ultimo-producto");
	}
	
	@GetMapping(value="/volver")
	public String cargarNuevoProducto(Model model) {
		//model.addAttribute("unProducto", iiProductoService.obtenerProductoNuevo());
		return("redirect:/producto");
	}
}
