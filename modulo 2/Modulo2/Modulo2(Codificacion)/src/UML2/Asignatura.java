package UML2;

public class Asignatura {
	private String nombre;
	private int cantidadDeHoras;
	private int cuatrimetre;
	private String tipo;
	private Profesor profesor;
	
	public Asignatura(String nombre, int cantidadDeHoras, int cuatrimetre, String tipo) {
		super();
		this.nombre = nombre;
		this.cantidadDeHoras = cantidadDeHoras;
		this.cuatrimetre = cuatrimetre;
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadDeHoras() {
		return cantidadDeHoras;
	}
	public void setCantidadDeHoras(int cantidadDeHoras) {
		this.cantidadDeHoras = cantidadDeHoras;
	}
	public int getCuatrimetre() {
		return cuatrimetre;
	}
	public void setCuatrimetre(int cuatrimetre) {
		this.cuatrimetre = cuatrimetre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", cantidadDeHoras=" + cantidadDeHoras + ", cuatrimetre=" + cuatrimetre
				+ ", tipo=" + tipo + ", profesor=" + profesor + "]";
	}
	
	
	
}
