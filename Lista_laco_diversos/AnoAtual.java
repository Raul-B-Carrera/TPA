package exercicios;

import java.util.Scanner;

public class AnoAtual {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anoNasc,anoAtual,idade,escolha;
		
		do {
			System.out.println("Digite seu ano de nascimento: ");
			anoNasc = ler.nextInt();
			System.out.println("Digite o ano atual: ");
			anoAtual = ler.nextInt();
			
			idade = anoAtual - anoNasc;
			System.out.println("Sua idade é: " +idade);
			
			System.out.println("Deseja continuar? 1, sim; 0, não");
			escolha = ler.nextInt();
		} while (escolha == 1);
		ler.close();
	}
}
