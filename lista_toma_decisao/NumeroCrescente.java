package atividades;
import java.util.Scanner;
public class NumeroCrescente {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c, numero1, numero2, numero3;
		
		System.out.println("Digite o valor de A:");
		a = ler.nextInt();
		System.out.println("Digite o valor de B:");
		b = ler.nextInt();
		System.out.println("Digite o valor de C:");
		c = ler.nextInt();
		if(a <= b && a <= c) {
			numero1 = a;
		}
		else if(b <= a && b <= c) {
			numero1 = b;
		}
		else {
			numero1 = c;
		}
		System.out.println("O Primeiro número: " + numero1);
		if(a >= b && a <= c) {
			numero2 = a;
		}
		else if(b >= a && b <= c) {
			numero2 = b;
		}
		else {
			numero2 = c;
		}
		System.out.println("O Segundo número: " + numero2);
		if(a > b && a > c) {
			numero3 = a;
		}
		else if(b > a && b > c) {
			numero3 = b;
		}
		else {
			numero3 = c;
		}
		System.out.println("O Terceiro número: " + numero3);
		
		ler.close();
			
		}
	}


