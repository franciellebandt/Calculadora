package br.edu.ifcvideira.Calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1=0;
		int numero2=0;
		int soma=0;
		
		System.out.print("Digite o primeiro n�mero: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		numero2 = entrada.nextInt();
		
		soma = numero1+numero2;
		
		
		System.out.printf("A soma � %d",soma);
		
	}

}
