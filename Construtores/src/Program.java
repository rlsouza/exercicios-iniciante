import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("nome do produto : ");
		String nome = sc.nextLine();
		System.out.print("preço do produto : ");
		double preco = sc.nextDouble();
		System.out.print("quantidade em estoque : ");
		int quantidade = sc.nextInt();
		
		Product product = new Product(nome, preco, quantidade);
		System.out.print(product);
		System.out.println();

		System.out.println("Adicionar quantidade ao produto : ");
		quantidade = sc.nextInt();
		product.adicionarProdutos(quantidade);
		System.out.println("dados atualizados " + product);

		System.out.println();
		System.out.println("Deseja remover quantas unidades : ");
		quantidade = sc.nextInt();
		product.removerProdutos(quantidade);

		System.out.println("dados atualizados " + product);

		sc.close();

	}

}
