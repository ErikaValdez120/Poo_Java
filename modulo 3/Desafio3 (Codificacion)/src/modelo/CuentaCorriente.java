package modelo;


import java.time.LocalDate;

public class CuentaCorriente extends Cuenta {
	
	private TarjetaDeCredito tarjetaDeCredito;

	
	
	
	
	public CuentaCorriente(int numeroCuenta, LocalDate fechaApertura, float saldo, String tipoDeInteres,
			TarjetaDeCredito tarjetaDeCredito) {
		super(numeroCuenta, fechaApertura, saldo, tipoDeInteres);
		this.tarjetaDeCredito = tarjetaDeCredito;
	}



	@Override
	public int bonificacion() {
		//polimorfismo con redefinicion de metodo
		int puntos = 1000*2;
		
		return puntos;
	}



	public TarjetaDeCredito getTarjetaDeCredito() {
		return tarjetaDeCredito;
	}

	public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
		this.tarjetaDeCredito = tarjetaDeCredito;
	}
	 
	

}
