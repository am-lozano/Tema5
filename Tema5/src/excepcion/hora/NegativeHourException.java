package excepcion.hora;

public class NegativeHourException extends Exception {
	
	public String toString() {
		return "Hora negativa";
	}
	
	@Override
	public String getMessage() {
		return "Hora negativa";
	}

}
