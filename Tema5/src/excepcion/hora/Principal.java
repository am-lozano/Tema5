package excepcion.hora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Hora hora = new Hora(0, 0, 0);
		
		int h;
		int min;
		int seg;
		
		Scanner sc = new Scanner (System.in);
		
		boolean val = false;
		
		
		// comprobar horas
		do {
			
			try {
				
				System.out.println("Introduzca la hora:");
				h = sc.nextInt();
				
				hora.setHora(h);
				
				val = true;
				
			} catch (NegativeHourException e) {
				System.out.println(e.getMessage());
			}
			
			
		} while (!val);
		
		System.out.println();
		
		val = false;
		
		// comprobar minutos
		do {
			
			try {
				
				System.out.println("Introduzca los minutos:");
				min = sc.nextInt();
				
				hora.setMinutos(min);
				
				val = true;
				
			} catch (NegativeMinuteException e) {
				System.out.println(e.getMessage());
			}
			
			
		} while (!val);
		
		val = false;
		
		System.out.println();
		
		// comprobar segundos
		do {
			
			try {
				
				System.out.println("Introduzca los segundos:");
				seg = sc.nextInt();
				
				hora.setSegundo(seg);
				
				val = true;
				
			} catch (NegativeSecondException e) {
				System.out.println(e.getMessage());
			}
			
			
		} while (!val);
		
		System.out.println();
		
		System.out.println(hora.toString());
		
		sc.close();

	}

}
