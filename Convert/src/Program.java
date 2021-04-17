import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price ? ");
		double dollar = sc.nextDouble();
		System.out.println("How many dollars will be bought ? ");
		double quantityDollar = sc.nextDouble();
		
		double result = CurrencyConverter.totalDollar(quantityDollar, dollar );
		System.out.println("You payed in R$ : " + result);
		
		
		
		sc.close();
	}

}
