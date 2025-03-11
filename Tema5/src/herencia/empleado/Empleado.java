package herencia.empleado;

public class Empleado {

	private String nombre;

	Empleado(String nombre) {

		if (nombre != null && !nombre.isEmpty()) {

			this.nombre = nombre;
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

	@Override
	public String toString() {

		return "Empleado " + nombre;
	}

}
