import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
         
		Locale.setDefault(Locale.US);
		
		double matricula = sc.nextDouble();
		double horasTrabalhadas = sc.nextDouble();
		double valorHora = sc.nextDouble();
		double salario = (horasTrabalhadas*valorHora);
		
		
		System.out.println("Sua Matricula : " + matricula);
		
		//System.out.printf("N�mero de horas trabalhadas : %.2f%n", horasTrabalhadas);//
		
		//System.out.printf(" Valor Hora : %.2f%n", valorHora);//
		
		System.out.printf(" Seu sal�rio : %.2f%n", salario);
		
		
		
		
		sc.close();
		
		
	}

}
