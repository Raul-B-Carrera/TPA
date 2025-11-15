package atividades;
import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[],i,h;
		boolean primo = true;
		
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
		
		// Classificação dos números primos e não primos
		for(i=0; i<TAM; i++) {
			primo = true;
			
			if(a[i] <= 1) {
				primo = false;
			}
			
			if(primo) {
				for(h=2; h*h <= a[i]; h++) {
					if(a[i] %h == 0) {
						primo = false;
						break;
					}
				}	
			}
			
			if(primo == true) {
				System.out.println(a[i]+ " O número é primo");
			}
			else {
				System.out.println(a[i]+ " O número não é primo");
			}
		}
		
		
		ler.close();
}
}