package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double doacao, investimento;
        System.out.println("digite o valor da doacao");
        doacao = scanner.nextDouble();

        if(doacao<=1000){
            investimento = doacao* 0.05;
        }else{
            investimento = doacao * 0.15;
        }

        System.out.println("O investimento sera de R$" + investimento);

        scanner.close();

    }
}
