package atividades;
import java.util.Scanner;
public class MaiorIdade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, maior, menor, idade;
		
		menor = 0;
		maior = 0;
		i = 1;
		while(i<=5) { 
			System.out.println("Digite a idade da " +i+ "° pessoa: ");
			idade = ler.nextInt();
			if(idade<18) {
				menor = menor + 1;
				
			}else {
				maior = maior +1;
			}
			i=i+1;
		}
		System.out.println("tem " +menor+ " pessoas com menor idade e têm " +maior+ " Pessoas com maior idade");
		
		ler.close();
	}

}
