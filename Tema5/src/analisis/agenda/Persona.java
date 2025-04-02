package analisis.agenda;

public class Persona extends Contacto {
	
	private int cumpleanyo;

	public Persona(String nombre, int telefono, int cumpleanyo) {
		
		super(nombre, telefono);
		
		if (cumpleanyo > 0) {
			this.cumpleanyo = cumpleanyo;
		}
		
	}

	public int getCumpleanyo() {
		return cumpleanyo;
	}

}
