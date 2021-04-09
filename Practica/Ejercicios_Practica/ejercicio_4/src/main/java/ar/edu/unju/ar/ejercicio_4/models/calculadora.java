package ar.edu.unju.ar.ejercicio_4.models;

public class calculadora {
    private float suma,cuadrado,producto,division;

    public calculadora() {}
    
    public calculadora(float suma, float cuadrado, float producto, float division) {
        this.suma = suma;
        this.cuadrado = cuadrado;
        this.producto = producto;
        this.division = division;
    }
    public float getSuma(float num1, float num2) {
        suma = num1 + num2;
        return suma;
    }
    public void setSuma(float suma) {
        this.suma = suma;
    }

    public float getcuadrado(float num) {
        cuadrado = num * num;
        return cuadrado;
    }
    public void setcuadrado(float cuadrado) {
        this.cuadrado = cuadrado;
    }

    public float getProducto(float num1, float num2) {
        producto = num1 * num2;
        if (num1<0){
            if (num2>0){
                producto *= -1;
            }
        }
        else{
            if(num2<0){
                producto *= -1;
            }
        }
        return producto;
    }
    public void setProducto(float producto) {
        this.producto = producto;
    }
    
    public float getDivision(float num1, float num2) {
        division = num1 / num2;
        if (num1<0){
            if (num2>0){
                division *= -1;
            }
        }
        else{
            if(num2<0){
                division *= -1;
            }
        }
        return division;
    }
    public void setDivision(float division) {
        this.division = division;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Float.floatToIntBits(cuadrado);
        result = prime * result + Float.floatToIntBits(division);
        result = prime * result + Float.floatToIntBits(producto);
        result = prime * result + Float.floatToIntBits(suma);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof calculadora)) {
            return false;
        }
        calculadora other = (calculadora) obj;
        if (Float.floatToIntBits(cuadrado) != Float.floatToIntBits(other.cuadrado)) {
            return false;
        }
        if (Float.floatToIntBits(division) != Float.floatToIntBits(other.division)) {
            return false;
        }
        if (Float.floatToIntBits(producto) != Float.floatToIntBits(other.producto)) {
            return false;
        }
        if (Float.floatToIntBits(suma) != Float.floatToIntBits(other.suma)) {
            return false;
        }
        return true;
    }
}
