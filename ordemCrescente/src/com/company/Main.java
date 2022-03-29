package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //abc  acb bac bca cab cba
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite o primeiro valor:");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor:");
        b = scan.nextInt();
        System.out.println("Digite o terceiro valor:");
        c = scan.nextInt();

        if (a < b && c > b){
            System.out.println("Sequencia crescente é:" +a+ "-" +b+ "-" +c);
        }else if(a < c && b > c ){
            System.out.println("Sequencia crescente é:" +a+ "-" +c+ "-" +b);
        }else if(b < a && c > a){
            System.out.println("Sequencia crescente é:" +b+ "-" +a+ "-" +c);
        }else if(b < c && c < a){
            System.out.println("Sequencia crescente é:" +b+ "-" +c+ "-" +a);
        }else if(c < a && a < b){
            System.out.println("Sequencia crescente é:" +c+ "-" +a+ "-" +b);
        }else if(c < b && b < a){
            System.out.println("Sequencia crescente é:" +c+ "-" +b+ "-" +a);
        }else{
            System.out.println("existe algum valor igual na sequência ! ");
        }
        scan.close();
    }
}
