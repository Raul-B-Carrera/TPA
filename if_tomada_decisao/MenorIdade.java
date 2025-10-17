package atividades;
import java.util.Scanner;
public class MenorIdade {
	public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in);
	 int anoNascimento, anoAtual, idade;
	 
	 anoAtual = 2025;
	 System.out.println("Digite seu ano de nascimento:");
	 anoNascimento = ler.nextInt();
	 idade = anoAtual - anoNascimento;
	 System.out.println("Sua idade é: " + idade);
	 if(idade>=18) {
		 System.out.println("Você é maior de idade");
	 }
	 else {
		 System.out.println("Você é menor de idade");
	 }
	 
	 ler.close();
	 
	}
	 

}