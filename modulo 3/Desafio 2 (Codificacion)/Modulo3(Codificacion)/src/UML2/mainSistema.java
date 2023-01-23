package UML2;

import java.time.LocalDate;

public class mainSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//para sobrecarga =hacer la funcion que se llame agregar(alumno y otra profesor)
		//
		
		Sistema sistema=new Sistema(1,LocalDate.now());
		//agrege a persona un alumno
		System.out.println(sistema.agregar(12345678, "Nehuen", "Direccion","Sistemas"));;
		System.out.println(sistema);
		//agrego un profesro;
		System.out.println(sistema.agregar(1, "profe", "direc", "departamento", 1));
		System.out.println(sistema);
		//agrego una asignatura y se la pongo al alumno
		Asignatura a=new Asignatura("Progrmacion2",130,1,"obligatoria");
		sistema.traerAlumno(12345678).agregarCursando(a);
		System.out.println(sistema);
		
		//Creo el historial del alumno y lo asigno
		HistorialAcademico h=new HistorialAcademico();
		sistema.traerAlumno(12345678).setHistorial(h);
		//creo una asignatura y se la agrego a la lista de aprobadas de la clase historiaAcademica
		Asignatura a2=new Asignatura("Progrmacion1",130,1,"obligatoria");
		sistema.traerAlumno(12345678).getHistorial().getHistorial().add(a2);
		sistema.traerAlumno(12345678).getHistorial().setNotaFinal(9);
		System.out.println(sistema);
		//uso los metodos de la clase padre en los hijos:
		//ALUMNO:
		System.out.print("El Alumno tiene un descuento del:");
		System.out.println(sistema.traerAlumno(12345678).calcularDescuentoComedor());
		//PROFESOR:
		System.out.print("El Profesor tiene un descuento del:");
		System.out.println(sistema.getLstPersonas().get(1).calcularDescuentoComedor());
		
		
		
	}

}
