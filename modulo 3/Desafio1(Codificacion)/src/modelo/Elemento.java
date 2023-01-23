package modelo;

public class Elemento {
	
	Cliente cliente;
	private String tipoDeElemento;
	private int cantidad;
	
	
	public Elemento(String tipoDeElemento, int cantidad) {
		super();
		this.tipoDeElemento = tipoDeElemento;
		this.cantidad = cantidad;
	}
	
	
	

	public Elemento(Cliente cliente, String tipoDeElemento, int cantidad) {
		super();
		this.cliente = cliente;
		this.tipoDeElemento = tipoDeElemento;
		this.cantidad = cantidad;
	}





	public String getTipoDeElemento() {
		return tipoDeElemento;
	}


	public void setTipoDeElemento(String tipoDeElemento) {
		this.tipoDeElemento = tipoDeElemento;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}




	@Override
	public String toString() {
		return "\nElemento [cliente=" + cliente + ", tipoDeElemento=" + tipoDeElemento + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
