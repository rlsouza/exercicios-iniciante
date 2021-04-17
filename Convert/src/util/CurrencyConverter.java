package util;

public class CurrencyConverter {

	
		public static final double IOF = 0.06; 
		public static double totalDollar (double quantityDollar,double dollar) {
			return dollar*quantityDollar * (1+IOF);
			
		}
	}


