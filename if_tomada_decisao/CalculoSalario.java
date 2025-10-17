package amogus;
import java.util.Scanner;
public class CalculoSalario {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salBruto, valTransp, inss, salLiqui, desconto;
		
		System.out.println("Digite seu salário bruto:");
		salBruto = ler.nextDouble();
		inss = salBruto*0.08;
		valTransp = salBruto*0.06;
		desconto = inss + valTransp;
		salLiqui = salBruto - desconto;
		System.out.println("O seu salário liquido é: " + salLiqui);
		ler.close();
	}

}
