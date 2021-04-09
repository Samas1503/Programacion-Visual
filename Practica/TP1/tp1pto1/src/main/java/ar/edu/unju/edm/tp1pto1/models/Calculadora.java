package ar.edu.unju.edm.tp1pto1.models;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    private double num1,num2;

    public Calculadora() {
    }
    /**
     * @param num1
     * @param num2
     */
    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Calculadora [num1=" + num1 + ", num2=" + num2 + "]";
    }
    /**
     * @return the num1
     */
    public double getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public double getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double suma(){
        return num1+num2;
    }
    public double resta(){
        return num1-num2;
    }

    public double dividir(){
        return num1/num2;
    }

    public double multilpicar(){
        return num1*num2;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(num1);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(num2);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Calculadora)) {
            return false;
        }
        Calculadora other = (Calculadora) obj;
        if (Double.doubleToLongBits(num1) != Double.doubleToLongBits(other.num1)) {
            return false;
        }
        if (Double.doubleToLongBits(num2) != Double.doubleToLongBits(other.num2)) {
            return false;
        }
        return true;
    }
}
