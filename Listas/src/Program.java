import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> List = new ArrayList<>();//Instânciando uma lista interface com uma classe compativel (ArrayList).
		
		List.add("Maria");//incluir elemento na lista
		List.add("Alex");//incluir elemento na lista
		List.add("Bob");//incluir elemento na lista
		List.add("Anna");//incluir elemento na lista
		List.add(2, "Marco");//indicando que na posição 2 estou incluindo o atributo digitado.
		System.out.println("Tamano da Lista : " + List.size());// exibe tamanho da lista, quantidade de eleamento contigo nela.
		
		List.remove("Anna");// remover elemento da lista
		List.remove(1);// removendo indicando a posição a ser removida
		
		
		for(String nome : List) {
			System.out.println(nome);
		}
		
		List.removeIf(nome -> nome.charAt(0)== 'M');//Remover todo elemento que possuir o argumento definido, função Lambda.

		for(String nome : List) {
			System.out.println(nome);
		}
		
		System.out.println(List.indexOf("Bob"));// procurar em qual posição se encontra um elemento na lista.
		
		//↓↓↓↓↓↓ Criando uma lista filtrando apenas nomes com a letra definida (B), chamamos a função stream() para podermos,
		// trabalhar com a expressão lambda, porém como o Stream não é compativel com o tipo LIST, nisso chamamos a função
		//collect.Collectors.Tolist();.
		List<String> filtraNome = List.stream().filter(nome -> nome.charAt(0)== 'B').collect(Collectors.toList());
		
		
		System.out.println("Lista com nome filtrado : " + filtraNome);
		
		String name = List.stream().filter(nome -> nome.charAt(0)== 'B').findFirst().orElse("Não achou a Letra");
		// procurar o primento elemento que contenha o argumento definido (B), se não tiver ele retorna algo opcional nullo
		//ou qualquer outra espressão definida em orElse.
		System.out.println(name);
	}
	
	
	
	

}
