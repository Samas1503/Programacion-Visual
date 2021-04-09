package ar.edu.unju.fi.tp1pto1.paredes_samuel_pto1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.tp1pto1.paredes_samuel_pto1.controllers.InmuebleController;
import ar.edu.unju.fi.tp1pto1.paredes_samuel_pto1.models.Inmueble;

@SpringBootApplication
public class ParedesSamuelPto1Application {

	public static void main(String[] args) {
		SpringApplication.run(ParedesSamuelPto1Application.class, args);
		InmuebleController ControladorInmueble = new InmuebleController();
		Inmueble inmueble = new Inmueble();
		ControladorInmueble.ControladorInmueble(inmueble);
	} 
}
