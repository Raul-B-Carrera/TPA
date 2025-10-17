package amogus;
import java.util.Scanner;
public class CalculoVolume {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double v,pi,r,h;
		
		pi = 3.14;
		System.out.println("Digite a altura do cilindro:");
		h = ler.nextDouble();
		System.out.println("Digite o raio:");
		r = ler.nextDouble();
		v = pi*(r*r)*h;
		System.out.println("O volume é: " + v );
		ler.close();
	}
	

}
