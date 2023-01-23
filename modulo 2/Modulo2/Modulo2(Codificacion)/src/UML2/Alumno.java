package UML2;

import java.util.ArrayList;

public class Alumno {
	private long dni;
	private String nombre;
	private String direccion;
	private Carrera carrera;
	private ArrayList<Asignatura>lstCursando =new ArrayList<Asignatura>();
	private ArrayList<HistorialAcademico>lstAprobadas =new ArrayList<HistorialAcademico>();
	
	public Alumno(long dni, String nombre, String direccion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
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

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public ArrayList<Asignatura> getLstCursando() {
		return lstCursando;
	}

	public void setLstCursando(ArrayList<Asignatura> lstCursando) {
		this.lstCursando = lstCursando;
	}

	public ArrayList<HistorialAcademico> getLstAprobadas() {
		return lstAprobadas;
	}

	public void setLstAprobadas(ArrayList<HistorialAcademico> lstAprobadas) {
		this.lstAprobadas = lstAprobadas;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", carrera=" + carrera
				+ ", lstCursando=" + lstCursando + ", lstAprobadas=" + lstAprobadas + "]";
	}
	
	public boolean agregarCarrera(String nombre) {
		 carrera=new Carrera(nombre);
		 boolean retorno=false;
		 if(carrera!=null) {//verifica si se creo la carrera
			 retorno=true;
		 }
		 return retorno;//devuelve true si se creo sino false
	}
	public boolean agregarCursando(Asignatura asignatura) {
			 lstCursando.add(asignatura);
		return true;
	}
	
}
