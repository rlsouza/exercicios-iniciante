import java.util.Scanner;

public class Exercicio_estrutura_condiconal_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		     System.out.println("Escreva um n�mero : ");
		int valorDigitado = sc.nextInt();
		
		
		int resto = valorDigitado % 2;
		
		if (resto != 0){
			
			System.out.println("O n�mero digitado � Impar : " + valorDigitado);
		}else {
			
			System.out.println(" O n�mero digitado � Par : " + valorDigitado);
		}
		
		sc.close();
	}

}
