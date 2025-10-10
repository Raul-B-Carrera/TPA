package atividades;
import java.util.Scanner;
public class FaixaEtaria {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, anoAtual,anoNascimento;
		
		anoAtual = 2025;
		System.out.println("Digite seu ano de nascimento:");
		anoNascimento = ler.nextInt();
		idade = anoAtual - anoNascimento;
		System.out.println("Sua idade é: " + idade);
		if(idade<10) {
			System.out.println("Você é Criança");
		}
		else if(idade>=10 && idade<18) {
			System.out.println("Você é Adoloscente");
		}
		else if(idade>=18 && idade<60) {
			System.out.println("Você é Adulto");
		}
		else {
			System.out.println("Você é Idoso");
		}
		
		ler.close();
	}

}
