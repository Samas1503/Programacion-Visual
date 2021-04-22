package ar.edu.unju.edm.tp3.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.tp3.model.Clientes;
import ar.edu.unju.edm.tp3.service.IClienteService;
import ar.edu.unju.edm.tp3.util.ListaDeClientes;

@Service
@Qualifier("unImp")
public class ClienteServiceImp implements IClienteService{
    private List<Clientes> listadoClientes = ListaDeClientes.clientes;
	
	@Autowired
	Clientes unCliente;

	public void guardarCliente(Clientes unCliente) {
		// TODO Auto-generated method stub
		listadoClientes.add(unCliente);
	}

	public Clientes crearCliente() {
		// TODO Auto-generated method stub
		return unCliente;
	}

	public List<Clientes> obtenerTodosClientes() {
		// TODO Auto-generated method stub
		return listadoClientes;
	}
}
