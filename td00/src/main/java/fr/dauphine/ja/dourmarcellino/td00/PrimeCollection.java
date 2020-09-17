package fr.dauphine.ja.dourmarcellino.td00;

import java.util.ArrayList;
import java.util.Random;

import javax.naming.InitialContext;

/**
 * Hello world!
 *
 */
public class PrimeCollection {

	public static ArrayList<Integer> numbers;

	public PrimeCollection() {
		numbers = new ArrayList<>();
	}

	public static void initRandom(int n, int m) {
		Random rand = new Random();
		for (int i = 0; i < n; i++) {
			numbers.add(rand.nextInt(m));
		}
	}
	
	private static boolean isPrime(int p) {
		int sqrt = (int) Math.sqrt(p) + 1; 
		for (int i = 2; i < sqrt; i++) { 
			if (p % i == 0) { 
				  return false;
			}
		}
		return true;
	}
	
	public static void printPrimes() {
		for(int p: numbers) {
			if (isPrime(p) == true) {
				System.out.println(p);
			}
		}
	}

	@SuppressWarnings("unused")
	public static void main( String[] args )
	{
		PrimeCollection primeCollection = new PrimeCollection();
		initRandom(100, 3000);
		printPrimes();
	}

}
