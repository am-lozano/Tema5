package analisis.biblioteca;

public abstract class Ficha {

	private int id;
	
	private String titulo;
	
	public Ficha(int id, String titulo) {
		
		if (id > 0) {
			this.id = id;
		}
		
		if (titulo != null && !titulo.isEmpty()) {
			this.titulo = titulo;
		}
		
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public abstract int prestamo();
	
}
