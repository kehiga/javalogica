package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1, valor=0, somaPos=0, qtdNeg = 0;
        while(i <= 10){

            System.out.println("Digite o " + i + "ºvalor:");
            valor = scanner.nextInt();

            if(valor > 0){
                somaPos = somaPos + valor;
            }else{
                qtdNeg++;
            }
            i++;
        }

        System.out.println("A soma dos positivos é: " + somaPos);
        System.out.println("A quantidade de negativos é : " + qtdNeg);

    }
}
