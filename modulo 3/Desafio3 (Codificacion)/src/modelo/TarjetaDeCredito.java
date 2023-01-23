package modelo;

import java.time.LocalDate;

public class TarjetaDeCredito {

	
	private String nombre;
	private int numero;
	private String nombreTitular;
	private LocalDate fechaVencimiento;
	
	
	public TarjetaDeCredito(String nombre, int numero, String nombreTitular, LocalDate fechaVencimiento) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.nombreTitular = nombreTitular;
		this.fechaVencimiento = fechaVencimiento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getNombreTitular() {
		return nombreTitular;
	}


	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}


	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}


	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}


	@Override
	public String toString() {
		return "TarjetaDeCredito [nombre=" + nombre + ", numero=" + numero + ", nombreTitular=" + nombreTitular
				+ ", fechaVencimiento=" + fechaVencimiento + "]";
	}
	
	
	
	
}
