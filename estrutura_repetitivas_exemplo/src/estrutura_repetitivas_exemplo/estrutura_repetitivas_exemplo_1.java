package estrutura_repetitivas_exemplo;

import java.util.Scanner;

public class estrutura_repetitivas_exemplo_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("digite um n�mero para somar , caso deseje sair digite 0 ");
		int num = sc.nextInt();
		int soma = num;
		
		while (num != 0 ) {
			num = sc.nextInt();
			soma += num;
		}
		
		System.out.println("a soma dos n�meros � " + soma);
		
		sc.close();
	}

}
