package ar.edu.unju.edm.models;

public class procesoFechaController {
	public void agregarFecha(){
        int dia=15;
        int mes=1;
        int anio=2021;
        procesoFecha fecha = new procesoFecha();
        fecha.setDia(dia);
        fecha.setMes(mes);
        fecha.setAnio(anio);
        System.out.println("Dia: " + fecha.getDia());
        System.out.println("Mes: " + fecha.getMes());
        System.out.println("Año: " + fecha.getAnio());
    }
}
