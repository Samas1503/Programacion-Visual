package ar.edu.unju.fi.tp1pto2.paredes_samuel_tp1_2.controllers;

import org.springframework.stereotype.Controller;

import ar.edu.unju.fi.tp1pto2.paredes_samuel_tp1_2.models.Calculadora;

@Controller
public class CalculadoraController {
    public void ControladorCalculadora(Calculadora calculadora){
        double num1=4;
        double num2=2;
        System.out.println(calculadora.getSuma(num1, num2));
        System.out.println(calculadora.getResta(num1,num2));
        System.out.println(calculadora.getProducto(num1,num2));
        System.out.println(calculadora.getCociente(num1,num2));
    }
}
