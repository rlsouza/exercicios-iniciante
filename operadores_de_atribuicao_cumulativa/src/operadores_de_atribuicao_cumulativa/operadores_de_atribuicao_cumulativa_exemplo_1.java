package operadores_de_atribuicao_cumulativa;

import java.util.Locale;
import java.util.Scanner;

public class operadores_de_atribuicao_cumulativa_exemplo_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		double conta = 50;
		
		if (minutos > 100) {
			
		// sem operador cumulativo conta = conta + (minutos - 100)* 2; //
			
			conta += (minutos - 100)*2; // com o operando cumulativo " enxutou o c�digo que � a mesma l�gica de cima ".
		}
		
		System.out.printf("Valor da conta R$ %.2f%n", conta);
		
		
		sc.close();

	}

}
