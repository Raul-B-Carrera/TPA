package atividades;
import java.util.Scanner;
public class CalculoMedia {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, media, exame;
		
		System.out.println("Digite sua primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.println("Digite sua Segunda nota: ");
		nota2 = ler.nextDouble();
		media = nota1 + nota2 /2;
		if(media < 3) {
			System.out.println("O aluno esta reprovado");
		}
		else if(media >= 6) {
			System.out.println("O aluno esta aprovado");
		}
		else if(media >= 3 &&  media < 6) {
			System.out.println("O aluno esta em exame, digite a nota do exame:");
			exame = ler.nextDouble();
			media = exame + nota1 + nota2 /3;
			if(media >= 6) {
				System.out.println("O aluno está aprovado");
			}
			else {
				System.out.println("O aluno está reprovado");
			}
			ler.close();
		}
	}
	
}
