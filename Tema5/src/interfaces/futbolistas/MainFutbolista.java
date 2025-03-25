package interfaces.futbolistas;

import java.util.ArrayList;
import java.util.Collections;

public class MainFutbolista {

	public static void main(String[] args) {
		
		ArrayList<Futbolista> lista = new ArrayList<Futbolista>();
		
		lista.add(new Futbolista(3, "a", 0,0));
		lista.add(new Futbolista(6, "b", 0,0));
		lista.add(new Futbolista(6, "A", 0,0));
		lista.add(new Futbolista(6, "a", 0,0));
		lista.add(new Futbolista(0, "a", 0,0));
		
		Collections.sort(lista);
		
		System.out.println(lista);

	}

}
