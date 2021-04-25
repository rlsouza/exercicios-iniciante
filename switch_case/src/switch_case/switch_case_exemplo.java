package switch_case;

import java.util.Scanner;

public class switch_case_exemplo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		String  dia;
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "Segunda-Feira";
			break;
		case 3:
			dia = "Terça-Feira";
			break;
		case 4:
			dia = "Qaurta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default :
			dia = "Dia inválido";
			break;
			
		}
		
		System.out.printf("Dia da semana :" + dia);
		
		sc.close();

	}

}
