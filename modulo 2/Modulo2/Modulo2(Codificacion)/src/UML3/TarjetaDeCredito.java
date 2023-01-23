package UML3;

import java.time.LocalDate;
import java.time.LocalTime;

public class TarjetaDeCredito {
	private long numero;
	private String titular;
	private String tipo;
	private LocalDate fechaDeCaducidad;
	
	public TarjetaDeCredito(long numero, String titular, String tipo, LocalDate fechaDeCaducidad) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.tipo = tipo;
		this.fechaDeCaducidad = fechaDeCaducidad;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public LocalDate getFechaDeCaducidad() {
		return fechaDeCaducidad;
	}
	public void setFechaDeCaducidad(LocalDate fechaDeCaducidad) {
		this.fechaDeCaducidad = fechaDeCaducidad;
	}
	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", tipo=" + tipo + ", fechaDeCaducidad="
				+ fechaDeCaducidad + "]";
	}
	
	
}
