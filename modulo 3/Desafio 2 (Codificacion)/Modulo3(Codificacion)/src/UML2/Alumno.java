package UML2;

import java.util.ArrayList;

public class Alumno extends Persona {
	private String carrera;
	private ArrayList<Asignatura> lstCursando=new ArrayList<Asignatura>();
	private HistorialAcademico historial;
	
	public Alumno(Long dni, String nombre, String direccion, String carrera) {
		super(dni, nombre, direccion);
		this.carrera = carrera;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public ArrayList<Asignatura> getLstCursando() {
		return lstCursando;
	}

	public void setLstCursando(ArrayList<Asignatura> lstCursando) {
		this.lstCursando = lstCursando;
	}
	
	public HistorialAcademico getHistorial() {
		return historial;
	}

	public void setHistorial(HistorialAcademico historial) {
		this.historial = historial;
	}

	@Override
	public String toString() {
		return "Alumno [carrera=" + carrera + ", lstCursando=" + lstCursando + ", historial=" + historial + ", dni="
				+ dni + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	public boolean agregarCursando(Asignatura asignatura) {
		 lstCursando.add(asignatura);
	return true;
}

	@Override
	public String calcularDescuentoComedor() {
		String descuento="15%";
		return descuento;
	}
	
	 
	
	
	
	
	
}
