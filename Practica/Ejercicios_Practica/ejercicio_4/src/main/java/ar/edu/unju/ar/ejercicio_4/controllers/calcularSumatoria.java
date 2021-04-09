package ar.edu.unju.ar.ejercicio_4.controllers;

import ar.edu.unju.ar.ejercicio_4.models.calculadora;

public class calcularSumatoria {
    public void sumatoria(int n){
        float acum=0;
        calculadora suma = new calculadora();
        calculadora cuadrado = new calculadora();
        calculadora producto = new calculadora();
        calculadora division = new calculadora();
        for(float i=1;i<=n;i++){
            acum+=cuadrado.getcuadrado(division.getDivision(producto.getProducto(i,suma.getSuma(i,1)),2));
        }
        System.out.println(acum);
    }
}
