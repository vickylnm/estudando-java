package br.com.vitoria.exercicios;

import java.util.Scanner;

/*
* Exercício 07 - Cáculo Aproximado de Idade em Dias
*
* Enunciado: Ler aniversário, idade, dia e mes atual e exibir 
* a idade total em dias. (Considere que um ano tem 365 dias 
* e um mes tem 30 dias).
*/

public class Ex07CalculoExatoIdadeEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        // Entrada de Dados
        System.out.println("=== Calculo exato da sua idade em dias ===");
        System.out.println();
        System.out.print("Qual o dia de hoje? ");
        int diaAtual = sc.nextInt();

        System.out.print("Qual o mes atual? ");
        int mesAtual = sc.nextInt();

        System.out.print("Qual sua idade em anos? ");
        int idade = sc.nextInt();

        System.out.print("Qual o mes que voce nasceu? ");
        int mesNascimento = sc.nextInt();

        System.out.print("Qual o dia que voce nasceu? ");
        int diaNascimento = sc.nextInt();

        // Processamento
        int diasDeHoje = (mesAtual - 1) * 30 + diaAtual;
        int diasDoNascimento = (mesNascimento - 1) * 30 + diaNascimento;
        int diaspassadosAnos = idade * 365;
        int idadeemDias = diaspassadosAnos + (diasDeHoje - diasDoNascimento);
        
        // -- Saída de Dados --
        
        System.out.println();
        System.out.println("=== Resultado ===");
        System.out.printf("Voce tem, exatamente, %d dias de idade.  ", idadeemDias);
        
        sc.close();
         
    }
    
}
