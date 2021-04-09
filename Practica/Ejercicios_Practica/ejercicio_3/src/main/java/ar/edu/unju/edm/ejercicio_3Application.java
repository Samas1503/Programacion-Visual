package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.controller.procesoFechaController;

@SpringBootApplication
public class ejercicio_3Application {
	public static void main(String[] args) {
		SpringApplication.run(ejercicio_3Application.class, args);
		
		procesoFechaController fechaControlador = new procesoFechaController();
		fechaControlador.agregarFecha();
	}
}
