package UML3;

public class Cliente {
	private long dni;
	private String nombre;
	private String direccion;
	private long telfono;
	
	public Cliente(long dni, String nombre, String direccion, long telfono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telfono = telfono;
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
	public long getTelfono() {
		return telfono;
	}
	public void setTelfono(long telfono) {
		this.telfono = telfono;
	}
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", telfono=" + telfono + "]";
	}
	
	
	
	
}
