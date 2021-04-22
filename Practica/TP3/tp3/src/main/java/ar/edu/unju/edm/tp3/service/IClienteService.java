package ar.edu.unju.edm.tp3.service;

import java.util.List;

import ar.edu.unju.edm.tp3.model.Clientes;

public interface IClienteService {
//import org.springframework.stereotype.Service;
	public void guardarCliente(Clientes unCliente);
	public Clientes crearCliente();
	public List<Clientes> obtenerTodosClientes();

}
