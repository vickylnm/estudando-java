package br.com.vitoria.exercicios;

import java.util.Scanner;

/*
* Exercício 4 - Antecessor de um número inteiro
*
* Enunciado: Ler um valor inteiro e exibir seu antecessor.
*/

public class Ex04AntecessorDoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // -- Entrada de Dados --
        
        System.out.println("=== Calcule o antecessor de um numero inteiro ===");
        System.out.println();
        System.out.print("Qual o numero inteiro que voce gostaria de saber o antecessor?");
        int valorInteiro = sc.nextInt();

        // -- Processamento --
        int antecessor = valorInteiro - 1;
        
        // -- Saída de Dados --

        System.out.println();
        System.out.println("=== Resultado ===");
        System.out.println("O antecessor de " + valorInteiro + ": " + antecessor);
        
        sc.close();
    }
    
}
