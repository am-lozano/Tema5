package herencia;

public class Hora {

	private int hora;
	private int minutos;

	Hora(int hora, int min) {

		if (hora >= 0 && hora <= 23) {

			this.hora = hora;

		}

		if (min >= 0 && min <= 59) {

			this.minutos = min;

		}
	}

	public int getHora() {
		return hora;
	}

	public int getMinutos() {
		return minutos;
	}

	void inc() {

		if (this.minutos == 59) {

			this.minutos = 0;
			this.hora++;

			if (this.hora == 23 || this.hora == 24) {

				this.hora = 0;
			}

		} else {

			this.minutos++;
		}

	}

	public boolean setHora(int hora) {

		boolean cambio = false;

		if (hora >= 0 && hora <= 23) {

			this.hora = hora;
			cambio = true;

		}

		return cambio;
	}

	public boolean setMinutos(int minutos) {

		boolean cambio = false;

		if (minutos >= 0 && minutos <= 59) {

			this.minutos = minutos;
			cambio = true;
		}

		return cambio;
	}

	@Override
	public String toString() {

		return hora + " : " + minutos;
	}

}