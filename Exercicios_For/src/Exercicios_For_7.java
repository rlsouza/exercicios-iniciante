import java.util.Scanner;

public class Exercicios_For_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero = sc.nextInt();
		int quadrado,cubo;
		
		for (int i=1;i<=numero;i++) {
			
			quadrado = i*i;
			cubo = quadrado*i;
			
			System.out.println(i+" "+quadrado+" "+cubo);
			
			
			sc.close();
			
		}

	}

}
