package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.controller.calculadoraController;
import ar.edu.unju.edm.controller.cuentaController;
import ar.edu.unju.edm.models.calculadora;
import ar.edu.unju.edm.controller.procesoFechaController;

@SuppressWarnings("unused")
@SpringBootApplication
public class Clase2Application {
	public static void main(String[] args) {
		SpringApplication.run(Clase2Application.class, args);
		
		calculadoraController nuevoControlador = new calculadoraController();
		nuevoControlador.resolverSuma();
		
		cuentaController nuevaCuenta = new cuentaController();
		nuevaCuenta.operarCuenta();

		procesoFechaController fechaControlador = new procesoFechaController();
		fechaControlador.agregarFecha();
	}
}
