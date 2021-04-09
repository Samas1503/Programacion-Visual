package ar.edu.unju.fi.tp1pto2.paredes_samuel_tp1_2.models;

public class Calculadora {
    private double suma,resta,producto,cociente;
    public Calculadora() {}
    public Calculadora(double suma, double resta, double producto, double cociente) {
        this.suma = suma;
        this.resta = resta;
        this.producto = producto;
        this.cociente = cociente;
    }
    public double getSuma(double num1, double num2) {
        suma= num1 + num2;
        return suma;
    }
    public void setSuma(double suma) {
        this.suma = suma;
    }
    public double getResta(double num1, double num2) {
        resta = num1 - num2;
        return resta;
    }
    public void setResta(double resta) {
        this.resta = resta;
    }
    public double getProducto(double num1, double num2) {
        producto = num1*num2;
        return cociente;
    }
    public void setProducto(double producto) {
        this.producto = producto;
    }
    public double getCociente(double num1, double num2) {
        cociente =num1/num2;
        return cociente;
    }
    public void setCociente(double cociente) {
        this.cociente = cociente;
    }
    @Override
    public String toString() {
        return "Calculadora [cociente=" + cociente + ", producto=" + producto + ", resta=" + resta + ", suma=" + suma
                + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(cociente);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(producto);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(resta);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(suma);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Calculadora)) {
            return false;
        }
        Calculadora other = (Calculadora) obj;
        if (Double.doubleToLongBits(cociente) != Double.doubleToLongBits(other.cociente)) {
            return false;
        }
        if (Double.doubleToLongBits(producto) != Double.doubleToLongBits(other.producto)) {
            return false;
        }
        if (Double.doubleToLongBits(resta) != Double.doubleToLongBits(other.resta)) {
            return false;
        }
        if (Double.doubleToLongBits(suma) != Double.doubleToLongBits(other.suma)) {
            return false;
        }
        return true;
    }
}
