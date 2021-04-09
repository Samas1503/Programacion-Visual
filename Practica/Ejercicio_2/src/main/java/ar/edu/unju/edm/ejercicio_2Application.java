package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.controller.cuentaController;

@SpringBootApplication
public class ejercicio_2Application {
	public static void main(String[] args) {
		SpringApplication.run(ejercicio_2Application.class, args);
		
		cuentaController nuevaCuenta = new cuentaController();
		nuevaCuenta.operarCuenta();
	}
}
