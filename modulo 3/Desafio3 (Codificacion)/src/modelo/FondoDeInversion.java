package modelo;

import java.sql.Date;

public class FondoDeInversion {

	
	private String nombre;
	private float importe;
	private int rentabilidad;
	private Date fechaApertura;
	private Date fechaVencimiento;
	
	
	public FondoDeInversion(String nombre, float importe, int rentabilidad, Date fechaApertura, Date fechaVencimiento) {
		super();
		this.nombre = nombre;
		this.importe = importe;
		this.rentabilidad = rentabilidad;
		this.fechaApertura = fechaApertura;
		this.fechaVencimiento = fechaVencimiento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getImporte() {
		return importe;
	}


	public void setImporte(float importe) {
		this.importe = importe;
	}


	public int getRentabilidad() {
		return rentabilidad;
	}


	public void setRentabilidad(int rentabilidad) {
		this.rentabilidad = rentabilidad;
	}


	public Date getFechaApertura() {
		return fechaApertura;
	}


	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}


	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}


	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}


}

