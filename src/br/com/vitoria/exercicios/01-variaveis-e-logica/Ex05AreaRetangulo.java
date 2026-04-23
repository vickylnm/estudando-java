package br.com.vitoria.exercicios;

import java.util.Scanner;

/*
* Exercício 05 - Cáculo da Área de um Retângulo
*
* Enunciado: Ler as dimensões de um retângulo(base e altura),
* calcular e imprimir a área do retângulo.
*/

public class Ex05AreaRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // -- Entrada de Dados --
        
        System.out.println("=== Vamos calcular a area de um retangulo! ===");
        System.out.println();
        System.out.print("Qual a base do retangulo? ");
        double baseRetangulo = sc.nextDouble();
        System.out.print("Qual a altura do retangulo? ");
        double alturaRetangulo = sc.nextDouble();
        
        // -- Processamento --
        
        double areaRetangulo = baseRetangulo * alturaRetangulo / 2;
        
        // -- Saída de Dados -- 
        
        System.out.println();
        System.out.println("=== Resultado ===");
        System.out.printf("A area de um retangulo com as medidas enviadas resulta em: %.2f  ", areaRetangulo);
        
        sc.close();
    }
    
}
