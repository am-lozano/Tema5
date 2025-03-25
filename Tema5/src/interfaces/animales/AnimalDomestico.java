package interfaces.animales;

public abstract class  AnimalDomestico implements Animal {
	
	private String nombre;
	
	private String raza;
	
	private double peso;
	
	private String color;
	
	public void vacunar() {};
	
	public abstract void  hacerCaso();

}
