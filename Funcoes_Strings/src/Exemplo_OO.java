import java.util.Scanner;

public class Exemplo_OO {

	public static void main(String[] args) {
//orienta��o a Objeto nada mais � que reeloca��o de fun��es e classes//
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite 3 n�meros para saber qual deles � o maior");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int num_Maior = max(a,b,c);
		
		showResult(num_Maior);
		
		
		sc.close();
	}
          public static int max(int x, int y, int z){//criando nova fun��o chamando n�meros inteiros//
        	  //public pode ser chamada em qualquer classe//
        	  //static = posso ser chamada independente se for criado um objeto//
        	  //void chamada somente de leitura para exibir uma variavel//
        	  int aux;
        	  if(x > y && x > z) {
        		  
        		  aux = x;
        	  }else if (y > z) {
        		  
        		  aux = y;
        		  
        	  }else {
        		  aux = z;;
        	  }
        	  return aux;
          }
          
         public static void showResult(int value) {
        	 System.out.println(" Maior n�mero � : " + value);
        	 
         }
}
