package br.com.vitoria.exercicios;

import java.util.Scanner;

/*
* Exercicio 01 - Conversao de Dólar para Real
* 
* Enunciado: Ler a cotação do Dólar e a quantidade de dólares. 
* Converter para Real e mostrar o resultado.
*/

public class Ex01ConversaoDolar {
       public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            // -- Entrada de dados --
            System.out.println("=== Conversao de Dolar para Real ===");
            System.out.println();
            System.out.print("Qual o valor do Dolar hoje? ");
            double cotacaoDolar = sc.nextDouble();
            System.out.print("Quantos dolares voce tem? ");
            double qtdDolares = sc.nextDouble();
            
            // -- Processamento --
            double conversaoparaReal = cotacaoDolar * qtdDolares;
            
            // -- Saída de dados --
            System.out.println();
            System.out.println("=== Resultado ===");
            System.out.printf("Apos a conversao de Dolar para Real, concluimos que voce possui: R$ %.2f reais.      ", conversaoparaReal);
            
            sc.close();
       }
    
}
