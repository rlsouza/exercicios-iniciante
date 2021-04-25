import java.util.Scanner;

public class Exercicio_estrutura_condiconal_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escreve o tempo inicial :");
		int horaInicial = sc.nextInt();
		System.out.println("Escreve o tempo final :");
		int horaFinal = sc.nextInt();
		
		int tempo = horaFinal - horaInicial;
		
		
		if (tempo <= 0) {
			System.out.println("O tempo do jogo foi de :" + (tempo + 24) + " Horas");
			
		}else {
			
			System.out.println(" O tempo do jogo foi de : " + tempo + " Horas");
		}
		sc.close();
	}

}
