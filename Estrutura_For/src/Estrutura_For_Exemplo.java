import java.util.Scanner;

public class Estrutura_For_Exemplo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int soma = 0;
		
		for (int i = 0; i<n ; i++) { //estrutura PARA - Executa uma vez | condi��o | incremento, usa quando sabe-se a quantidade de repeti��es a ser usada.
			int x = sc.nextInt();
			
			soma = soma + x;
			
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
