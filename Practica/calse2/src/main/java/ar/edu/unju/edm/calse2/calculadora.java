package ar.edu.unju.edm.calse2;

public class calculadora {
    private int suma;
	private int resta;
	private int division;
	private int multiplicacion;
    int num1;
    int num2;
    String sumar="Sumar";
    String restar="Restar";
    String multiplicar="Multiplicar";
    String dividir="Dividir";
		
	public  calculadora() {}
	
    public calculadora(int num1,int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public calculadora(int suma, int resta, int division, int multiplicacion) {
		super();
		this.suma = suma;
		this.resta = resta;
		this.division = division;
		this.multiplicacion = multiplicacion;
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

	public int getDivision() {
		return num1/num2;
	}

	public void setDivision(int division) {
		this.division = division;
	}

	public int getMultiplicacion() {
		return num1*num2;
	}

	public void setMultiplicacion(int multiplicacion) {
		this.multiplicacion = multiplicacion;
	}


	public String sumar() {
		return sumar;
	}
	public String restar() {
		return restar;
	}
	public String multiplicar() {
		return multiplicar;
	}
	public String dividir() {
		return dividir;
	}

	@Override
	public String toString() {
		return "Calculadora [suma=" + suma + ", resta=" + resta + ", division=" + division + ", multiplicacion="
				+ multiplicacion + "]";
	}
}
