package UML2;

import java.util.ArrayList;

public class HistorialAcademico {
	private ArrayList<Asignatura> Historial=new ArrayList<Asignatura>();
	private int notaFinal;
	
	public HistorialAcademico() {
		super();
	}
	public ArrayList<Asignatura> getHistorial() {
		return Historial;
	}
	public void setHistorial(ArrayList<Asignatura> historial) {
		Historial = historial;
	}
	public int getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}
	@Override
	public String toString() {
		return "HistorialAcademico [Historial=" + Historial + ", notaFinal=" + notaFinal + "]";
	}
	
	

}
