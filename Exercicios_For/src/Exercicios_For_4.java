import java.util.Scanner;

public class Exercicios_For_4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			double num1 = sc.nextInt();
			double num2 = sc.nextInt();
			if(num2 == 0) {
				
				System.out.println("Impossivel Dividir por zero");
				
			}
			
			else {
				
				System.out.println(num1/num2);
			}
			
		}
		
		
		
		sc.close();

	}

}
