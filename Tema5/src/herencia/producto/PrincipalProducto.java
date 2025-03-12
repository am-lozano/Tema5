package herencia.producto;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrincipalProducto {
		
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		
		int opcion = 0;
		
		Producto productos;
		
		do {
			mostrarMenu();
			
			System.out.println("Introduzca una opcion:");
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
			
			case 1 -> {
				productos = creaProducto();
				
				if (ProductoCRUD.nuevoProducto(productos)) {
					
					System.out.println("Disco añadido correctamente");
					
				} else {
					
					System.out.println("No se ha podido añadir el disco");
					
				}
			}
			}
			
		} while (opcion != 4);
		
		sc.close();
	}
	
	public static void mostrarMenu () {
		
		System.out.println("1. Anadir producto");
		System.out.println("2. Listar productos");
		System.out.println("3. Eliminar producto");
		System.out.println("4. Salir");
	}
	
	public static Producto creaProducto() {
		
		Producto productos = null;
		
		String nombre;
		double precio;
		
		System.out.println("Introduzca el nombre:");
		nombre = sc.nextLine();
		sc.nextLine();

		System.out.println("Introduzca el precio:");
		precio = sc.nextDouble();
		sc.nextLine();

		productos = new Producto(nombre, precio);
		
		return productos;
	}

}
