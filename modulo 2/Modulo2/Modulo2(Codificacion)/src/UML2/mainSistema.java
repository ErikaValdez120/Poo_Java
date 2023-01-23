package UML2;

import java.time.LocalTime;

public class mainSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sistema=new Sistema(1,LocalTime.now());
		//agrego un alumno al sistema
		System.out.println(sistema.agregarAlumno(12345678,"Nehuen","Luis Guillon"));
		System.out.println(sistema);
		//agrego una carrera al alumno de la lista con dni=12345678
		System.out.println(sistema.traerAlumno(12345678).agregarCarrera("Sistemas"));
		System.out.println(sistema);
		//agrego la asignaturas a la carrera "Sistemas"
		System.out.println(sistema.traerCarrera("Sistemas").agregarAsignatura("Programacion", 32, 1, "Obligatoria"));
		System.out.println(sistema);
		//agrego las asignaturas a la lista de cursando del alumno con dni"12345678" la asignatura con id 1
		sistema.traerAlumno(12345678).agregarCursando(sistema.traerCarrera("Sistemas").lstAsignaturas.get(0));
		System.out.println(sistema);
		//agrego una materia aprobada al alumno con dni 12345678
		
		Asignatura a=new Asignatura("Ingles", 60, 2, "Optativa");
		HistorialAcademico h=new HistorialAcademico(9);
		h.getLstAsignaturas().add(a);
		sistema.traerAlumno(12345678).getLstAprobadas().add(h);
		System.out.println(sistema);
		
		
	}

}
