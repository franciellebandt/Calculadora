package br.edu.ifcvideira.Calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1=0;
		int numero2=0;
		int soma=0;
		int subtracao=0;
		int divisao=0;
		
		System.out.print("Digite o primeiro n�mero: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		numero2 = entrada.nextInt();
		
		soma = numero1+numero2;
		
		
		System.out.printf("A soma � %d",soma);
		
		
		
		System.out.print(" Digite o primeiro n�mero para subtra��o: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo n�mero para subtra��o: ");
		numero2 = entrada.nextInt();
		
		subtracao = numero1-numero2;
		
		
		System.out.printf("O resultado da subtra��o � %d",subtracao);
		
		
		System.out.print(" Digite o primeiro n�mero para divis�o: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo n�mero para divis�o: ");
		numero2 = entrada.nextInt();
		
		divisao = numero1/numero2;
		
		
		System.out.printf("O resultado da divis�o � %d",divisao);
	}

}
