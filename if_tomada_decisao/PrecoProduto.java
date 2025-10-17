package amogus;
import java.util.Scanner;
public class PrecoProduto {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double precoProduto, precoVenda, lucro;
		int quantiVenda;
		
		System.out.println("Digite o preço do produto: ");
		precoProduto = ler.nextDouble();
		System.out.println("Digite quantidade da venda do produto");
		quantiVenda = ler.nextInt();
		System.out.println("Digite o preço da venda");
		precoVenda = ler.nextDouble();
		lucro = (precoVenda - precoProduto)*quantiVenda;
		System.out.println("O lucro é: " + lucro);
		ler.close();
	}

}
