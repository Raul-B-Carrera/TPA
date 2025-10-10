package exercicios;
import java.util.Scanner;
public class AnoBisessto {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, anoInicio, anoFim, bisexto;
		
		System.out.println("Digite o ano de inicio: ");
		anoInicio = ler.nextInt();
		System.out.println("Digite o ano final:");
		anoFim = ler.nextInt();
		
		i = anoInicio;
		bisexto = 0;
		while(i <= anoFim) {
			if(i % 4 == 0) {
				bisexto = bisexto + 1;
				System.out.println("Esse ano é bisexto: " + i);
			}
			i++;
		}
		System.out.println("Tem " +bisexto+ " entre " +anoInicio+ " e " +anoFim);
		
		ler.close();
	}
}
