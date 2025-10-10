package atividades;
import java.util.Scanner;
public class LerNumero {	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número:");
		numero = ler.nextInt();	
		if(numero>0){
			System.out.println("O número é positivo");
			}
		else if(numero==0) {
			System.out.println("O número é neutro");
		}
		else {
			System.out.println("O número é negativo:");

			ler.close();
		}
	}
}
