package ar.edu.unju.edm.controller;

import ar.edu.unju.edm.models.procesoFecha;
import ar.edu.unju.edm.models.validarFecha;

public class procesoFechaController {
	public void agregarFecha(){
        int dia=29;
        int mes=5;
        int anio=2020;
        boolean band= new validarFecha().validacion(dia,mes,anio);
        if(!band){
            dia=1;
            mes=1;
            anio=1900;
        }
        procesoFecha fecha = new procesoFecha();
        fecha.setDia(dia);
        fecha.setMes(mes);
        fecha.setAnio(anio);
        System.out.println("Dia: " + fecha.getDia());
        System.out.println("Mes: " + fecha.getMes());
        System.out.println("Año: " + fecha.getAnio());
    }
}
