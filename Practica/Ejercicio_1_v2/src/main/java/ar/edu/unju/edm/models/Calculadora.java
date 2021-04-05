package ar.edu.unju.edm.models;

public class Calculadora {
	private int num1;
	private int num2;
	private int suma;
	private int resta;
	private int multiplicacion;
	private int division;
		
	public Calculadora() {
		
	}
	
	public Calculadora(int suma, int resta, int multiplicacion, int division) {
		super();
		this.suma = suma;
		this.resta = resta;
		this.multiplicacion = multiplicacion;
		this.division = division;
	}

	public Calculadora(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getSuma() {
		return num1+num2;
	}

	public void setSuma(int suma) {
		this.suma = suma;
	}

	public int getResta() {
		return num1-num2;
	}

	public void setResta(int resta) {
		this.resta = resta;
	}

	public int getMultiplicacion() {
		return num1*num2;
	}

	public void setMultiplicacion(int multiplicacion) {
		this.multiplicacion = multiplicacion;
	}

	public int getDivision() {
		return num1/num2;
	}

	public void setDivision(int division) {
		this.division = division;
	}

	@Override
	public String toString() {
		return "Calculadora [suma=" + suma + ", resta=" + resta + ", multiplicacion=" + multiplicacion + ", division="
				+ division + "]";
	}

}