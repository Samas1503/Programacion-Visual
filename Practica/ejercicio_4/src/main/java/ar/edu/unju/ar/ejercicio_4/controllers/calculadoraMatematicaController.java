package ar.edu.unju.ar.ejercicio_4.controllers;

import java.util.Scanner;

public class calculadoraMatematicaController {
    public void controladorCalculadora(){
        @SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de k: ");
        int n = leer.nextInt();
        calcularSumatoria sumatoria = new calcularSumatoria();
        calcularProductoria prouctoria = new calcularProductoria();
        System.out.println("La sumatoria de {[n*(n+1)]/2}^2 es:");
        sumatoria.sumatoria(n);
        System.out.println("La productoria de k*(k+4) es:");
        prouctoria.productoria(n);
    }
}
