package atividades;
import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, numero, total;
		
		i = 1;
		total = 1;
		
		System.out.println("Digite o número para a fatoração: ");
		numero = ler.nextInt();
		do {
			total = total * i;
			i++;
		}while(i<=numero);
		
		System.out.println("O resultado é: " + total);
	}
}