import java.util.Scanner;

public class Exercicio_estrutura_condiconal_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Escreva um n�mero");
		int num1 = sc.nextInt();
		
		
		if (num1 <0) {
			
			System.out.println(" O n�mero digitado � negativo: " + num1);
		}else {
			System.out.println(" O n�mero digitado � positivo : " + num1);
		}
		
		sc.close();
	}

}
