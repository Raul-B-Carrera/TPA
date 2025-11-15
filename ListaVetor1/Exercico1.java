package atividades;
import java.util.Scanner;
public class Exercico1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 20;
		int a[], b[], posicao, i;
		
		a = new int[TAM];
		b = new int[TAM];
		posicao = 0;
		
		// Leitura de A
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "° valor do vetor A:");
			a[i] = ler.nextInt();	
		}
		
		// Posicionamento de pares
        for(i = 0; i < TAM; i++) {
            if (a[i] % 2 == 0) {
                b[posicao++] = a[i];
            }
        }
        
        // Posicionamento de impares
        for(i=0; i<TAM; i++) {
            if (a[i] % 2 == 1) {
                b[posicao++] = a[i];
            }
        }

        // Apresentação de B
        System.out.print("C = [ ");
        for (i=0; i<TAM; i++) {
            System.out.print(b[i] + " ");
        }
        
        System.out.print("]");
		ler.close();
    }
}
