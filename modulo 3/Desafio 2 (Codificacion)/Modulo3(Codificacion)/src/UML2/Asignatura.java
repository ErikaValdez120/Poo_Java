package UML2;

public class Asignatura {
	private String nombre;
	private int cantidadDeHoras;
	private int cuatrimestre;
	private String tipo;
	
	public Asignatura(String nombre, int cantidadDeHoras, int cuatrimestre, String tipo) {
		super();
		this.nombre = nombre;
		this.cantidadDeHoras = cantidadDeHoras;
		this.cuatrimestre = cuatrimestre;
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

	public int getCuatrimestre() {
		return cuatrimestre;
	}

	public void setCuatrimestre(int cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", cantidadDeHoras=" + cantidadDeHoras + ", cuatrimestre="
				+ cuatrimestre + ", tipo=" + tipo + "]";
	}
	
	
}
