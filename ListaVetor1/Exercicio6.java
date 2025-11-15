package atividades;
public class Exercicio6 {
public static void main(String[] args) {
	final int TAM = 11;
	int a[], i, potencia = 1;
	
	a = new int[TAM];
	
	// Cálculo da potência
	for(i=0; i<TAM; i++) {
		a[i] = potencia;
		potencia = potencia * 2;
	}
	
	// Apresentação de A
	System.out.print("A = [ ");
	for(i=0; i<TAM; i++) {
		System.out.print(a[i] + " ");
	}
	System.out.print("]");

}
}
