package ar.unju.edu.edm.practica2;

public class rectangulo {
    int base;

    int altura;

    int superficie;

    public int calcularSuperficie (int base, int altura) {
            return base * altura;
    }

    public int calcularPerimetro(int base, int altura){
        return base*2 + altura*2;
    }

    public int getAltura(){
        return altura;        
    }

    public int setAltura(int altura){
        return altura;
    }

    public int getBase(){
        return base;        
    }

    public int setBase(int base){
        return base;
    }

    public int getSuperficie(){
        return superficie;        
    }

    public int setSuperficieint (int superficie){
        return superficie;
    }

}

