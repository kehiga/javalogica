package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade do eleitor: ");
        idade = scanner.nextInt();

        if (idade < 16){
            System.out.println("Voce nao pode votar nem embarcar");
        }else if(idade<18){
            System.out.println("voto facultativo, embarque permitido");
        }else{
            System.out.println("Voto obrigatorio");
        }
        scanner.close();
    }
}
