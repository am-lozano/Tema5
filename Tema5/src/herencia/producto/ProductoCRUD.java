package herencia.producto;

import java.util.HashSet;
import java.util.Set;

public class ProductoCRUD {

	private static HashSet<Producto> listaProducto = new HashSet<Producto>();

	public static boolean nuevoProducto(Producto p) {

		return listaProducto.add(p);

	}

	public static void pintaLista() {
		
		for (Producto pd : listaProducto) {
			
			System.out.println(pd);
		}
	}
	
	public static boolean eliminaProducto (Producto p) {
		
		return listaProducto.remove(p);
		
	}

}
