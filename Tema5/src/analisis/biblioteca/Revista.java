package analisis.biblioteca;

public class Revista extends Ficha {

	private int numRevista;
	
	private int anyoPub;

	public Revista(int id, String titulo, int numRevista, int anyoPub) {
		
		super(id, titulo);
		
		if (numRevista > 0) {
			this.numRevista = numRevista;
		}
		
		if (anyoPub > 0) {
			this.anyoPub = anyoPub;
		}
	}
	
	@Override
	public int prestamo() {
		return 10;
	}

}
