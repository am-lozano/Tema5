package comparator.numaleatorios;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		Random rand = new Random();
		
		int num;
		
		for (int i = 0; i < 20; i++) {
			
			num = rand.nextInt(1, 101);
			
			lista.add(num);
			
		}
		
		System.out.println(lista);
		
		lista.sort((o1, o2) -> o2 - o1);
		
		System.out.println(lista);

	}

}
