import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee funcionary = new Employee();
		
		System.out.print("Digite o nome do funcionário : ");
		funcionary.name = sc.nextLine();
		System.out.println("Digite o Salário bruto do funcionário : ");
		funcionary.GrossSalary = sc.nextDouble();
		System.out.println("Digite a taxa de desconto do funcionário : ");
		funcionary.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("employee " + funcionary);
		System.out.println();
		System.out.print("Witch percentege to increase salary?");
		double percentege = sc.nextDouble();
		funcionary.IncreaseSalary(percentege);
		System.out.println();
		System.out.println("Updated data : " + funcionary);
		
		sc.close();
	}

}
