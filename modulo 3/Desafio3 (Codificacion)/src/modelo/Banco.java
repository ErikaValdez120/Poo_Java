package modelo;

import java.time.LocalDate;

public class Banco {

	private Cuenta cuenta;
	private FondoDeInversion fondoDeInversion;
	private CarteraDeValores carteraDeValores;
	private Cliente cliente;
	
	
	public Banco(Cuenta cuenta, FondoDeInversion fondoDeInversion, CarteraDeValores carteraDeValores, Cliente cliente) {
		super();
		this.cuenta = cuenta;
		this.fondoDeInversion = fondoDeInversion;
		this.carteraDeValores = carteraDeValores;
		this.cliente = cliente;
	}
	
	public void crearCuentaCorriente(int numeroCuenta, LocalDate fechaApertura, float saldo, String tipoDeInteres,
			TarjetaDeCredito tarjetaDeCredito){
		@SuppressWarnings("unused")
		Cuenta cuentacorriente = new CuentaCorriente (numeroCuenta, fechaApertura, saldo,tipoDeInteres, tarjetaDeCredito);
	}
	
	public void gestionarCuenta() {
		//metodo de gestion
	}
	
	public Cuenta getCuenta() {
		return cuenta;
	}


	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}


	public FondoDeInversion getFondoDeInversion() {
		return fondoDeInversion;
	}


	public void setFondoDeInversion(FondoDeInversion fondoDeInversion) {
		this.fondoDeInversion = fondoDeInversion;
	}


	public CarteraDeValores getCarteraDeValores() {
		return carteraDeValores;
	}


	public void setCarteraDeValores(CarteraDeValores carteraDeValores) {
		this.carteraDeValores = carteraDeValores;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Banco [cuenta=" + cuenta + ", fondoDeInversion=" + fondoDeInversion + ", carteraDeValores="
				+ carteraDeValores + ", cliente=" + cliente + "]";
	}
	 
	
}
