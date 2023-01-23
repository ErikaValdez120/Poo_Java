package UML2;

import java.util.ArrayList;

public class Carrera {
	private String nombre;
	ArrayList<Asignatura> lstAsignaturas=new ArrayList<Asignatura>();
	
	public Carrera(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	public ArrayList<Asignatura> getLstAsignaturas() {
		return lstAsignaturas;
	}

	public void setLstAsignaturas(ArrayList<Asignatura> lstAsignaturas) {
		this.lstAsignaturas = lstAsignaturas;
	}

	
	@Override
	public String toString() {
		return "Carrera [nombre=" + nombre + ", lstAsignaturas=" + lstAsignaturas + "]";
	}

	public boolean agregarAsignatura(String nombre, int cantidadDeHoras, int cuatrimetre, String tipo) {
		 Asignatura a=new Asignatura(nombre,cantidadDeHoras,cuatrimetre,tipo);
		 boolean retorno=false;
		 if(a!=null) {//verifica si se creo la carrera
			 retorno=true;
			 lstAsignaturas.add(a);
		 }
		 return retorno;//devuelve true si se creo sino false
	}
}
