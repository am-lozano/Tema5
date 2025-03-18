package herencia.electro;

import java.util.ArrayList;

public class ElecPrincipal {

	public static void main(String[] args) {
		
		double precioElec = 0;
		double precioLavadora = 0;
		double precioTele = 0;		
		
		ArrayList<Electrodomestico> lista = new  ArrayList<Electrodomestico>();
		
		Electrodomestico e1 = new Electrodomestico(0, "negro", '0', 0);
		Electrodomestico e2 = new Electrodomestico(0, "azulado", 'Z', 0);
		Electrodomestico e3 = new Electrodomestico(50, "blanco", '0', 0);
		Electrodomestico e4 = new Electrodomestico(0, "blanco", '0', 2);
		
		Lavadora l1 = new Lavadora(50, 0, 0);
		Lavadora l2 = new Lavadora(200, 0, 40);
		Lavadora l3 = new Lavadora(200, 0, 20);
		
		Television t1 = new Television(200, 0, 0, false);
		Television t2 = new Television(200, 0, 0, true);
		Television t3 = new Television(200, 0, 50, false);
		
		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		lista.add(e4);
		
		lista.add(l1);
		lista.add(l2);
		lista.add(l3);
		
		lista.add(t1);
		lista.add(t2);
		lista.add(t3);
		
		for (Electrodomestico e : lista) {
			
			e.precioFinal();
			
			System.out.println(e.getPrecioBase());
			
			if (e instanceof Lavadora) {
				precioLavadora += e.getPrecioBase();
			}
			
			if (e instanceof Television) {
				precioTele += e.getPrecioBase();
			}
		}

		System.out.println(precioElec);
		System.out.println(precioLavadora);
		System.out.println(precioTele);
	}
}
