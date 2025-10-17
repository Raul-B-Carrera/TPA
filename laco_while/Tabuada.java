package atividades;
import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, numero, resultado;
		
		i = 1;
		System.out.println("Digite o numero que deseja ver a tabuada: ");
		numero = ler.nextInt();
		while(i<=10) {
			resultado = numero * i;
			System.out.println("O " +i+ "° resultado da tabuada é:" +resultado);
			i=i+1;
		}
		ler.close();
	}
}
