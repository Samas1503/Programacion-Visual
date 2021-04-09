package ar.edu.unju.edm.models;

public class validarFecha {
    public boolean validacion(int dia, int mes, int anio) {
        boolean band=true;
        int cant = new devolverCantidadDiasMes().devolver(mes, anio);
        if(dia>cant)
            band=false;        
        return band;
    }
}
