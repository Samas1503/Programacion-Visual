package ar.edu.unju.edm.models;

public class Cuentas {
	private int numCuenta;
	private int dni;
	private double saldo;
	String nombre;
	
	//Constructor sin parametros
	public Cuentas() {}

	//Constructor con parametros
	public Cuentas(int numCuenta, int dni, double saldo, String nombre) {
		super();
		this.numCuenta = numCuenta;
		this.dni = dni;
		this.saldo = saldo;
		this.nombre = nombre;
	}

	public void extraer(double monto) {
		saldo = saldo - monto;
	}
	
	public void depositar(double monto) {
		saldo = saldo + monto;
	}
	
	public int getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dni;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + numCuenta;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuentas other = (Cuentas) obj;
		if (dni != other.dni)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numCuenta != other.numCuenta)
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}
}
