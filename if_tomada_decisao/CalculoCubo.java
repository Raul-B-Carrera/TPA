package amogus;
import java.util.Scanner;
public class CalculoCubo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double v, l;
		
		System.out.println("Digite a medida das arestas:");
		l = ler.nextDouble();
		v = l*l*l;
		System.out.println("O volume do cubo é: " + v);
		ler.close();
	}

}
