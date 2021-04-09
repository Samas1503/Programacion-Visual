package ar.edu.unju.ar.ejercicio_4.controllers;

import ar.edu.unju.ar.ejercicio_4.models.calculadora;

public class calcularProductoria {
    public void productoria(int n){
        float acum=1;
            calculadora suma = new calculadora();
            calculadora producto = new calculadora();
        for(float i=1;i<=n;i++){
            acum*=producto.getProducto(i,suma.getSuma(i,4));
        }
        System.out.println(acum);
    }
}
