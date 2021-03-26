package ar.edu.unju.edm.controller;

import ar.edu.unju.edm.models.calculadora;

public class calculadoraController {
	public void resolverSuma() {
		int num1 = 10;
		int num2 = 5;
				
		calculadora nuevaCalculadora=new calculadora();
		nuevaCalculadora.setNum1(num1);
		nuevaCalculadora.setNum2(num2);
		
		System.out.println(nuevaCalculadora.getSumar() + nuevaCalculadora.getSuma());
		System.out.println(nuevaCalculadora.getRestar() +nuevaCalculadora.getResta());
		System.out.println(nuevaCalculadora.getDividir() +nuevaCalculadora.getDivision());
		System.out.println(nuevaCalculadora.getMultiplicar() +nuevaCalculadora.getMultiplicacion());
	}
}
