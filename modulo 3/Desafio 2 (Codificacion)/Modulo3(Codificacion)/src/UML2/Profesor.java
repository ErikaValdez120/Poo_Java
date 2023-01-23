package UML2;

public class Profesor extends Persona {
	
	private String departamento;
	private int legajo;

	public Profesor(Long dni, String nombre, String direccion, String departamento,int legajo ) {
		super(dni, nombre, direccion);
		this.departamento = departamento;
		this.legajo=legajo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	@Override
	public String toString() {
		return "Profesor [departamento=" + departamento + ", legajo=" + legajo + ", dni=" + dni + ", nombre=" + nombre
				+ ", direccion=" + direccion + "]";
	}

	@Override
	public String calcularDescuentoComedor() {
		String descuento="25%";
		return descuento;
	}

	
	
	
}
