package ar.edu.unju.edm.aplicacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.calse2.calculadora;

@SpringBootApplication
public class Clase1Application {
	public static void main(String[] args) {
		SpringApplication.run(Clase1Application.class, args);
		
		int num1=10;
		int num2=5;
				
		calculadora cal3=new calculadora(num1, num2);
		System.out.println("Suma: "+cal3.getSuma());
		System.out.println("Resta: "+cal3.getResta());
		System.out.println("Multiplicacion: "+cal3.getMultiplicacion());
		System.out.println("Division: "+cal3.getDivision());
	}
}