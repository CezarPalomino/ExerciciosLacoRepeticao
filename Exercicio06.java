package br.com.generation.ExerciciosLacoRepeticao;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int media = 0, multiplos3 = 0, resto = 0, divisao, numeroTotal = 0, numero;
		
		do{
			System.out.println("Digite um n�mero: ");
			numero = read.nextInt();
			
			divisao = numero * 3;
			resto = divisao % 3;
			
			numeroTotal++;
			
			if(resto == 0 && numero != 0) {
				multiplos3 = numero;
				media = (multiplos3 + multiplos3) / numeroTotal;
			}
		}
		while(numero != 0);
		
		System.out.println("A m�dia dos n�meros que s�o multiplos de 3 �: " + media);
		System.out.println("Fim do programa! :)");
		
		read.close();
  }
}
