package modelo;


import java.time.LocalDate;

public class Cuenta {

	private int numeroCuenta;
	private LocalDate fechaApertura;
	private float saldo;
	private String tipoDeInteres;
	
	
	public Cuenta(int numeroCuenta, LocalDate fechaApertura, float saldo, String tipoDeInteres) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.fechaApertura = fechaApertura;
		this.saldo = saldo;
		this.tipoDeInteres = tipoDeInteres;
	}

	//sobrecarga de metodo
	
	public int bonificacion(int saldo) {
		int puntos= 1000 + saldo;
		return puntos;
	}
	
	//polimorfismo
	public int bonificacion() {
		
		int puntos = 1000;
		
		return puntos;
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


	public String getTipoDeInteres() {
		return tipoDeInteres;
	}


	public void setTipoDeInteres(String tipoDeInteres) {
		this.tipoDeInteres = tipoDeInteres;
	}


	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", fechaApertura=" + fechaApertura + ", saldo=" + saldo
				+ ", tipoDeInteres=" + tipoDeInteres + "]";
	}
	
	
}
