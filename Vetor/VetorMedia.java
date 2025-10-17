package vetor_exercicios;
import java.util.Scanner;
public class VetorMedia {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], i, soma = 0;
		double media;
		
		a = new int[TAM];
		
		// Leitura do A e calculo soma
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "° valor do vetor A:");
			a[i] = ler.nextInt();
			soma = soma + a[i];
		}
		
		// Calculo Media
		media = soma / TAM;
		System.out.println("A media é: " +media);
		
		ler.close();
	}

}
