package estoque;

public class Produtos {

	public String nome;
	public double preco;
	public int quantidade;

	public double valorTotalEmEstoque() {
		return quantidade * preco;
	}

	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade; // this é para referenciar o atributo da classe
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
    public String toString() {
    	return nome 
    			+ " "
    			+ String.format("%.2f", preco) 
    			+ "R$" + " Quantidade : " 
    			+ quantidade 
    			+ " Total : R$" 
    			+ String.format("%.2f", valorTotalEmEstoque());
    	
    }
}
