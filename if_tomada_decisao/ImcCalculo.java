package amogus;
import java.util.Scanner;
public class ImcCalculo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double altura, peso, imc;
		
		System.out.println("Digite sua altura em metros: ");
		altura = ler.nextDouble();
		System.out.println("Digite seu peso em KG: ");
		peso = ler.nextDouble();
		imc = peso/(altura*altura);
		System.out.println("Seu IMC é: " + imc);
		
		ler.close();
	}
	
	

}
