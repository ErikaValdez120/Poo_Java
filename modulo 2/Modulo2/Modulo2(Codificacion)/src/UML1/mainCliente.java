package UML1;

public class mainCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//para corroborar que funciona creo los diferens objetos y luego se lo asigno a cliente:
		
		Lata lata=new Lata(1);
		Botella botella=new Botella(1);
		Envase envase=new Envase(1);
		//le agrego al cliente los productos:
		Cliente cliente=new Cliente(1,0,lata,botella,envase);
		System.out.println(cliente);
		//deposito una lata:
		cliente.devolverElemento();
		System.out.println(cliente);
	}

}
