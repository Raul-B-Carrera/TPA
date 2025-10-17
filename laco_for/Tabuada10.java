package lacoFor;

public class Tabuada10 {
	public static void main(String[] args) {
		int i, n, resultado;
	
		for(i=1; i<=10; i++) {
			for(n=1; n<=10; n++) {
				resultado = n*i;
				System.out.println(i + " x " + n + " = " + resultado);
				System.out.println(" ");
			}
		}
	}
}
