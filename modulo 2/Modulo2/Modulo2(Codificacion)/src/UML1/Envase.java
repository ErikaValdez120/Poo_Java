package UML1;

public class Envase {
	private int idEnvase;

	public Envase(int idEnvase) {
		super();
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
