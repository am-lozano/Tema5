package herencia.producto;

public class NoPerecedero extends Producto {

	private String tipo;

	public NoPerecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {

		if (tipo != null && !tipo.isEmpty()) {

			this.tipo = tipo;
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}

	double calcular(double cantidad) {

		return super.calcular(cantidad);
	}

}
