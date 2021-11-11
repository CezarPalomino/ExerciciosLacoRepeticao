package br.com.generation.ExerciciosLacoRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int i, divisao, num, somaPar = 0, somaImpar = 0;
		
		for(i = 1; i <= 10; i++) {
			System.out.println("Digite um número: ");
			num = read.nextInt();
			
			divisao = num % 2;
			
			if(divisao == 0) {
				somaPar++;
			}
			else {
				somaImpar++;
			}
		}
		
		System.out.println("O total de números ímpares é :" + somaImpar);
		System.out.println("O total de números pares é: " + somaPar);
		
		read.close();
	}
}
