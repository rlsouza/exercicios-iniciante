package arraySalario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Funcionario>Func = new ArrayList<>();
		System.out.println("Digite a quantidade de funcionários : ");
		int n = sc.nextInt();
		
		
		for(int i=1; i<=n; i++) {
			System.out.println("Funcionário #" + i + ": ");
			System.out.println("Digite seu ID : ");
			int id = sc.nextInt();
			
			while(hasId(Func, id)) {
				System.out.println("ID já existe digite outro : ");
				 id = sc.nextInt();
			}
			sc.nextLine();
			System.out.println("Digite seu nome : ");
			String nome = sc.nextLine();
			System.out.println("Digite seu salario : ");
			double salario = sc.nextDouble();
			
			//Func.add(new Funcionario(id, nome, salario));
			Funcionario funcionario = new Funcionario(id, nome, salario);
			Func.add(funcionario);
			
		}
		
		for(Funcionario funcionario : Func) {
			System.out.println("ID : " + funcionario.getId());
			System.out.println("Nome : " + funcionario.getNome());
			System.out.println("Salario : " + funcionario.getSalario());
		}
		
		System.out.println("Entre com ID para acrescentar o salário : ");
		
		int id = sc.nextInt();
		Funcionario emp = Func.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("O ID não existe");
		}
		else {
			System.out.print("Entre com a porcentagem : ");
			double ValorPorcentagem = sc.nextDouble();
			emp.Porcentagem(ValorPorcentagem);
		}
		
		System.out.println("Lista de Funcionários : ");
		
		for(Funcionario funcionario : Func) {
			System.out.println("ID, " + funcionario.getId() + " Nome " + funcionario.getNome()+ " Salario : " + funcionario.getSalario());
		}
	    
		sc.close();
	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
		
	}

}
