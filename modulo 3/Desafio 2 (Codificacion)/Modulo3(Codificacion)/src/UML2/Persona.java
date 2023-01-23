package UML2;

import java.util.ArrayList;

public abstract class Persona {
	public long dni;
	public String nombre;
	public String direccion;
	private ArrayList<Asignatura> lstAsignaturas=new ArrayList<Asignatura>();
	
	public Persona(Long dni, String nombre, String direccion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
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

	public ArrayList<Asignatura> getLstAsignaturas() {
		return lstAsignaturas;
	}

	public void setLstAsignaturas(ArrayList<Asignatura> lstAsignaturas) {
		this.lstAsignaturas = lstAsignaturas;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", lstAsignaturas="
				+ lstAsignaturas + "]";
	}
//agregar metodo de descuento para que despues sea distinto para el alumno y profesor.
	public abstract String calcularDescuentoComedor();

}
