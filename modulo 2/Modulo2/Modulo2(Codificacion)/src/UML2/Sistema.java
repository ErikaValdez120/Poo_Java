package UML2;

import java.time.LocalTime;
import java.util.ArrayList;

public class Sistema {
	private int numeroDeTramite;
	private LocalTime fecha;
	private ArrayList<Alumno>lstAlumnos=new ArrayList<Alumno>();
	
	public Sistema(int numeroDeTramite, LocalTime fecha) {
		super();
		this.numeroDeTramite = numeroDeTramite;
		this.fecha = fecha;
	}

	public int getNumeroDeTramite() {
		return numeroDeTramite;
	}

	public void setNumeroDeTramite(int numeroDeTramite) {
		this.numeroDeTramite = numeroDeTramite;
	}

	public LocalTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalTime fecha) {
		this.fecha = fecha;
	}

	public ArrayList<Alumno> getLstAlumnos() {
		return lstAlumnos;
	}

	public void setLstAlumnos(ArrayList<Alumno> lstAlumnos) {
		this.lstAlumnos = lstAlumnos;
	}

	@Override
	public String toString() {
		return "Sistema [numeroDeTramite=" + numeroDeTramite + ", fecha=" + fecha + ", lstAlumnos=" + lstAlumnos + "]";
	}
	
	public boolean agregarAlumno(long dni,String nombre,String direc) {
		Alumno a=new Alumno(dni,nombre,direc);
		return this.lstAlumnos.add(a);//true=se agrego a la lista
	}
	
	public Alumno traerAlumno(long dni) {
		boolean retorno=false;
		int i=0;
		Alumno aux=null;
		while(i<lstAlumnos.size() && retorno==false) {
			if(lstAlumnos.get(i).getDni()==dni) {
				aux=lstAlumnos.get(i);
				retorno=true;
			}
		}
		return aux;
	}
	public Carrera traerCarrera(String nombre) {
		boolean retorno=false;
		int i=0;
		Carrera aux=null;
		while(i<lstAlumnos.size() && retorno==false) {
			if(lstAlumnos.get(i).getCarrera().getNombre().equals(nombre)) {//veo si es la carrera que pide por parametro
				retorno=true;
				aux=lstAlumnos.get(i).getCarrera();
			}
		}
		return aux;
	}
	
}
