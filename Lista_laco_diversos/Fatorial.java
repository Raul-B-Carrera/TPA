package atividades;
import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, numero, fatorial;
		
		System.out.print("Digite o número que vai ser fatorado: ");
        numero = ler.nextInt();
        fatorial = 1;
        i = 1;
        do {
        	fatorial = fatorial * i;
            i=i+1;
        } while (i <= numero);

        System.out.println("O fatorial deste numero é: " + fatorial);
        
        ler.close();
	}
}
