package UML1;

public class Botella {
	private int idBotella;

	public Botella(int idBotella) {
		super();
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
		return "Botella [idBotella=" + idBotella + "]";
	}
	
	
}
