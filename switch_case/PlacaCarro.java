package exercicios;
import java.util.Scanner;
public class PlacaCarro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int placa;
		
		System.out.println("Digite o ultimo número de sua placa:");
		placa = ler.nextInt();
		switch(placa) {
			case 1:
			case 2:
				System.out.println("Você não pode circular na segunda-feira");
				break;
			case 3:
			case 4:
				System.out.println("Você não pode circular na terça-feira");
				break;
			case 5:
			case 6:
				System.out.println("Você não pode circular na quarta-feira");
				break;
			case 7:
			case 8:
				System.out.println("Você não pode circular na quinta-feira");
				break;
			case 9:
			case 0:
				System.out.println("Você não pode circular na sexta-feira");
				break;
			default:
				System.out.println("Número invalido");
		}
		ler.close();
	}
}
