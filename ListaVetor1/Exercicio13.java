package atividades;
import java.util.Scanner;
public class Exercicio13 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	final int TAM = 5;
	int a[], i, j;
	boolean palindromo = false;
	
	a = new int[TAM];
	
	// Leitura de A
	for(i=0; i<TAM; i++) {
		System.out.println("Digite o " +(i+1)+ "° valor do vetor A: ");
		a[i] = ler.nextInt();
	}
	
	// Verificação de palindromo
	for(i=0; i<TAM; i++) {
		j = TAM -1;
		
		if(a[i] == a[j]) {
			palindromo = true;
		}
		else {
			palindromo = false;
		}
		j--;
	}
	
	 // Apresentação de A
	System.out.print("A = [ ");
	for(i=0; i<TAM; i++) {
		System.out.print(a[i] + " ");
	}
	System.out.print("]");
	
	if(palindromo == true) {
		System.out.println("\n É um palindromo" );
	}
	else {
		System.out.println("\n Não é um palindromo");
	}
	
}
}
