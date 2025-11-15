package atividades;
import java.util.Scanner;
public class Exercicio11 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	final int TAM = 10;
	int a[], i, busca, escolha;
	boolean encontrado;
	
	a = new int[TAM];
	
	// Leitura de A
	for(i=0; i<TAM; i++) {
		System.out.println("Digite o " +(i+1)+ "° valor do vetor A: ");
		a[i] = ler.nextInt();
	}
	
	do {
		encontrado = false;
		
		// BUsca do valor
		System.out.println("\n Digite o número que deseja buscar:");
		busca = ler.nextInt();
		
		for(i=0; i<TAM; i++) {
			if(a[i] == busca) {
				encontrado = true;
				break;
			}
		}
		if(encontrado == true) {
			System.out.println("O numero: " +busca+ ", foi encontrado");
		}
		else {
			System.out.println("Numero não encontrado");
		}
		
		System.out.println("Deseja continuar? "
				+ "\n Sim - 1 / Não - 0");
		escolha = ler.nextInt();
		
	}while(escolha == 1);
	
	ler.close();
}
}
