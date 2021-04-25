package entities;

public class Rectangle {

	private static final double Area = 0;
	public double Widht;
	public double Height;

	public double Area() {
		return (Widht * Height);

	}

	public double Perimeter() {
		return (Widht * 2) + (Height * 2);

	}
    public double Diagonal() {
    	double resultDiagonal =  (Widht*Widht)+(Height*Height);
    	return resultDiagonal = Math.sqrt(resultDiagonal);
    	
    }
    public String toString() {
    	return "Area = " 
    		   +String.format("%.2f\n", Area())
    		   +"Perimeter = "
    	       + String.format("%.2f\n", Perimeter())
    	       +"Diagonal = "
    	       + String.format("%.2f",Diagonal());
    	
    }
}
