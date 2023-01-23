package modelo;

public class Lata extends Elemento {

	private int idLata;

	public Lata(Cliente cliente, String tipoDeElemento, int cantidad, int idLata) {
		super(tipoDeElemento, cantidad);
		this.idLata = idLata;
	}

	public int getIdLata() {
		return idLata;
	}

	public void setIdLata(int idLata) {
		this.idLata = idLata;
	}

	@Override
	public String toString() {
		return "Lata [idLata=" + idLata + "]";
	}
	
	
	
}
