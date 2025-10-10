package atividades;
import java.util.Scanner;
public class FibonacciCalculo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, i, termo1, termo2, proximoTermo;
		
		System.out.print("Digite o número de termos da série de Fibonacci: ");
        n = ler.nextInt();

        termo1 = 1;
        termo2 = 1;
        i = 1;
        System.out.print("Série de Fibonacci: ");

        do {
            if(i == 1 || i == 2) {
                System.out.print(termo1 + " ");
            } else {
                proximoTermo = termo1 + termo2;
                System.out.print(proximoTermo + " ");
                termo1 = termo2;
                termo2 = proximoTermo;
            }
            i=i+1;
        } while (i <= n);
        
        ler.close();
	}
}
