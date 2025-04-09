package excepcion.hora;

public class NegativeSecondException extends Exception {
	
	public String toString() {
		return "Segundo negativo";
	}
	
	@Override
	public String getMessage() {
		return "Segundo negativo";
	}

}
