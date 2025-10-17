package atividades;
import java.util.Scanner;
public class TrianguloTipo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c;
		
		 System.out.print("Digite o valor do lado A: ");
		 a = ler.nextDouble();
		 System.out.print("Digite o valor do lado B: ");
		 b = ler.nextDouble();
		 System.out.print("Digite o valor do lado C: ");
		 c = ler.nextDouble();

		 
		 if (a + b > c && a + c > b && b + c > a) {
			 System.out.println("É um triângulo do tipo: " );
		 }
		 else {
			 System.out.println("Não é um triângulo");
		 }
		 
		 if(a == b && b == c) {
			 System.out.println("Equilátero");
		 }
		 else if(a == b || a == c || b == c) {
			System.out.println("Isósceles");
		 }
		 else {
			 System.out.println("Escaleno");
		 }
		 
		 ler.close();
	       
	}
}
