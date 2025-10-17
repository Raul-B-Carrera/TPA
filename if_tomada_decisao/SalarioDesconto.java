package atividades;
import java.util.Scanner;
public class SalarioDesconto {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salarioMensal, desconto;
		
		System.out.println("Digite seu salário: ");
		salarioMensal = ler.nextDouble();
		if(salarioMensal <= 1434.59) {
			System.out.println("Não tem desconto");
		}
		else if(salarioMensal > 1434.59 && salarioMensal <= 2150.00) {
			desconto = salarioMensal*7.5/100 - 107.59;
			System.out.println("O desconto é: " + desconto);
		}
		else if(salarioMensal > 2150.00 && salarioMensal <= 2866.70) {
			desconto = salarioMensal*15.0/100 - 268.84;
			System.out.println("O desconto é: " + desconto);
		}
		else if(salarioMensal > 2866.70 && salarioMensal <= 3582.00) {
			desconto = salarioMensal*22.5/100 - 483.84;
			System.out.println("O desconto é: " + desconto);
		}
		else {
			desconto = salarioMensal*27.5/100 - 662.94;
			System.out.println("O desconto é: " + desconto);
		}
			ler.close();
	}
	
}
