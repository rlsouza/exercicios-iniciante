package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;

public class Program {
 
	public static void main(String[] args) {
    
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        Triangulo x,y;
        
        x = new Triangulo();
        y = new Triangulo();
        
        
        System.out.println("Digite os lados do triangulo X : ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite os lados do triangulo Y : ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        double areaX = x.area();
        double areaY = y.area();
     
       
       System.out.printf("�rea do triangulo X � : %.4f%n", areaX);
       System.out.printf("�rea do triangulo Y � : %.4f%n", areaY);
       
       if (x.area() > y.area()) {
    	  System.out.printf("�rea do triangulo X � maior : %.4f%n", areaX);
    	   
       }else {
    	   
    	   System.out.printf("�rea do triangulo Y � maior : %.4f%n", areaY);
       }
       
       
       
    
    
    
    sc.close();
		
	}

}
