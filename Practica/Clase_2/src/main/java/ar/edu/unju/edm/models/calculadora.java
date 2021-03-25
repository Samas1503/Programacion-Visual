package ar.edu.unju.edm.models;

public class calculadora {
	private int suma,resta,division,multiplicacion;
	private String color,marca,modelo;
	private boolean operando1,operando2;
    int num1,num2;
    String sumar="Sumar: ",restar="Restar: ",multiplicar="Multiplicar: ",dividir="Dividir: ";
	
    public calculadora() {}
	        
	public calculadora(String sumar, String restar, String multiplicar, String dividir) {
		super();
		this.sumar = sumar;
		this.restar = restar;
		this.multiplicar = multiplicar;
		this.dividir = dividir;
	}

	public calculadora(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public calculadora(String color, String marca, String modelo, boolean operando1, boolean operando2) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.operando1 = operando1;
		this.operando2 = operando2;
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

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isOperando1() {
		return operando1;
	}
	public void setOperando1(boolean operando1) {
		this.operando1 = operando1;
	}

	public boolean isOperando2() {
		return operando2;
	}
	public void setOperando2(boolean operando2) {
		this.operando2 = operando2;
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

	public String getSumar() {
		return sumar;
	}
	public void setSumar(String sumar) {
		this.sumar = sumar;
	}

	public String getRestar() {
		return restar;
	}
	public void setRestar(String restar) {
		this.restar = restar;
	}

	public String getMultiplicar() {
		return multiplicar;
	}
	public void setMultiplicar(String multiplicar) {
		this.multiplicar = multiplicar;
	}

	public String getDividir() {
		return dividir;
	}
	public void setDividir(String dividir) {
		this.dividir = dividir;
	}

	@Override
	public String toString() {
		return "calculadora [suma=" + suma + ", resta=" + resta + ", division=" + division + ", multiplicacion="
				+ multiplicacion + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", operando1="
				+ operando1 + ", operando2=" + operando2 + ", sumar=" + sumar + ", restar=" + restar + ", multiplicar="
				+ multiplicar + ", dividir=" + dividir + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((dividir == null) ? 0 : dividir.hashCode());
		result = prime * result + division;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + multiplicacion;
		result = prime * result + ((multiplicar == null) ? 0 : multiplicar.hashCode());
		result = prime * result + num1;
		result = prime * result + num2;
		result = prime * result + (operando1 ? 1231 : 1237);
		result = prime * result + (operando2 ? 1231 : 1237);
		result = prime * result + resta;
		result = prime * result + ((restar == null) ? 0 : restar.hashCode());
		result = prime * result + suma;
		result = prime * result + ((sumar == null) ? 0 : sumar.hashCode());
		return result;
	}

	//metodo de comparacion entre objetos
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		calculadora other = (calculadora) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (dividir == null) {
			if (other.dividir != null)
				return false;
		} else if (!dividir.equals(other.dividir))
			return false;
		if (division != other.division)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (multiplicacion != other.multiplicacion)
			return false;
		if (multiplicar == null) {
			if (other.multiplicar != null)
				return false;
		} else if (!multiplicar.equals(other.multiplicar))
			return false;
		if (num1 != other.num1)
			return false;
		if (num2 != other.num2)
			return false;
		if (operando1 != other.operando1)
			return false;
		if (operando2 != other.operando2)
			return false;
		if (resta != other.resta)
			return false;
		if (restar == null) {
			if (other.restar != null)
				return false;
		} else if (!restar.equals(other.restar))
			return false;
		if (suma != other.suma)
			return false;
		if (sumar == null) {
			if (other.sumar != null)
				return false;
		} else if (!sumar.equals(other.sumar))
			return false;
		return true;
	}
}
