package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double kmInicio , kmPosto, litros;
        System.out.println("Digite quantos km o carro tem no inicio: ");
        kmInicio = s.nextDouble();
        System.out.println("Digite quantos km o carro tem no fim: ");
        kmPosto = s.nextDouble();
        System.out.println("Digite quantos litros foram reabastecidos: ");
        litros = s.nextDouble();
        double res = (kmInicio - kmPosto)/litros;
        System.out.println("A média de km/l que o veiculo faz é de: " + res + "km/l");
        s.close();
    }
}
