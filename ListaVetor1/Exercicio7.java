package atividades;
import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 15;
		int a[],b[], i, h , fatorial, acumulador;
		
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "° valor do vetor A: ");
			a[i] = ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			fatorial = a[i];
			acumulador = 1;
			
			for(h=1; h<=fatorial; h++) {
				acumulador = acumulador * h;
				b[i] = acumulador;
			}
		}
		
		System.out.print("\n B = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
		
		ler.close();
	}
}
