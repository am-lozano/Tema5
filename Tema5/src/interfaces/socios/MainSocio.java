package interfaces.socios;

import java.util.ArrayList;
import java.util.Collections;

public class MainSocio {

	public static void main(String[] args) {
		
		ArrayList<Socio> lista = new ArrayList<>();
		
		Socio s1 = new Socio (1, "a", 3);
		Socio s2 = new Socio (6, "a", 3);
		Socio s3 = new Socio (3, "a", 3);
		Socio s4 = new Socio (2, "a", 3);
		Socio s5 = new Socio (9, "a", 3);
		Socio s6 = new Socio (11, "a", 3);
		
		
		lista.add(s1);
		lista.add(s2);
		lista.add(s3);
		lista.add(s4);
		lista.add(s5);
		lista.add(s6);
		
		Collections.sort(lista);
		
		System.out.println(lista);

	}

}
