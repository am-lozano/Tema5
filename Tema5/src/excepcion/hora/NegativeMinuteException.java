package excepcion.hora;

public class NegativeMinuteException extends Exception {
	
	public String toString() {
		return "Minuto negativo";
	}
	
	@Override
	public String getMessage() {
		return "Minuto negativo";
	}

}
