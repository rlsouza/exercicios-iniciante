package arraySalario;

public class Funcionario {
	
	public Funcionario(int id, String nome, double salario) {
		
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	private int id;
	private String nome;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public double getSalario() {
		return salario;
	}
	
	public void Porcentagem (double ValorPorcentagem) {
		salario += salario * ValorPorcentagem / 100.0;
	}
	@Override
	public String toString() {
		return "#";
	}

}
