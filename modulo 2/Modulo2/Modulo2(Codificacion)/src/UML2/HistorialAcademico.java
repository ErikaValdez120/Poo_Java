package UML2;

import java.util.ArrayList;

public class HistorialAcademico {
	private int notaFinal;
	private ArrayList<Asignatura>lstAsignaturas=new ArrayList<Asignatura>();
	
	public HistorialAcademico(int notaFinal) {
		super();
		this.notaFinal = notaFinal;
	}

	public int getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}

	public ArrayList<Asignatura> getLstAsignaturas() {
		return lstAsignaturas;
	}

	public void setLstAsignaturas(ArrayList<Asignatura> lstAsignaturas) {
		this.lstAsignaturas = lstAsignaturas;
	}

	@Override
	public String toString() {
		return "HistorialAcademico [notaFinal=" + notaFinal + ", lstAsignaturas=" + lstAsignaturas + "]";
	}
	
	
}
