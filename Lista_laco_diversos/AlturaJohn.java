package atividades;

public class AlturaJohn {
	public static void main(String[] args) {
		double altura1, altura2;
		int	i;
		
		i = 1;
		altura1 = 1.34;
		altura2 = 1.45;
		while(altura1 < altura2) {
			altura1 = altura1 + 0.025;
			altura2 = altura2 + 0.02;
			i = i + 1;
		}
		System.out.println("Vai demorar "+i+" anos para ele passar pedro.");
	}
}
