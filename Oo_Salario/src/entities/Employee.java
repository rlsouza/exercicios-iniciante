package entities;

public class Employee {

	public String name;
	public double GrossSalary;
	public double Tax;
	
	public double NetSalary() {
		return GrossSalary - Tax;
		
	}
	
	public void IncreaseSalary(double percentege) {
	   GrossSalary += GrossSalary * percentege / 100;
		
	}
	public String toString() {
		return  name
				+", "
				+"$ "
				+ String.format("%.2f", NetSalary());
				
				
		
	}
}
