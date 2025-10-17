package atividades;
import java.util.Scanner;
public class ValorRaiz {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b ,c, x1, x2, delta;
		
		System.out.println("Digite o valor de A:");
		a = ler.nextDouble();
		System.err.println("Digite o valor de B:");
		b = ler.nextDouble();
		System.out.println("Digite o valor de C:");
		c = ler.nextDouble();
		delta = (b*b) - (4*a) *c;
	    if(delta < 0) {
	    	System.out.println("Não existem raízes");
	    }
	    else if(delta == 0) {
	    	x1 = (-b) / (2*a);
	    	
	    	System.out.println(" A raiz é: " + x1);
	    }
	    else {
	    	x1 = (-b) + Math.sqrt(delta) /(a*2);
	    	x2 = (-b) - Math.sqrt(delta) /(a*2);
	    	
	    	System.out.println("A primeira raiz é: " + x1);
		    System.out.println("A segunda raiz é: " + x2);
	    }
	    ler.close();	    
	}

}
