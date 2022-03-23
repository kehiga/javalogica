package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int valor1, valor2, res;

        System.out.println("digite o valor 1:");
        valor1 = leitor.nextInt();

        System.out.println("digite o valor 2:");
        valor2 = leitor.nextInt();

        res = valor1 + valor2;

        System.out.println("O resultado é: \n" + res);

        leitor.close();

    }
}
