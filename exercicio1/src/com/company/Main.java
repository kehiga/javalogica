package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("======== ONG =========");
        Scanner scan = new Scanner(System.in);
        double valorDoacao, conversor;
        System.out.println("Digite o valor da doação:");
        valorDoacao = scan.nextDouble();
        conversor = valorDoacao * 4.94;
        System.out.println("O valor da doação em reais é: \n" + conversor);
        scan.close();

    }
}
