package UML3;

import java.time.LocalDate;
import java.time.LocalTime;

public class mainBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente=new Cliente(12345678,"Nehuen","Luis Guillon",111111111);
		
		CarterasDeValores cartera=new CarterasDeValores("cartera1",1,2);
		CajaDeAhorro cajaAhorro=new CajaDeAhorro(1,LocalDate.now(),2460,"5%",LocalDate.of(2023,10,10));
		TarjetaDeCredito tarjeta=new TarjetaDeCredito(1111111111,"Nehuen","Visa",LocalDate.of(2023, 04,28));
		CuentaCorriente cuentaCorriente=new CuentaCorriente(1,LocalDate.now(),120,"3%",cliente,tarjeta);
		FondoDeInversion fondo= new FondoDeInversion("fondo",50,2,LocalDate.now(),LocalDate.of(2023, 9, 10));
		//CREO EL BANCO
		Banco banco=new Banco("Santander","direccion");
		System.out.println(banco);
		//LE ASIGNO LOS OBJETOS CREADOS AL PRNCIPIO AL BANCO
		banco.setCliente(cliente);
		banco.setFondoDeInversion(fondo);
		banco.setCuentaCorriente(cuentaCorriente);
		banco.setCajaDeAhorro(cajaAhorro);
		banco.setCarterasDeValores(cartera);
		System.out.println(banco);
		
		//USO DE LOS GETS
		System.out.println(banco.getCliente());
		System.out.println(banco.getCuentaCorriente());
		
		
	}

}
