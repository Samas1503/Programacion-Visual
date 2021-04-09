package ar.edu.unju.edm.controller;

import ar.edu.unju.edm.models.Cuentas;

public class cuentaController {
	public void operarCuenta() {
		Cuentas nuevaCuenta = new Cuentas();
		
		int numCuenta = 1;
		int dni = 12345678;
		double saldo = 6000,extraer = 15000, depositar = 5000;
		String nombre = "pedro";
		
		Cuentas otraCuenta = new Cuentas(numCuenta,dni,saldo,nombre);
		
		System.out.println("El numero de la cuenta nueva es: " + nuevaCuenta.getNumCuenta());
		System.out.println("El valor del DNI de la cuenta nueva es: " + nuevaCuenta.getDni());
		System.out.println("El saldo de la cuenta nueva es: $" + nuevaCuenta.getSaldo());
		System.out.println("El nombre del nuevo propietario es: " + nuevaCuenta.getNombre());

		System.out.println("El numero de la otra cuenta es: " + otraCuenta.getNumCuenta());
		System.out.println("El valor del DNI de la otra cuenta es: " + otraCuenta.getDni());
		System.out.println("El saldo de la otra cuenta es: $" + otraCuenta.getSaldo());
		System.out.println("El nombre del otro propietario es: " + otraCuenta.getNombre());
		
		otraCuenta.depositar(depositar);
		System.out.println("SE HAN DEPOSITADO: $" + depositar + " EN SU CUENTA");

		if (extraer > saldo) {
			System.out.println("NO ES POSIBLE LA EXTRACCION DE $" + extraer + ", SALDO INSUFICIENTE");
		}else {
		otraCuenta.extraer(extraer);
		}

		System.out.println("El numero de la otra cuenta es: " + otraCuenta.getNumCuenta());
		System.out.println("El valor del DNI de la otra cuenta es: " + otraCuenta.getDni());
		System.out.println("El saldo de la otra cuenta es: $" + otraCuenta.getSaldo());
		System.out.println("El nombre del otro propietario es: " + otraCuenta.getNombre());
	}
}
