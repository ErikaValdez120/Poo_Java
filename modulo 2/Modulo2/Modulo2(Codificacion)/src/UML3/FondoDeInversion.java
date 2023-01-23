package UML3;

import java.time.LocalDate;
import java.time.LocalTime;

public class FondoDeInversion {
	private String nombre;
	private float importe;
	private float rentabilidad;
	private LocalDate fechaDeApertura;
	private LocalDate vencimiento;
	
	public FondoDeInversion(String nombre, float importe, float rentabilidad, LocalDate fechaDeApertura,
			LocalDate vencimiento) {
		super();
		this.nombre = nombre;
		this.importe = importe;
		this.rentabilidad = rentabilidad;
		this.fechaDeApertura = fechaDeApertura;
		this.vencimiento = vencimiento;
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
	public float getRentabilidad() {
		return rentabilidad;
	}
	public void setRentabilidad(float rentabilidad) {
		this.rentabilidad = rentabilidad;
	}
	public LocalDate getFechaDeApertura() {
		return fechaDeApertura;
	}
	public void setFechaDeApertura(LocalDate fechaDeApertura) {
		this.fechaDeApertura = fechaDeApertura;
	}
	public LocalDate getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(LocalDate vencimiento) {
		this.vencimiento = vencimiento;
	}
	@Override
	public String toString() {
		return "FondoDeInversion [nombre=" + nombre + ", importe=" + importe + ", rentabilidad=" + rentabilidad
				+ ", fechaDeApertura=" + fechaDeApertura + ", vencimiento=" + vencimiento + "]";
	}
	
	
}
