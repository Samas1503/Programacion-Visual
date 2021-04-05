package ar.edu.unju.edm.controller;

import ar.edu.unju.edm.models.mostrarFormatoReducido;
import ar.edu.unju.edm.models.mostrarFormatoSimple;
import ar.edu.unju.edm.models.mostrarNombreMes;
import ar.edu.unju.edm.models.procesoFecha;
import ar.edu.unju.edm.models.validarFecha;

public class procesoFechaController {
	public void agregarFecha(){
        int dia=29;
        int mes=2;
        int anio=2021;
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
        String reducido = new mostrarFormatoReducido().reducido(fecha);
        String simple = new mostrarFormatoSimple().simple(fecha);
        String meses = new mostrarNombreMes().mostrarMes(fecha);
        System.out.println("Formato Reducido: " + reducido);
        System.out.println("Formato Simple: " + simple);
        System.out.println("Mostrar con Nombre del mes: " + meses);
        
    }
}
