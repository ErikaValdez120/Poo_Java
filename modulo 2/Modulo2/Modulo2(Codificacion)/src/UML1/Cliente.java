package UML1;

public class Cliente {
	private int idCliente;
	private int elementosDepositados;
	private Lata lata;
	private Botella botella;
	private Envase envase;
	
	public Cliente(int idCliente, int elementosDepositados, Lata lata, Botella botella, Envase envase) {
		super();
		this.idCliente = idCliente;
		this.elementosDepositados = elementosDepositados;
		this.lata = lata;
		this.botella = botella;
		this.envase = envase;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getElementosDepositados() {
		return elementosDepositados;
	}

	public void setElementosDepositados(int elementosDepositados) {
		this.elementosDepositados = elementosDepositados;
	}

	public Lata getLata() {
		return lata;
	}

	public void setLata(Lata lata) {
		this.lata = lata;
	}

	public Botella getBotella() {
		return botella;
	}

	public void setBotella(Botella botella) {
		this.botella = botella;
	}

	public Envase getEnvase() {
		return envase;
	}

	public void setEnvase(Envase envase) {
		this.envase = envase;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", elementosDepositados=" + elementosDepositados + ", lata=" + lata
				+ ", botella=" + botella + ", envase=" + envase + "]";
	}
	
	public void devolverElemento(){
		this.elementosDepositados++;//aumento el valor
		this.lata=null;
	}

	
	
}
