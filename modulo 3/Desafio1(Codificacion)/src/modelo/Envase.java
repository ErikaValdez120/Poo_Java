package modelo;

public class Envase extends Elemento {

	private int idEnvase;

	
	public Envase(Cliente cliente,String tipoDeElemento, int cantidad, int idEnvase) {
		super(tipoDeElemento, cantidad);
		this.idEnvase = idEnvase;
	}



	public int getIdEnvase() {
		return idEnvase;
	}



	public void setIdEnvase(int idEnvase) {
		this.idEnvase = idEnvase;
	}



	@Override
	public String toString() {
		return "Envase [idEnvase=" + idEnvase + "]";
	}
	
	
	
}
