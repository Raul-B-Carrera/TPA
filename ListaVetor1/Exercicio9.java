package atividades;
import java.util.Scanner;
public class Exercicio9 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	final int TAM = 10;
	int a[], b[], c[], i, j, intersecao = 0;
	
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
	}
	
	// Cálculo da interseção
	for(i=0; i<TAM; i++) {
		for(j=0; j<TAM; j++) {
			if(a[i] == b[j]) { 
				c[intersecao] = a[i];
				intersecao++;
			}
		}
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
	
	// Apresentação de C
	System.out.print("\n C = [ ");
	for(i=0; i<intersecao; i++) {
		System.out.print(c[i] + " ");
	}
	System.out.print("]");
	
	ler.close();
}
}
