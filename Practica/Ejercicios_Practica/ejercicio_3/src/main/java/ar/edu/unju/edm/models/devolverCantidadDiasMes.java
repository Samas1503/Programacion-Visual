package ar.edu.unju.edm.models;

public class devolverCantidadDiasMes {
    public int devolver(int mes, int anio){
        int cant = new procesoFecha().getAnio();
        boolean band = new validarBisiesto().validar(anio);
        switch(mes){
            case 1:
                cant = 31;
            break;
            case 2:
                if(band){
                    cant = 29;
                }
                else{
                    cant = 28;
                }
            break;
            case 3:
                cant = 31;
            break;
            case 4:
                cant = 30;
            break;
            case 5:
                cant = 31;
            break;
            case 6:
                cant = 30;
            break;
            case 7:
                cant = 31;
            break;
            case 8:
                cant = 31;
            break;
            case 9:
                cant = 30;
            break;
            case 10:
                cant = 31;
            break;
            case 11:
                cant = 30;
            break;
            case 12:
                cant = 31;
            break;
            default:
                band = false;
        }
        return cant;
    }
}
