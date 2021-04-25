import java.util.Locale;
import java.util.Scanner;

public class Exercicio_estrutura_condiconal_6 {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Intervalo de n�meros : [0,25], (25,50], (50,75], (75,100]");
		
		
		System.out.println("Digite  um n�mero : ");
		double num1 = sc.nextDouble();
	    if (num1 <0) {
	    	System.out.println("Fora do intervalo");
	    	
	    }else if(num1 == 0 || num1 <= 25){
			System.out.println(" Dentro do intervalo [0,25]");
			
		}else if( num1 == 25 || num1 <= 50){
			System.out.println(" Dentro do intervalo (25,50] ");
			
		}else if (num1 == 50 || num1 <= 75) {
			System.out.println(" Dentro do intervalo (50,75] ");
			
		}else if (num1 == 75 || num1 <= 100) {
			System.out.println(" Dentro do intervalo (75,100] ");
			
		}else {
			
			System.out.println("Fora do intervalo");
		}

	
		sc.close();
	}

}
