package herencia.producto;

public class Perecedero extends Producto {

	private int diasCaducar;

	public Perecedero(String nombre, double precio) {
		super(nombre, precio);

		if (diasCaducar > 0) {

			this.diasCaducar = diasCaducar;

		}
	}

	public int getDiasCaducar() {
		return diasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {

		if (diasCaducar > 0) {

			this.diasCaducar = diasCaducar;

		}
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	double calcular(double cantidad) {
		
		double precio = super.calcular(cantidad);
		
		if (cantidad == 1) {
			
			 precio /= 4;
			
		} else if (cantidad == 2) {
			
			precio /= 3;
			
		} else {
			
			precio /= 2;
			
		}

		return precio;
	}

}
