package br.com.dio.exercicios.loops;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Ex6_Fatorial{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;

        System.out.print("Número para fatorar: ");
        fatorial = scan.nextInt();

        int multiplicacao = 1;

        for(int i = fatorial; i >=1 ; i--){
            multiplicacao *= i;

        }
        System.out.println("Fatorial de "+ fatorial + "! = "+ multiplicacao);
        

        scan.close();
    }
}