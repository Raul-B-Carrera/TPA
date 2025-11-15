
package atividades;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 5;
        int[] a = new int[TAM];

        // leitura de A
        for(int i=0; i<TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor do vetor A:");
            a[i] = ler.nextInt();
        }

        // Calculo da tabuada
        for(int i=0; i<TAM; i++) {
            System.out.println("Tabuada do " + a[i] + ":");
            for(int n=1; n<=10; n++) {
                int resultado = a[i] * n;
                System.out.println(a[i] + " x " + n + " = " + resultado);
            }
            System.out.println();
        }
    }
}
