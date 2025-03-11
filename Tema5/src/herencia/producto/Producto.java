package herencia.producto;

public class Producto {

	private String nombre;

	private double precio;

	public Producto(String nombre, double precio) {

		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}

		if (precio != 0) {
			this.precio = precio;
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {

		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {

		if (precio >= 0) {
			this.precio = precio;
		}
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	double calcular (double cantidad){
		
		return precio * cantidad;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean iguales = false;
		
		// realizamos un cast
		Producto otroProducto = (Producto) obj;
		
		if (this.nombre.equals(otroProducto.nombre) && this.precio == otroProducto.precio) {
			iguales = true;
		}
		
		return iguales;
		
	}

}
