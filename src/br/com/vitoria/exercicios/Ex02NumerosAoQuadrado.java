package br.com.vitoria.exercicios;
    
import java.util.Scanner;

/*
* Exercicio 02 - Numerós ao quadrado e soma total.
* 
* Enunciado: De maneira manual, ler 4 números inteiros, calcular
* o quadrado para cada um, somar todos os quadrados
* e mostrar o resultado.
*/

public class Ex02NumerosAoQuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // -- Entrada de Dados --
        
        System.out.println("=== Calculando 4 numeros inteiros ao quadrado e sua soma ===");
        System.out.println();
        System.out.print("Digite o primeiro numero: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int numero2 = sc.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int numero3 = sc.nextInt();
        System.out.print("Digite o quarto numero: ");
        int numero4 = sc.nextInt();
        
        // -- Processamento --
        
        int somaTotal = (numero1*numero1) + (numero2*numero2) + (numero3*numero3) + (numero4*numero4);
        
        // -- Saída de Dados -- 
        System.out.println();
        System.out.println("=== Resultado ===");
        System.out.print("Apos calcular o quadrado de todos os numeros, totaliza-se a soma: " + somaTotal + (" "));
        
    }
    
}
