package UML3;

public class Banco {
	private String nombre;
	private String direccion;
	private Cliente cliente;
	private FondoDeInversion fondoDeInversion;
	private CuentaCorriente cuentaCorriente;
	private CajaDeAhorro cajaDeAhorro;
	private CarterasDeValores carterasDeValores;
	
	

	public Banco(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public FondoDeInversion getFondoDeInversion() {
		return fondoDeInversion;
	}

	public void setFondoDeInversion(FondoDeInversion fondoDeInversion) {
		this.fondoDeInversion = fondoDeInversion;
	}

	public CuentaCorriente getCuentaCorriente() {
		return cuentaCorriente;
	}

	public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}

	public CajaDeAhorro getCajaDeAhorro() {
		return cajaDeAhorro;
	}

	public void setCajaDeAhorro(CajaDeAhorro cajaDeAhorro) {
		this.cajaDeAhorro = cajaDeAhorro;
	}

	public CarterasDeValores getCarterasDeValores() {
		return carterasDeValores;
	}

	public void setCarterasDeValores(CarterasDeValores carterasDeValores) {
		this.carterasDeValores = carterasDeValores;
	}

	
	
	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", direccion=" + direccion + ", cliente=" + cliente + ", fondoDeInversion="
				+ fondoDeInversion + ", cuentaCorriente=" + cuentaCorriente + ", cajaDeAhorro=" + cajaDeAhorro
				+ ", carterasDeValores=" + carterasDeValores + "]";
	}
	
}
