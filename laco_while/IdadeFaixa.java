package atividades;
import java.util.Scanner;
public class IdadeFaixa {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, idade, primeira, segunda, terceira, quarta, quinta;
		
		primeira = 0;
		segunda = 0;
		terceira = 0;
		quarta = 0;
		quinta = 0;
		i = 1;
		while(i<=10) { 
			System.out.println("Digite a idade da " +i+ "° pessoa: ");
			idade = ler.nextInt();
			if(idade<=15) {
				primeira = primeira + 1;
			}
			else if(idade >= 16 && idade <=30) {
				segunda = segunda +1;
			}
			else if(idade >= 31 && idade <=45) {
				terceira = terceira +1;
			}
			else if(idade >= 46 && idade <=60) {
				quarta = quarta +1;
			}
			else {
				quinta = quinta +1;
			}
			i=i+1;
		}
		System.out.println("Tem "+primeira*10+"% pessoas na primeira faixa etária");
		System.out.println("Tem "+segunda*10+"% pessoas na segunda faixa etária");
		System.out.println("Tem "+terceira*10+"% pessoas na terceira faixa etária");
		System.out.println("Tem "+quarta*10+"% pessoas na quarta faixa etária");
		System.out.println("Tem "+quinta*10+"% pessoas na quinta faixa etária");
		
		ler.close();
	}

}
