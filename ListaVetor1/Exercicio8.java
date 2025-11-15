package atividades;
import java.util.Scanner;
public class Exercicio8 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	final int TAM = 10;
	int a[],b[], i, j, soma;
	
	a = new int[TAM];
	b = new int[TAM];
	
	// leitura de A
	for(i=0; i<TAM; i++) {
		System.out.println("Digite o " +(i+1)+ "° valor do vetor A: ");
		a[i] = ler.nextInt();
	}
	
	// Cálculo da somatória
	for(i=0; i<TAM; i++) {
		soma = 0;
		
		for(j=i; j<TAM; j++) {
			soma = soma + a[j];
		}
		b[i] = soma;
	}
	
	 // Apresentação de A
	System.out.print("\n A = [ ");
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
