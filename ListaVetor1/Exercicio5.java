package atividades;
import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], i, divisor;
		
		a = new int[TAM];
		
		// Leitura de A
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "° valor do vetor A: ");
			a[i] = ler.nextInt();
		}
		
		// Apresentação de A
		System.out.print("A = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		
		// Apresentação e cálculo dos divisores
		for(i=0; i<TAM; i++) {
			System.out.print("\n " +a[i]+ " e seus divisores: ");
			
			for(divisor=1; divisor<=a[i]; divisor++) {
				if(a[i] %divisor == 0) {
					System.out.print(divisor+ " ");
				}
			}
		}
		
		ler.close();
}
}
