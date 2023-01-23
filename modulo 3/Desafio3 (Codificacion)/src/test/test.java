package test;


import java.time.LocalDate;

import modelo.Banco;

import modelo.Cliente;
import modelo.Cuenta;
import modelo.CuentaCorriente;
import modelo.TarjetaDeCredito;

public class test {

	public static void main(String[] args) {
		
		//MODULO2 DESAFIO 3 - CREAR UN OBJETO 
		
		Cliente cli=new Cliente(38838540, "Jose","Lanus", "1554756476");
		TarjetaDeCredito master = new TarjetaDeCredito("mastercard", 15656767,"Roberto Lopez" ,LocalDate.of(2029, 1, 1));
		//POLIMORFISMO CLASE PADRE ALMACENA UNA CLASE HIJA.
		Cuenta ctaCorriente = new CuentaCorriente(21234, LocalDate.of(2023, 1, 1),500.5f, "interes 0",master);
		Banco cliente = new Banco(ctaCorriente, null, null, cli);
		
				
				
		
		System.out.println(cliente);
		System.out.println(cliente.getCuenta());
		
		System.out.println("Metodo cuenta bonoficacion simple:"+cliente.getCuenta().bonificacion());
		System.out.println("Metodo cuenta bonoficacion sobrecargado:"+cliente.getCuenta().bonificacion(700));
		
			

	}

	
	
}
