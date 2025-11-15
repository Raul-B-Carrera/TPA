package atividades;
import java.util.Scanner;
public class Exercicio15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], c[],i;
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		// Leitura de A
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "° valor do vetor A: ");
			a[i] = ler.nextInt();
		}
		
		// Leitura de B
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "° valor do vetor B: ");
			b[i] = ler.nextInt();
			
			// Cálculo de menor, maior e igual
			if(a[i] > b[i]) {
				c[i] = 1;
			}
			else if(a[i] == b[i]) {
				c[i] = 0;
			}
			else {
				c[i] = -1;
			}
		}
		
		 // Apresentação de A
		System.out.print("A = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		
		 // Apresentação de B
		System.out.print("\n B = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
		
		 // Apresentação de C
		System.out.print("\n C = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.print("]");
		
		ler.close();
	}
}
