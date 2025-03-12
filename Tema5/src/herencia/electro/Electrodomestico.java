package herencia.electro;

public class Electrodomestico {

	private double precioBase = 100;

	private ColorElec color = ColorElec.BLANCO;

	private ConsumoElec consumoEnergetico = ConsumoElec.F;

	private double peso = 5;

	enum ConsumoElec {
		A, B, C, D, E, F
	}

	enum ColorElec {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	public Electrodomestico(double precioBase, double peso) {

		if (precioBase >= 100) {
			this.precioBase = precioBase;
		}

		if (peso >= 5) {
			this.peso = peso;
		}

	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {

		if (precioBase >= 100) {
			this.precioBase = precioBase;
		}

		if (peso >= 5) {
			this.peso = peso;
		}

		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);

	}
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		
		if (precioBase >= 100) {
			this.precioBase = precioBase;
		}
		
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		
		if (peso >= 5) {
			this.peso = peso;
		}
		
	}
	
	public ConsumoElec getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(ConsumoElec consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public ColorElec getColor() {
		return color;
	}

	public void setColor(ColorElec color) {
		this.color = color;
	}

	boolean comprobarConsumoEnergetico(char letra) {

		boolean valido = false;

		switch (letra) {
		case 'A', 'B', 'C', 'D', 'E', 'F' -> {

			this.consumoEnergetico = ConsumoElec.valueOf(String.valueOf(letra));

			valido = true;
		}
		}

		return valido;
	}

	boolean comprobarColor(String color) {

		boolean valido = false;

		switch (color) {
		case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" -> {

			this.color = ColorElec.valueOf(color);

			valido = true;
		}
		}

		return valido;
	}

	void precioFinal() {

		switch (ConsumoElec.valueOf(String.valueOf(getConsumoEnergetico()))) {
		case ConsumoElec.A -> {
			precioBase += 100;
		}
		case ConsumoElec.B -> {
			precioBase += 80;
		}
		case ConsumoElec.C -> {
			precioBase += 60;
		}
		case ConsumoElec.D -> {
			precioBase += 50;
		}
		case ConsumoElec.E -> {
			precioBase += 30;
		}
		default -> {
			precioBase += 10;
		}
		}
		
		if (this.peso > 0 && this.peso <= 19) {
			
			precioBase += 10;
			
		} else if (this.peso > 20 && this.peso <= 49) {
			
			precioBase += 50;
			
		} else if (this.peso > 50 && this.peso <= 79) {
			
			precioBase += 80;
			
		} else {
			
			precioBase += 100;
		}
		
	}

}
