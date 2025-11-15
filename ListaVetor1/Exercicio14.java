package atividades;
import java.util.Scanner;
public class Exercicio14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[],b[],i;
		
		a = new int[TAM];
		b = new int[TAM];
		
		// Leitura de A
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "° valor do vetor A: ");
			a[i] = ler.nextInt();
			
			// Cálculo de par e impar
			if(a[i] %2 == 0) {
				b[i] = 1;
			}
			else {
				b[i] = 0;
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
		
		ler.close();
	}
}
