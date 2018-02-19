/**
 * 
 */
package de.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mathias
 *
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(45);
		numbers.add(55);

		numbers.forEach(System.out::println);
		System.out.println("----------------------------------");
		
		numbers.forEach(g -> System.out.println(g));
		System.out.println("----------------------------------");
		
		numbers.forEach((Integer g) -> System.out.println(g+1));
		System.out.println("----------------------------------");
		
		numbers.forEach(g -> System.out.println(g+1));

	}

}
