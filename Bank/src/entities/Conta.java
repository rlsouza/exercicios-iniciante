package entities;

public class Conta {

	private String nome;
	private int conta;
	private double saldo;
	
	public Conta(String nome,int conta,double depositoInicial) {
		this.nome = nome;
		this.conta = conta;
		Deposito(depositoInicial);
	}
	public Conta(String nome,int conta) {
		this.nome = nome;
		this.conta = conta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getConta() {
		return conta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void Deposito(double saldo) {
		 this.saldo += saldo;
	}
	
	public void Saque(double saldo) {
		 this.saldo -= saldo + 5;
	}
	
	
}
