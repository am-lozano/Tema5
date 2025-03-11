package herencia.empleado;

public class Tecnico extends Operario {
	
	Tecnico (String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " -> Tecnico";
	}

}
