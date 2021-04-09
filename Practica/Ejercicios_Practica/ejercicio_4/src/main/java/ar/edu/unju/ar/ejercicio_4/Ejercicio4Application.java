package ar.edu.unju.ar.ejercicio_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.ar.ejercicio_4.controllers.calculadoraMatematicaController;

@SpringBootApplication
public class Ejercicio4Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio4Application.class, args);
		calculadoraMatematicaController calculadora = new calculadoraMatematicaController();
		calculadora.controladorCalculadora();
	}

}
