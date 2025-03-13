package herencia.electro;

public class Lavadora extends Electrodomestico{
	
	private double carga = 5;

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}
	
	public Lavadora(double precioBase, double peso, double carga) {
		super(precioBase, peso);
		
		if (carga > 0) {
			this.carga = carga;
		}
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		
		if (carga > 0) {
			this.carga = carga;
		}
	}
	
	void precioFinal () {
		
		super.precioFinal();
		
		if (this.carga > 30) {
			
			setPrecioBase(getPrecioBase() + 50);
		}
	}
	
	

}
