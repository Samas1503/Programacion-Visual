package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.controllers.calculadoraController;

@SpringBootApplication
public class practica_1_v2 {
	public static void main(String[] args) {
		SpringApplication.run(practica_1_v2.class, args);
		calculadoraController calculadora = new calculadoraController();
		calculadora.controladorCalculadora();
	}
}