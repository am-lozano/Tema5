package interfaces.socios;

public class Socio implements Comparable<Socio> {
	
	/**
	 * id del socio
	 */
	private int id;
	
	/**
	 * nombre del socio
	 */
	private String nombre;
	
	/**
	 * edad del socio
	 */
	private int edad;

	/**
	 * constructor
	 * 
	 * @param id id del socio
	 * @param nombre nombre del socio
	 * @param edad edad del socio
	 */
	public Socio(int id, String nombre, int edad) {
		
		if (id > 0) {			
			this.id = id;
		}
		
		if (nombre != null && !nombre.isEmpty()) {			
			this.nombre = nombre;
		}
		
		if (edad > 0 && edad < 150) {			
			this.edad = edad;
		}
	}
	
	/**
	 * metodo toString
	 */
	@Override
	public String toString() {
		
		return "id:" + id;
	}
	
	/**
	 * metodo compareTo
	 */
	@Override
	public int compareTo(Socio o) {
		
		return this.id - o.id;
	}
	
}
