package atividades;

public class Soma5 {
	public static void main(String[] args) {
		int i,soma;
		
		soma = 0;
		
		for(i=0;i<=400;i++) {
			if(i % 5 == 0) {
				soma = soma + i;
			}
		}
		System.out.println("A soma dos números é: " +soma);
	}
}