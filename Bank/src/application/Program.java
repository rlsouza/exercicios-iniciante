package application;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta;
		System.out.print("Entre com seu nome : ");
		String nome = sc.nextLine();
		System.out.print("Entre com o numero da conta : ");
		int numconta = sc.nextInt();
		System.out.print("Deseja realizar um deposito inicial s/n?");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("insira o valor : ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(nome, numconta, depositoInicial);
		}else {
			conta = new Conta(nome, numconta);
		}

		System.out.println("Voçê iniciou o saldo de sua conta com : " + conta.getSaldo());
		System.out.println("Realizar deposito de quanto : ");
		double deposito = sc.nextDouble();
		conta.Deposito(deposito);
		
		System.out.println();
		System.out.print("Saldo atualizado apos o deposito R$" + conta.getSaldo());
		System.out.println();
		
		System.out.println("Deseja remover quanto de saldo : ");
		double saque = sc.nextDouble();
		conta.Saque(saque);
		System.out.println("Nome : " + conta.getNome());
		System.out.println("Número da conta : " + conta.getConta());
		System.out.println("Conta atualizada R$" + conta.getSaldo());
		
		sc.close();
	}

}
