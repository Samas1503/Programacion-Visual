package ar.edu.unju.edm.controllers;

import ar.edu.unju.edm.models.calculadora;

public class calculadoraController {
    public void controladorCalculadora(){
        int num1=10;
		int num2=5;
				
		calculadora cal3=new calculadora(num1, num2);
		System.out.println("Suma: "+cal3.getSuma());
		System.out.println("Resta: "+cal3.getResta());
		System.out.println("Multiplicacion: "+cal3.getMultiplicacion());
		System.out.println("Division: "+cal3.getDivision());
    }
}
