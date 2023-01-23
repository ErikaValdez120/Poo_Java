package UML1;

public class Lata {
	private int idLata;

	public Lata(int idLata) {
		super();
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
