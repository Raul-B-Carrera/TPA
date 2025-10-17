package vetor_exercicios;
import java.util.Scanner;
public class VetorInvertido {
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
			b[i] = a[i];
		}
		
		// Apresentação do A
		System.out.print("A = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		
		// Apresentação invertida
		System.out.print("\nB = [ ");
		for(i=TAM-1; i>=0; i--) {
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
		
		ler.close();
	}
}