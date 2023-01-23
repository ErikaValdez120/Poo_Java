package UML2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {
	private int numeroDeTramite;
	private LocalDate fecha;
	private ArrayList<Persona> lstPersonas=new ArrayList<Persona>();
	
	public Sistema(int numeroDeTramite, LocalDate fecha) {
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

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public ArrayList<Persona> getLstPersonas() {
		return lstPersonas;
	}

	public void setLstPersonas(ArrayList<Persona> lstPersonas) {
		this.lstPersonas = lstPersonas;
	}

	@Override
	public String toString() {
		return "Sistema [numeroDeTramite=" + numeroDeTramite + ", fecha=" + fecha + ", lstPersonas=" + lstPersonas
				+ "]";
	}
	
	public boolean agregar(long dni,String nombre,String direc,String carrera) {
		Alumno a=new Alumno(dni,nombre,direc,carrera);
		return this.lstPersonas.add(a);//true=se agrego a la lista
	}
	
	public boolean agregar(long dni,String nombre,String direc,String departamento,int legajo) {
		Profesor a=new Profesor(dni,nombre,direc,departamento,legajo);
		return this.lstPersonas.add(a);//true=se agrego a la lista
	}
	
	public Alumno traerAlumno(long dni) {
		boolean retorno=false;
		int i=0;
		Alumno aux=null;
		while(i<lstPersonas.size() && retorno==false) {
			if(lstPersonas.get(i) instanceof Alumno) {
				if(lstPersonas.get(i).getDni()==dni) {
					aux=(Alumno) lstPersonas.get(i);
					retorno=true;
				}
			}
			
		}
		return aux;
	}
	public Profesor traerProfesor(long dni) {
		boolean retorno=false;
		int i=0;
		Profesor aux=null;
		while(i<lstPersonas.size() && retorno==false) {
			if(lstPersonas.get(i) instanceof Profesor) {
				if(lstPersonas.get(i).getDni()==dni) {
					aux=(Profesor) lstPersonas.get(i);
					retorno=true;
				}
			}
			
		}
		return aux;
	}
}
