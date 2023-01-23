package modelo;

public class Botella extends Elemento {

	private int idBotella;

	
	
	public Botella(String tipoDeElemento, int cantidad, int idBotella) {
		super(tipoDeElemento, cantidad);
		this.idBotella = idBotella;
	}

	public Botella(Cliente cliente,String tipoDeElemento, int cantidad, int idBotella) {
		super(tipoDeElemento, cantidad);
		this.idBotella = idBotella;
	}

	public int getIdBotella() {
		return idBotella;
	}

	public void setIdBotella(int idBotella) {
		this.idBotella = idBotella;
	}

	@Override
	public String toString() {
		return "Botella [IdBotella()=" + getIdBotella()
				+ ", getTipoDeElemento()=" + getTipoDeElemento() + ", getCantidad()=" + getCantidad()  + "]";
	}

	
	
	
}
