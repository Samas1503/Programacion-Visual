package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.controllers.calculadoraController;

@SpringBootApplication
public class Ejercicio_1_v1Application {
	public static void main(String[] args) {
		SpringApplication.run(Ejercicio_1_v1Application.class, args);
		calculadoraController calculadora = new calculadoraController();
		calculadora.controladorCalculadora();
	}
}