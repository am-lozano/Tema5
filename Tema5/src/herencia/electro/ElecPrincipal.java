package herencia.electro;

import java.util.ArrayList;

public class ElecPrincipal {

	public static void main(String[] args) {
		
		ArrayList<Electrodomestico> lista = new ArrayList<Electrodomestico>();
		
		Lavadora l = new Lavadora(0, 0, 50);
		Television t = new Television(0, 0, 0, true);
		Television t2 = new Television(0, 0, 41, false);
		
		lista.add(l);
		lista.add(t);
		lista.add(t2);
		
		System.out.println("El precio base con mas carga es");
		System.out.println(l.getPrecioBase());
		
		System.out.println("El precio base con sintonizador es");
		System.out.println(t.getPrecioBase());
		
		System.out.println("El precio base con mas pulgadas es");
		System.out.println(t.getPrecioBase());
		
		l.precioFinal();
		t.precioFinal();
		t2.precioFinal();

		System.out.println("El precio base con mas carga es");
		System.out.println(l.getPrecioBase());
		
		System.out.println("El precio base con sintonizador es");
		System.out.println(t.getPrecioBase());
		
		System.out.println("El precio base con mas pulgadas es");
		System.out.println(t.getPrecioBase());

	}

}
