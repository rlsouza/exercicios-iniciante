
public class Funcoes_Matematicas {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double a,b,c;
		
		a = Math.sqrt(x);//Fun��o matem�tica para saber a raiz quadrada//
		b = Math.sqrt(y);//Fun��o matem�tica para saber a raiz quadrada//
		c = Math.sqrt(25);//Fun��o matem�tica para saber a raiz quadrada//
		
		System.out.println("Raiz Quadrada de " + x + " � igual a : " + a);
		System.out.println("Raiz Quadrada de " + y + " � igual a : " + y);
		System.out.println("Raiz Quadrada de " + 25 + " � igual a : " + c);
		
		
		a = Math.pow(x,y);//Fun��o pot�ncia ou elevado ao quadrado//
		b = Math.pow(y, 2.0);// Fun��o pot�ncia ou elevado ao quadrado (exemplo y2 = 81)//
		c = Math.pow(5.0, 2.0);// Fun��o pot�ncia ou elevado ao quadrado//
		
		System.out.println(x + " elevado a " + y + " = " + a );
		System.out.println(y + " Elevado ao quadrado =  " + b);
		System.out.println("5 elevado ao quadrado = " + c);
		
		a = Math.abs(y);//Fun��o de n�mero absoluto//
		b = Math.abs(z);//Fun��o de n�mero absoluto//
		
		System.out.println("O n�mero absoluto de " + y + " � " + a);
		System.out.println("O n�mero absoluto de " + z + " � " + b);
		
		
		
		
		

	}

}
