package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

	List<Elemento> lstElementosDevueltos = new ArrayList<Elemento>();
	List<Cliente> lstClientes = new ArrayList<Cliente>();
	List<Botella> lstBotellas = new ArrayList<Botella>();

	public List<Botella> getLstBotellas() {
		return lstBotellas;
	}

	public void setLstBotellas(List<Botella> lstBotellas) {
		this.lstBotellas = lstBotellas;
	}

	public List<Elemento> getLstElementosDevueltos() {
		return lstElementosDevueltos;
	}

	public void setLstElementosDevueltos(List<Elemento> lstElementosDevueltos) {
		this.lstElementosDevueltos = lstElementosDevueltos;
	}

	public List<Cliente> getLstClientes() {
		return lstClientes;
	}

	public void setLstClientes(List<Cliente> lstClientes) {
		this.lstClientes = lstClientes;
	}

	public void devolverElemento(Cliente cliente, String tipoDeElemento, int cantidad) {

		Elemento elem = new Elemento(cliente, tipoDeElemento, cantidad);
		lstElementosDevueltos.add(elem);

	}

	public void devolverEnvase(Cliente cliente, String tipoDeElemento, int cantidad, int idEnvase) {
		Elemento elementoEnvase = new Envase(cliente, tipoDeElemento, cantidad, idEnvase);
		lstElementosDevueltos.add(elementoEnvase);
		
	}

	public void devolverBotella(Cliente cliente, String tipoDeElemento, int cantidad, int idBotella) {
		Elemento elementoEnvase = new Botella(cliente, tipoDeElemento, cantidad, idBotella);
		lstElementosDevueltos.add(elementoEnvase);
		lstBotellas.add((Botella) elementoEnvase);

	}

	public void devolverLata(Cliente cliente, String tipoDeElemento, int cantidad, int idLata) {
		Elemento elementoEnvase = new Lata(cliente, tipoDeElemento, cantidad, idLata);
		lstElementosDevueltos.add(elementoEnvase);

	}

	public void agregarCliente() {

		int idCliente = 1;
		if (this.getLstClientes() == null) {
			Cliente cli = new Cliente(idCliente);
			lstClientes.add(cli);
		} else {
			idCliente = lstClientes.get(lstClientes.size() - 1).getIdCliente() + 1;
		}

	}

	public void agregarBotella(String tipoDeElemento, int cantidad) {

		int idBotella = 1;
		if (this.getLstBotellas() == null) {
			Botella bo = new Botella(tipoDeElemento, cantidad, idBotella);
			lstBotellas.add(bo);
		} else {
			idBotella = lstBotellas.get(lstBotellas.size() - 1).getIdBotella() + 1;
		}

	}

	public Cliente traerCliente(int idCliente) {
		Cliente cliente = null;
		int i = 0;
		while (cliente == null && i < lstClientes.size()) {
			if (lstClientes.get(i).getIdCliente() == idCliente) {
				cliente = lstClientes.get(i);
			}
			i++;
		}
		return cliente;
	}

	public Botella traerBotella(int idBotella) {
		Botella bot = null;
		int i = 0;
		while (bot == null && i < lstBotellas.size()) {
			if (lstBotellas.get(i).getIdBotella() == idBotella) {
				bot = lstBotellas.get(i);
			}
			i++;
		}
		return bot;

	}

	public int totalElementosDevueltos() {
		int totalElementos = 0;

		for (int i = 0; i < lstElementosDevueltos.size(); i++) {

			totalElementos = totalElementos + lstElementosDevueltos.get(i).getCantidad();
		}

		return totalElementos;
	}

}// fin clase
