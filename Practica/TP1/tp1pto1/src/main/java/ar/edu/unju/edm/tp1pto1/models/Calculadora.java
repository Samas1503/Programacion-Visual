package ar.edu.unju.edm.tp1pto1.models;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    private double num1,num2;

    public Calculadora() {}
    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Calculadora [num1=" + num1 + ", num2=" + num2 + "]";
    }
 
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
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
        if (num2==0){
            return 0.0;
        } else if (num2<0){
            return ((num1/num2)*(-1));
        }
        else{
            return num1/num2;
        }
    }

    public double multilpicar(){
        if ( num2 == 0){
            return 0.0;
        } else if (num2 < 0){
            return ((num1*num2)*(-1));
        } else {
            return num1*num2;
        }
    }

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
