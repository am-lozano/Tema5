package analisis.agenda;

public class Empresa extends Contacto {

	private String paginaWeb;

	
	
	public Empresa(String nombre, int telefono, String paginaWeb) {
		
		super(nombre, telefono);
		
		if (paginaWeb != null && !paginaWeb.isEmpty()) {
			this.paginaWeb = paginaWeb;
		}
		
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}
}
