package analisis.biblioteca;

public class Libro extends Ficha {

	private String autor;
	
	private String editorial;
	
	public Libro(int id, String titulo, String autor, String editorial) {
		
		super(id, titulo);
		
		if (autor != null && !autor.isEmpty()){
			this.autor = autor;
		}
		
	}

	public String getAutor() {
		return autor;
	}

	public String getEditorial() {
		return editorial;
	}

	@Override
	public int prestamo() {
		return 15;
	}
	
}
