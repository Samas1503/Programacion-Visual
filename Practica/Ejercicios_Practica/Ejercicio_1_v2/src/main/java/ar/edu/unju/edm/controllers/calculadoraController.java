package ar.edu.unju.edm.controllers;

import ar.edu.unju.edm.models.Calculadora;

public class calculadoraController {
    public void controladorCalculadora(){
        int num1=18;
		int num2=5;
		
		/*Calculadora cal1= new Calculadora();
		System.out.println(cal1);
		Calculadora cal2= new Calculadora();
		System.out.println(cal2);*/
		
		Calculadora cal3 = new Calculadora(num1,num2);
		System.out.println("Suma: "+cal3.getSuma());
		System.out.println("Resta: "+cal3.getResta());
		System.out.println("Multiplicacion: "+cal3.getMultiplicacion());
		System.out.println("Division: "+cal3.getDivision());
    }
}
