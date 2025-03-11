package herencia.hora;

public class PrincipalHora {

	public static void main(String[] args) {
		
		HoraExacta hora = new HoraExacta(1, 3, 5);
		System.out.println(hora.toString());
		hora.inc();
		System.out.println(hora.toString());
		System.out.println(hora.setHora(23));
		System.out.println(hora.setMinutos(59));
		System.out.println(hora.setSegundos(59));
		hora.inc();
		System.out.println(hora.toString());
	}

}
