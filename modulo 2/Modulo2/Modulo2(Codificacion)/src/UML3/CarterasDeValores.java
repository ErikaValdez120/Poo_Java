package UML3;

public class CarterasDeValores {
	private String nombre;
	private int titulos;
	private float cotizacion;
	
	public CarterasDeValores(String nombre, int titulos, float cotizacion) {
		super();
		this.nombre = nombre;
		this.titulos = titulos;
		this.cotizacion = cotizacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTitulos() {
		return titulos;
	}
	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}
	public float getCotizacion() {
		return cotizacion;
	}
	public void setCotizacion(float cotizacion) {
		this.cotizacion = cotizacion;
	}
	@Override
	public String toString() {
		return "CarterasDeValores [nombre=" + nombre + ", titulos=" + titulos + ", cotizacion=" + cotizacion + "]";
	}
	
	
	
}
