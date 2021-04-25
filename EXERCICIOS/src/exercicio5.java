import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nump1 = sc.nextDouble();
		double valorUnit1 = sc.nextDouble();
		double nump2 = sc.nextDouble();
		double valorUnit2 = sc.nextDouble();
		double valorTotal = nump1*valorUnit1 + nump2*valorUnit2;
		
		System.out.printf(" O valor total a ser pago é :  R$%.2f%n", valorTotal);
		
		sc.close();
	}

}
