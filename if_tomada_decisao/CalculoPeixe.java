package amogus;
import java.util.Scanner;
public class CalculoPeixe {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double peso, taxaAdicional, precoQuilo, precoTotal;
		
		System.out.println("Digite o peso do peixe em quilos: ");
		peso = ler.nextDouble();
		if (peso <=3.00) {
				precoQuilo = 12.00;
			System.out.println("O preço do quilo do peixe é: " + precoQuilo);
				precoTotal = precoQuilo * peso;
			System.out.println("O preço total a ser pago é: " + precoTotal);
		} else if(peso > 3.00 && peso < 5.00) {
			precoQuilo = 14.00;
		System.out.println("O preço do quilo do peixe é: " + precoQuilo);
			precoTotal = precoQuilo * peso;
		System.out.println("O preço total a ser pago é: " + precoTotal);
		} else if(peso > 5.00 && peso <= 10.00) {
				precoQuilo = 15.00;
			System.out.println("O preço do quilo do peixe é: " + precoQuilo);
				precoTotal = precoQuilo * peso;
			System.out.println("O preço total a ser pago é: " + precoTotal);
		} else if(peso > 5.00 && peso <= 10.00) {
				precoQuilo = 15.00;
			System.out.println("O preço do quilo do peixe é: " + precoQuilo);
				precoTotal = precoQuilo * peso;
			System.out.println("O preço total a ser pago é: " + precoTotal);
		} else {
			precoQuilo = 17.00;
			taxaAdicional = 8.00;
		System.out.println("O preço do quilo do peixe é: " + precoQuilo);
			precoTotal = (precoQuilo * peso) + 8;
		System.out.println("O preço total a ser pago é: " + precoTotal);
		
		ler.close();
		}
	}
}
