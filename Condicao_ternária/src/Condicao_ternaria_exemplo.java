import java.util.Scanner;

public class Condicao_ternaria_exemplo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		double preco = sc.nextDouble();

		double desconto;

		/* if (preco < 20) {

			desconto = preco * 0.01;
		} else {
			desconto = preco * 0.05; , (metodo convencional) */
		
		desconto = (preco <20) ? preco * 0.01 : preco * 0.05; //
		//condi��o tern�ria enxutando o c�digo usando a logica verdadeiro ou falso de acordo com a empress�o acima//
		
		System.out.println(" pre�o final " + desconto);
		
		sc.close();
		}
		
		
		
	}


