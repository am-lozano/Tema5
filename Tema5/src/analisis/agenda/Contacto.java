package analisis.agenda;

public class Contacto {

	private String nombre;
	
	private int telefono;

	public Contacto(String nombre, int telefono) {

		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		
		if (telefono >= 000000000 && telefono <= 999999999) {
			this.telefono = telefono;
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public int getTelefono() {
		return telefono;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean res = false;
		
		Contacto otro = (Contacto) obj;
		
		if (this.nombre.equalsIgnoreCase(otro.nombre)) {
			res = true;
		}
		
		return res;
	}
	
}
