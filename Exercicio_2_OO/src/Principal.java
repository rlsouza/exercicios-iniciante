import java.util.Locale;
import java.util.Scanner;

import estoque.Produtos;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Produtos produto = new Produtos();
		System.out.print("nome do produto : ");
		produto.nome = sc.nextLine();
		System.out.print("preço do produto : ");
		produto.preco = sc.nextDouble();
		System.out.print("quantidade em estoque : ");
		produto.quantidade = sc.nextInt();

		System.out.print(produto);
		System.out.println();
		
		System.out.println("Adicionar quantidade ao produto : ");
		int quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);
		System.out.println("dados atualizados " + produto);
		
		System.out.println();
		System.out.println("Deseja remover quantas unidades : ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println("dados atualizados " + produto);
		
		
		
		

		sc.close();

	}

}
