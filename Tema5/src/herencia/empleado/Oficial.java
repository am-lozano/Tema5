package herencia.empleado;

public class Oficial extends Operario {

	Oficial(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " -> Oficial";
	}

}
