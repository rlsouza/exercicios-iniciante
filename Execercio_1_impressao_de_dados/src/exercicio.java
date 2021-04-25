import java.util.Locale;

public class exercicio {

	public static void main(String[] args) {
		
		String product1 = "computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products : ");
		
		System.out.printf("%s, Which Price is %.2f%n", product1, price1);
		
		System.out.printf("%s, Which Price is %.2f%n%n", product2, price2);
		
		System.out.printf("Record %d Years Old, Code %d And Gender : %s%n%n", age, code, gender);
		
		System.out.printf("Measure With eight Decimal Places: %f%n", measure);
		
		System.out.printf("Rouded (Three Decimal Places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("US Decimal Point: %.3f%n", measure);
		

	}

}
