package vetor_exercicios;
import java.util.Scanner;
public class VetorSoma {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], c[], i;
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		// Leitura do A
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "° valor do vetor A:");
			a[i] = ler.nextInt();
		}
		
		// Leitura do B
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "° valor do vetor B:");
			b[i] = ler.nextInt();
		}
		
		// Calculo e apresentação do C
		System.out.print("C = [ ");
		for(i=0; i<TAM; i++) {
			c[i] = a[i] + b[i];
			System.out.print(c[i] + " ");
		}
		
		System.out.print("]");
		ler.close();
		
	}
}
