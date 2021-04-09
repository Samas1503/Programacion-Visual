package ar.edu.unju.edm.models;

public class mostrarNombreMes {
    public String mostrarMes( procesoFecha fecha){
		String mesPal=new String();
		switch(fecha.getMes()){
			case 1:
				mesPal="Enero";
            break;
            case 2:
				mesPal="Febrero";
            break;
            case 3:
			    mesPal="Marzo";
            break;
            case 4:
			    mesPal="Abril";
            break;
            case 5:
			    mesPal="Mayo";
            break;
            case 6:
			    mesPal="Junio";
                break;
            case 7:
			    mesPal="Julio";
            break;
            case 8:
			    mesPal="Agosto";
            break;
            case 9:
			    mesPal="Septiembre";
            break;
            case 10:
			    mesPal="Octubre";
            break;
            case 11:
			    mesPal="Noviembre";
            break;
            case 12:
			    mesPal="Diciembre";
            break;
		}
        return (fecha.getDia() + " de " + mesPal + " del " + fecha.getAnio());
    }
}
