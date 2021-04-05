package ar.edu.unju.edm.models;

public class validarBisiesto {
    public boolean validar(int anio){
        if(anio%4==0){
            return true;
        }
        else{
            return false;
        }
    }
}
