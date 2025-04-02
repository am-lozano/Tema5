package analisis.biblioteca;

public class DVD extends Ficha {

	private String director;
	
	private int anyo;
	
	private Tipo tipo;
	
	enum Tipo {
		PELICULA, DOCUMENTAL, SERIE
	}

	public DVD(int id, String titulo, String director, int anyo, String tipo) {
		
		super(id, titulo);
	
		if (director != null && !director.isEmpty()){
			this.director = director;
		}
		
		if (anyo > 0) {
			this.anyo = anyo;
		}
		
		compruebaTipo(tipo.toUpperCase());
		
	}

	private void compruebaTipo(String tipo) {
		
		switch (tipo) {
		
		case "PELICULA", "DOCUMENTAL", "SERIE" -> this.tipo = Tipo.valueOf(tipo);
		}
		
	}
	
	@Override
	public int prestamo() {
		return 5;
	}
	
}
