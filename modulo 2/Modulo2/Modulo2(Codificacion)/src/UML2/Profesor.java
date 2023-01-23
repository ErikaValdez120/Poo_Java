package UML2;

public class Profesor {
	private long dni;
	private String nombre;
	private String direccion;
	private String departamento;
	
	public Profesor(long dni, String nombre, String direccion, String departamento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.departamento = departamento;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
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

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Profesor [dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", departamento="
				+ departamento + "]";
	}
	
	
	
}
