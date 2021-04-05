package ar.edu.unju.edm.models;

public class mostrarFormatoReducido {
    public void reducido(procesoFecha fecha){
        if (fecha.getAnio()%100==0){
            System.out.println(fecha.getDia() + "/" + fecha.getMes() + "/" + fecha.getAnio());
        }
        else{
            if (fecha.getAnio()%100 >= 10){
                System.out.println(fecha.getDia() + "/" + fecha.getMes() + "/" + fecha.getAnio());
            }
            else{
                System.out.println(fecha.getDia() + "/" + fecha.getMes() + "/0" + fecha.getAnio());
            }
        }
    }
}
