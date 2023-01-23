package UML3;

import java.time.LocalDate;
import java.time.LocalTime;

public class CajaDeAhorro {
	private int numeroCuenta;
	private LocalDate fechaApertura;
	private float saldo;
	private String tipoInteres;
	private Cliente cliente;
	private LocalDate abiertaHasta;
	
	public CajaDeAhorro(int numeroCuenta, LocalDate fechaApertura, float saldo, String tipoInteres,
			LocalDate abiertaHasta) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.fechaApertura = fechaApertura;
		this.saldo = saldo;
		this.tipoInteres = tipoInteres;
		this.abiertaHasta = abiertaHasta;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public LocalDate getFechaApertura() {
		return fechaApertura;
	}
	public void setFechaApertura(LocalDate fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public String getTipoInteres() {
		return tipoInteres;
	}
	public void setTipoInteres(String tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public LocalDate getAbiertaHasta() {
		return abiertaHasta;
	}
	public void setAbiertaHasta(LocalDate abiertaHasta) {
		this.abiertaHasta = abiertaHasta;
	}
	@Override
	public String toString() {
		return "CajaDeAhorro [numeroCuenta=" + numeroCuenta + ", fechaApertura=" + fechaApertura + ", saldo=" + saldo
				+ ", tipoInteres=" + tipoInteres + ", cliente=" + cliente + ", abiertaHasta=" + abiertaHasta + "]";
	}
	
	
}
