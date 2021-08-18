package br.com.mouratocarlos;

import java.util.Scanner;

public class ConsumoMedioDeAutomovel {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double quilometrosRodados = scan.nextDouble();
        double litrosConsumidos = scan.nextDouble();

        double media = quilometrosRodados / litrosConsumidos;
        System.out.println(String.format("%.3f km/l", media));
    }
}
