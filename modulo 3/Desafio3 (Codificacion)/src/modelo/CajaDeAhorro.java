package modelo;

import java.sql.Date;
import java.time.LocalDate;

public class CajaDeAhorro  extends Cuenta{

	
	private Date vencimientoMes;

	public CajaDeAhorro(int numeroCuenta, LocalDate fechaApertura, float saldo, String tipoDeInteres, Date vencimientoMes) {
		super(numeroCuenta, fechaApertura, saldo, tipoDeInteres);
		this.vencimientoMes = vencimientoMes;
	}

	public Date getVencimientoMes() {
		return vencimientoMes;
	}

	public void setVencimientoMes(Date vencimientoMes) {
		this.vencimientoMes = vencimientoMes;
	}
	
	
}
