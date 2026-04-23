package br.com.vitoria.exercicios;

import java.util.Scanner;

/*
* Exercício 03 - Cáculo de Comissão de Vendas.
*
* Enunciado: Calcular o pagamento de comissão de vendedores de peças,
* levando-se em consideração que sua comissão será de 5% do total da
* venda e que você tem os seguintes dados: preço unitário da peça e
* quantidade vendida.
*/

public class Ex03ComissaoDeVendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // -- Entrada de Dados -- 
        System.out.println("=== Vamos calcular uma comissao de vendas ===");
        System.out.println();
        System.out.print("Qual o valor unitario do produto? ");
        double precoUnidade = sc.nextDouble();
        System.out.print("Quantos produtos foram vendidos? ");
        double qtdVendida = sc.nextDouble();

        // -- Processamento -- 
        
        double valorTvenda = precoUnidade * qtdVendida;

        double comissao = valorTvenda * 0.05;
        
        // -- Saída de Dados

        System.out.println();
        System.out.println("=== Resultado ===");
        System.out.printf("O valor da comissao recebida pelo vendedor a partir dessa venda foi de: R$ %.2f reais.      ", comissao);
        
        sc.close();
        
    }
    
}
