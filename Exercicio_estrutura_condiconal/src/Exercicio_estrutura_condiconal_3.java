import java.util.Scanner;

public class Exercicio_estrutura_condiconal_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o  1 � n�mero :");
		int m = sc.nextInt();
		System.out.println("Digite o  2 � n�mero :");
		int n = sc.nextInt();
		
		
		
		
		
		if ((m / n) * n == m || (n / m) * m == n){
			
			System.out.println(" esse n�mero � mutiplo de  " + n );
		}else {
			System.out.println(" esse n�mero n�o � multiplo de " + m);
			
			sc.close();
			
		}
	}

}
