package interfaces.futbolistas;

import java.util.Objects;

public class Futbolista implements Comparable<Futbolista> {

	private int numCamiseta;
	
	private String nombre;
	
	private int edad;
	
	private int numGoles;

	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		
		if (numCamiseta > 0) {
			this.numCamiseta = numCamiseta;
		}
		
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		
		if (edad> 0 && edad < 150) {
			this.edad = edad;
		}
		
		if (numGoles >= 0) {
			this.numGoles = numGoles;
		}
	}

	@Override
	public boolean equals(Object obj) {

		boolean res = false;
		
		Futbolista fut = (Futbolista) obj;
		
		if (this.nombre.equalsIgnoreCase(fut.nombre) && this.numCamiseta == fut.numCamiseta) {
			
			res = true;
		}
		
		return res;
	}

	@Override
	public int compareTo(Futbolista o) {
		
		int res = 0;
		
		if (this.numCamiseta == o.numCamiseta) {
			
			// compara nombre
			res = this.nombre.compareToIgnoreCase(o.nombre);
			
		} else {
			
			// compara num cam
			res = this.numCamiseta - o.numCamiseta;
		}
		
		return res;
	}

	@Override
	public String toString() {
		return "numCamiseta=" + numCamiseta + ", nombre=" + nombre + "\n";
	}
	
	
	
}
