package atividades;
import java.util.Scanner;
public class GastoCombustivel {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double distancia, litro, gastoMedio;
		
		System.out.println("Digite a distância percorrida em quilômetros: ");
		distancia = ler.nextDouble();
		System.out.println("Digite a capacidade do tanque de combustível em litros: ");
		litro = ler.nextDouble();
		gastoMedio = distancia/litro;
		if (gastoMedio>=10/litro) {
			System.out.println("O carro é econômico");
		}
		else {
			System.out.println("O carro não é econômico");
		}
		ler.close();
	}

}
