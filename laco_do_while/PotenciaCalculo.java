package atividades;
import java.util.Scanner;
public class PotenciaCalculo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int expoente, i;
		double resultado, base;
		
		System.out.print("Digite a base: ");
        base = ler.nextDouble();
        
        System.out.print("Digite o expoente: ");
        expoente = ler.nextInt();
        
        resultado = 1;
        i = 1;
        
        if(expoente == 0) {
            resultado = 1;
        } else if(expoente < 0) {
            expoente = -expoente;
            do{
                resultado = resultado * 1 / base;
                i=i+1;
            } while(i <= expoente);
        }else {
            do{
                resultado = resultado * base;
                i=i+1;
            } while(i <= expoente);
        }
        System.out.println("A potência de " + base + " elevado a " + expoente + " é: " + resultado);
        
        ler.close();
	}

}
