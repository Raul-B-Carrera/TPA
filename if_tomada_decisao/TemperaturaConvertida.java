package atividades;

import java.util.Scanner;

public class TemperaturaConvertida {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.println("Digite a temperatura em Fahrenheits:");
        fahrenheit = ler.nextDouble();
        celsius = (fahrenheit - 32) / 1.8;

        System.out.println("A temperatura em Celsius é: " + celsius);

        if (celsius < 0) {
            System.out.println("Frio extremo");
        } else if (celsius < 11) {
            System.out.println("Frio");
        } else if (celsius < 21) {
            System.out.println("Frio moderado");
        } else if (celsius <= 24) {
            System.out.println("Clima ameno");
        } else {
            System.out.println("Calor");
        }

        ler.close();
    }
}
