import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
        
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A :");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double pi = 3.14159;
		double triangulo = (a*c)/2;
		double circulo = c*c*pi;
		double trapezio = (a+b)*c/2;
		double quadrado = Math.pow(b, 2);
		double retangulo = a*b;
		
		System.out.printf(" triangulo :  %.3f%n", triangulo);
		System.out.printf(" circulo :  %.3f%n", circulo);
		System.out.printf(" trapezio :  %.3f%n", trapezio);
		System.out.printf(" quadrado :  %.3f%n", quadrado);
		System.out.printf(" retangulo :  %.3f%n", retangulo);
		
		
		sc.close();
	}

}
