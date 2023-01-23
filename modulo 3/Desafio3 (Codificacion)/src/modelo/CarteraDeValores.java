package modelo;

public class CarteraDeValores {

	
	private int valoresAsociados;
	private String nombreValor;
	private int numeroTitulo;
	private float precioCotizacion;
	
	
	
	public CarteraDeValores(int valoresAsociados, String nombreValor, int numeroTitulo, float precioCotizacion) {
		super();
		this.valoresAsociados = valoresAsociados;
		this.nombreValor = nombreValor;
		this.numeroTitulo = numeroTitulo;
		this.precioCotizacion = precioCotizacion;
	}



	public int getValoresAsociados() {
		return valoresAsociados;
	}



	public void setValoresAsociados(int valoresAsociados) {
		this.valoresAsociados = valoresAsociados;
	}



	public String getNombreValor() {
		return nombreValor;
	}



	public void setNombreValor(String nombreValor) {
		this.nombreValor = nombreValor;
	}



	public int getNumeroTitulo() {
		return numeroTitulo;
	}



	public void setNumeroTitulo(int numeroTitulo) {
		this.numeroTitulo = numeroTitulo;
	}



	public float getPrecioCotizacion() {
		return precioCotizacion;
	}



	public void setPrecioCotizacion(float precioCotizacion) {
		this.precioCotizacion = precioCotizacion;
	}



	@Override
	public String toString() {
		return "CarteraDeValores [valoresAsociados=" + valoresAsociados + ", nombreValor=" + nombreValor
				+ ", numeroTitulo=" + numeroTitulo + ", precioCotizacion=" + precioCotizacion + "]";
	}
	
	
}
