package de.test.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambdas {

	public void alteSortierung() {

		List<String> namen = Arrays.asList("Martina", "Ingolf", "Ramona", "Bärbel", "Christine", "Bernd", "Udo",
				"Dirk");
		
		// Sortierung nach Länge des Namens
		Collections.sort(namen, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		for (String name : namen) {
			System.out.println(name);
		}
		
		System.out.println("-------------------------------------------------------");
		
		// Sortierung nach Name
		Collections.sort(namen);
		
		for (String name : namen) {
			System.out.println(name);
		}

	}
	
	public int einfachLambda(){
		
		//return (int x, int y) -> ( return x + y);
		
		return 0;
	}

}
