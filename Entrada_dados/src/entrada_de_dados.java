import java.util.Scanner;//biblioteca scanner//
public class entrada_de_dados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //chamada scanner para leitura de entrada de dados
		
		String nome; // variavel x esperando entrada de dados//
		int idade;
		double salario;
		char sexo;
		nome = sc.next(); //comando para esperar a entrada de dados do usuario do tipo string/texto//
		idade = sc.nextInt();//comando para esperar a entrada de dados do usuario do tipo numero/inteiro//
		salario = sc.nextDouble();//comando para esperar a entrada de dados do usuario do tipo fracionado duas casas//
		sexo = sc.next().charAt(0);//comando para esperar a entrada de dados do usuario do tipo verdairo ou falso//
		String s1, s2, s3;
		
		
		System.out.printf("Vo�� digitou %s%n", nome);//formatado texto//
	     System.out.printf("Vo�� digitou %d%n", idade);//formatado numero//
	     System.out.printf("Vo�� digitou %.2f%n", salario);//formatado numero com duas casas//
	     System.out.printf("Vo�� digitou %s%n", sexo);//formatado numero com duas casas//
	     System.out.println("vo�� digitou: " + nome);//concactenado texto//
	     System.out.println("vo�� digitou: " + idade);//concactenado numero//
	     System.out.println("vo�� digitou: " + salario);//concactenado numero com duas casas//
	     System.out.println("vo�� digitou: " + sexo);//concactenado char true ou false//
	     
	     sc.nextLine();//comando para fazer quebra de linha entre as palavras//
	     s1 = sc.nextLine();//comando nextline(); que ser para escrever varias palavras em uma linha, fazendo quebra de linhas// 
	     s2 = sc.nextLine();//quebra de linhas//
	     s3 = sc.nextLine();//quebra de linhas//
	     
	     
	      System.out.println("Dados Digitados :");
	      System.out.println(s1);
	      System.out.println(s2);
	      System.out.println(s3);
	      
	      
	      
		
		
		sc.close();//saida do scanner indicando que n�o precisa mais da entrada de dados//

	}

}
