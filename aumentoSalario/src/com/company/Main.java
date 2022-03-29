package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //• Funcionários das categorias A, C, F, e H ganharão 10% de aumento sobre o
        //salário;
        //• Funcionários das categorias B, D, e T ganharão 15% de aumento sobre o salário;
        //• Funcionários das categorias K e R ganharão 25% de aumento sobre o salário;

        Scanner scanner = new Scanner(System.in);
        double salarioAtual, salarioAtualizado;
        String a,c,f,h,b,d,t,k,r, categoria;

        System.out.println("Digite o salario atual:");
        salarioAtual = scanner.nextDouble();
        System.out.println("Qual a categoria do funcionario ?");
        categoria = scanner.next();

        if(categoria.equalsIgnoreCase("a") || categoria.equalsIgnoreCase("c") || categoria.equalsIgnoreCase("f") || categoria.equalsIgnoreCase("h")){
            salarioAtualizado = salarioAtual * 1.1;
            System.out.println("O salario atualizado é:" + salarioAtualizado);
        }else if(categoria.equalsIgnoreCase("b") || categoria.equalsIgnoreCase("d") || categoria.equalsIgnoreCase("t")){
            salarioAtualizado = salarioAtual * 1.15;
            System.out.println("O salario atualizado é:" + salarioAtualizado);
        }else if(categoria.equalsIgnoreCase("k") || categoria.equalsIgnoreCase("r")){
            salarioAtualizado = salarioAtual * 1.25;
            System.out.println("O salario atualizado é:" + salarioAtualizado);
        }else{
            System.out.println("Digite uma categoria válida");
        }

    }
}
