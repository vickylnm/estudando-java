package br.com.vitoria.exercicios;

import java.util.Scanner;

/*
* Exercício 06 - Cáculo Aproximado de Idade em Dias
*
* Enunciado: Ler a idade de uma pessoa expressa em anos
* e exibir em dias. (Considere que um ano tem 365 dias).
*/

public class Ex06CalculoAproximadoIdadeEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // -- Processamento de Dados
        
        System.out.println("=== Vamos calcular sua idade aproximada em dias ===");
        System.out.println();
        System.out.print("Qual sua idade em anos? ");
        int idadeemAnos = sc.nextInt();
        
        // -- Valores Fixos -- 
        
        int diasnumAno = 365;
        
        // -- Processamento --
        
        int idadeemDias = idadeemAnos * diasnumAno;
        
        // -- Saída de Dados --
        
        System.out.println();
        System.out.println("=== Resultado ===");
        System.out.printf("Voce tem, aproximadamente, %d dias de idade.  ", idadeemDias);
       
        sc.close();
    }
    
}
