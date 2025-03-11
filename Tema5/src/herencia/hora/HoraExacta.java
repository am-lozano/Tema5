package herencia.hora;

public class HoraExacta extends Hora {

	private int segundos;

//	HoraExacta(int hora, int min) {
//		super(hora, min);
//	}

	HoraExacta(int hora, int min, int segundos) {
		super(hora, min);

		if (segundos >= 0 && segundos <= 59) {

			this.segundos = segundos;

		}
	}

	public int getSegundos() {
		return segundos;
	}

	public boolean setSegundos(int segundos) {

		boolean cambio = false;

		if (segundos >= 0 && segundos <= 59) {

			this.segundos = segundos;
			cambio = true;

		}

		return cambio;
	}

	void inc() {

		if (this.segundos == 59) {

			this.segundos = 0;
			super.inc();
			
		} else {
			
			this.segundos++;
		}

	}
	
	@Override
	public String toString() {
		
		return super.toString() + " : " + segundos;
	}

}
