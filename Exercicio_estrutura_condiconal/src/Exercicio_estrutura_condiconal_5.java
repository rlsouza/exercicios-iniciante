import java.util.Scanner;

public class Exercicio_estrutura_condiconal_5 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o n�mero do produto que deseja : %n" + " 1 cachorro quente R$4 %n" + " 2 x-salada R$4,50 %n" + " 3 X - bacon R$5 %n" + " 4 Torrada Simples R$2 %n" + " 5 Refrigerante R$1,50 %n");
		int cod = sc.nextInt();
		
		System.out.println("Digite a quantidade que deseja :");
		int quantidade = sc.nextInt();
		
		if (cod == 1){
			System.out.println(4*quantidade + "valor a pagar R$"+" cachorro quente " + quantidade + " Un");
			
		}else if (cod == 2) {
			System.out.println("valor a pagar: R$" +4.50*quantidade + (" || x-salada =  " + quantidade + " Un"));
		}else if (cod == 3) {
			System.out.println("valor a pagar: R$" +5*quantidade + " || X - bacon =  " + quantidade + " Un");
		}else if (cod == 4) {
			System.out.println("valor a pagar: R$" + 2*quantidade + " || Torrada Simples =  " + quantidade + " Un");
		}else {
			System.out.println("valor a pagar: R$" + 1.50*quantidade + " || Refrigerante =  " + quantidade + " Un");
		}
		
		
		
		
		sc.close();
		
	}

}
