package ar.edu.unju.edm.models;

public class mostrarFormatoSimple {
    public String simple(procesoFecha fecha){
        return (fecha.getDia() + "-" + fecha.getMes() + "-" + fecha.getAnio());
    }
}
