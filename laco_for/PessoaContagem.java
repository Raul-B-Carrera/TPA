package lacoFor;
import java.util.Scanner;
public class PessoaContagem {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, idade, idoso, jovem, maisVelho, maisNovo;
		double altura, peso, magro, porcentagem,  media, soma;

		idoso = 0;
		jovem = 0;
		soma = 0;
		magro = 0;
		maisVelho = 0;
        maisNovo = 0;
		for(i=1; i<=25; i++) {
			System.out.println("Digite a idade da " +i+ "° pessoa:");
			idade = ler.nextInt();
			System.out.println("Digite o peso da " +i+ "° pessoa:");
			peso = ler.nextDouble();
			System.out.println("Digite a altura da " +i+ "° pessoa:");
			altura = ler.nextDouble();
			
		if(idade > 50) {
			idoso++;
		}
		else if(idade >= 10 && idade <= 20) {
			jovem++;
			soma = soma + altura;
		}
		if(peso < 40) {
			magro++;
		}
		if(i == 1) {
            maisVelho = idade;
            maisNovo = idade; 
        }
		else if(idade > maisVelho) {
             maisVelho = idade;
        }

		else if(idade < maisNovo) {
             maisNovo = idade;
        }
		}
		System.out.println("Tem " +idoso+ " pessoas com mais de 50 anos");
		if(jovem > 0) {
			media = soma / jovem;
			System.out.println("A média entre as pessoas de 10 a 20 anos é: " + media);
		}
		if(magro > 0) {
			porcentagem = (magro / 25) *100;
			System.out.println("A porcentagem de pessoas com o peso a baixo de 40 quilos é: "+porcentagem+"%" );
		}
		System.out.println("A idade da pessoa mais velha é: " + maisVelho);
        System.out.println("A idade da pessoa mais nova é: " + maisNovo);
        
        ler.close();
        
       
	}

}
