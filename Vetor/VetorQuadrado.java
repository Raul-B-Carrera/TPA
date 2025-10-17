package vetor_exercicios;
import java.util.Scanner;
public class VetorQuadrado {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], i;
		
		a = new int[TAM];
		b = new int[TAM];
		
		// Leitura do A
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "° valor do vetor A:");
			a[i] = ler.nextInt();
		}
		
		// Calculo e apresentação do quadrado
		System.out.print("B = [ ");
		for(i=0; i<TAM; i++) {
			b[i] = a[i] * a[i];
			System.out.print(b[i] + " ");
		}
		
		System.out.print("]");
		ler.close();
	}
}
