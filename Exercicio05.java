package br.com.generation.ExerciciosLacoRepeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
		System.out.println("Digite um n�mero: ");
		numero = read.nextInt();
		soma = soma + numero;
		}
		while(numero != 0);
		
		System.out.println("A soma dos n�meros digitados �: " + soma);
		
		read.close();
	}
}
