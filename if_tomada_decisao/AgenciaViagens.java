package amogus;
import java.util.Scanner;
public class AgenciaViagens {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valorDia, taxaAdicional, valorTotal;
        int quantiDias;
        String destino;

        System.out.println("Digite o destino: IlhaBela ou Fernando de Noronha:");
        destino = ler.next();

        System.out.println("Digite a quantidade de dias:");
        quantiDias = ler.nextInt();

        if (destino.equalsIgnoreCase("Ilhabela")) {
            if (quantiDias >= 1 && quantiDias <= 5) {
                valorDia = 240.00;
                valorTotal = valorDia * quantiDias;
            } else if (quantiDias >= 6 && quantiDias <= 10) {
                taxaAdicional = 130.00;
                valorDia = 220.00;
                valorTotal = taxaAdicional + (valorDia * quantiDias);
            } else {
                taxaAdicional = 150.00;
                valorDia = 210.00;
                valorTotal = taxaAdicional + (valorDia * quantiDias);
            }
            System.out.println("O custo total da viagem para Ilhabela foi: " + valorTotal);
        } else if (destino.equalsIgnoreCase("Fernando de Noronha")) {
            if (quantiDias >= 1 && quantiDias <= 5) {
                taxaAdicional = 100.00;
                valorDia = 400.00;
                valorTotal = taxaAdicional + (valorDia * quantiDias);
            } else if (quantiDias >= 6 && quantiDias <= 10) {
                taxaAdicional = 150.00;
                valorDia = 410.00;
                valorTotal = taxaAdicional + (valorDia * quantiDias);
            } else {
                taxaAdicional = 200.00;
                valorDia = 420.00;
                valorTotal = taxaAdicional + (valorDia * quantiDias);
            }
            System.out.println("O custo total da viagem para Fernando de Noronha foi: " + valorTotal);
        } else {
            System.out.println("Destino inválido");
        }

        ler.close();
    }
}



