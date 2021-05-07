package ar.edu.unju.edm.tp3.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.tp3.model.Clientes;
import ar.edu.unju.edm.tp3.service.IClienteService;
import ar.edu.unju.edm.tp3.util.ListaDeClientes;

@Service
@Qualifier("OtroImp")
public class OtroImp implements IClienteService {
    private List<Clientes> listadoClientes = ListaDeClientes.clientes;
	
	@Autowired
	Clientes unCliente;

	@Override
	public void guardarCliente(Clientes unCliente) {
		listadoClientes.add(unCliente);
	}

	@Override
	public Clientes crearCliente() {
		return unCliente;
	}

	@Override
	public List<Clientes> obtenerTodosClientes() {
		return listadoClientes;
	}
}
