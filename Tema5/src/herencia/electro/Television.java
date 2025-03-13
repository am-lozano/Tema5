package herencia.electro;

public class Television extends Electrodomestico {

	private int resolucion = 20;

	boolean sintonizadorTDT = false;

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}

	public Television(double precioBase, double peso, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, peso);

		if (resolucion > 0) {

			this.resolucion = resolucion;
		}

		if (sintonizadorTDT == true || sintonizadorTDT == false) {

			this.sintonizadorTDT = sintonizadorTDT;
		}
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		
		if (resolucion > 0) {

			this.resolucion = resolucion;
		}
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		
		if (sintonizadorTDT == true || sintonizadorTDT == false) {

			this.sintonizadorTDT = sintonizadorTDT;
		}
		
	}
	
	void precioFinal() {
		
		super.precioFinal();
		
		if (resolucion > 40) {
			
			setPrecioBase(getPrecioBase() + (getPrecioBase() * 0.3)); 
		}
		
		if (sintonizadorTDT == true) {
			
			setPrecioBase(getPrecioBase() + 50);
		}
	}

}
