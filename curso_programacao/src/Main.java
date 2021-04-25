import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String nome = "maria";
		int idade = 32;
		double renda = 520.32;
		int y = 32;
		double x = 10.35784;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);//Formatação de 2 casas decimais apos a virgula//
		System.out.printf("%.4f%n", x);//Formatação de 4 casas decimais apos a virgula//
		Locale.setDefault(Locale.US);//definir local de caracteres e unicode, puxando a biblioteca//
		System.out.printf("%.2f%n", x);//printf que é utilizado para fazer formatação//
		System.out.println("Resultado é = " + x + " Metros ");//conctenação usando o operador +//
		System.out.printf("Resultado = %.2f Metros%n", x);//usando a quebra de linha %n no printf//
		
		System.out.printf("%s Tem %d anos E ganha R$ %.2f Reais %n", nome, idade, renda);/* modos de chamar as variaveis
		%s = Chamar variavel String
		%d = Chamar variavel Int
		%f = chamar Variavel double */
		System.out.println(nome + " Tem " + idade + " Anos e ganha " + renda);
		
		
		

	}

}
