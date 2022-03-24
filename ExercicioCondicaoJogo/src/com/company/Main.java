package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== JOGO ONG ==========");

        System.out.println("Digite a idade do jogador: ");
        int idade = scanner.nextInt();

        if(idade >= 18){
            System.out.println("você pode jogar");
        }else{
            System.out.println("você nao pode jogar");
        }

        scanner.close();

    }
}
