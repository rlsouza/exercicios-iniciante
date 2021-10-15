package boxing_Unboxing_WapperClasses;

public class Program {

	public static void main(String[] args) {
		
		int x = 20;
		Object obj = x; //Boxing - apontando o valor em "x" para a memoria HEAP, para trabalhar com o tipo referencia (classe)
		System.out.println(obj);//imprimindo na tela o valor de obj(classe genérica).
		
		int y = (int)obj;//Unboxing - puxando um valor referencia(classe), para uma variavel na memoria stack, só é compativel,
		//fazendo a conversão casting de um objeto para variavel(valor).
		
		System.out.println(y);
		
		Integer exe = x;//Wapperclass - Converter uma variavel primitiva em uma classe referencia, sem precisar o uso de Casting.
		y = exe*2;//pode se utilizar a classe para fazer expressoes também.
		
		System.out.println(y);
	}

}
