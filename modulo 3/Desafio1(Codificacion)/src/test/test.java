package test;

import modelo.Cliente;
import modelo.Elemento;
import modelo.Sistema;

public class test {

	public static void main(String[] args) {

		Sistema sis = new Sistema();

		Cliente cli = new Cliente(1);
		Cliente cli2 = new Cliente(2);
		sis.devolverElemento(cli, "lata", 2);
		sis.devolverElemento(cli2, "botella", 5);
		sis.devolverBotella(cli2, "vidrio", 4, 3);

		System.out.println("Lista de botellas devueltas : \n");
		System.out.println(sis.getLstBotellas());

		System.out.println("------------------------------------------------------------------------------------");

		System.out.println("Datos de otros  elementos que se devolvieron:\n" + sis.getLstElementosDevueltos());

		System.out.println("\nCantidad de elementos devuelto :" + sis.totalElementosDevueltos());

		// polimofismo al guardar un elemento
		Elemento MetodoSimple = new Elemento("Botella", 50);
		Elemento MetodoSobrecargado = new Elemento(cli, "lata", 4);
	}

}
