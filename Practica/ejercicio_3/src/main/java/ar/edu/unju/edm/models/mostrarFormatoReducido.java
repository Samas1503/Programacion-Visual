package ar.edu.unju.edm.models;

public class mostrarFormatoReducido {
    public String reducido(procesoFecha fecha){
        if (fecha.getAnio()%100==0){
            return (fecha.getDia() + "/" + fecha.getMes() + "/" + fecha.getAnio());
        }
        else{
            if (fecha.getAnio()%100 >= 10){
                return (fecha.getDia() + "/" + fecha.getMes() + "/" + fecha.getAnio()%100);
            }
            else{
                return (fecha.getDia() + "/" + fecha.getMes() + "/0" + fecha.getAnio());
            }
        }
    }
}
