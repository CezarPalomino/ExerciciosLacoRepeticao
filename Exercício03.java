package br.com.generation.ExerciciosLacoRepeticao;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int idade = 0, pessoasMenos21 = 0, pessoasMais50 = 0;
		
		while(idade != -99) {
			System.out.println("Digite sua idade: ");
			idade = read.nextInt();
			
			if(idade < 21) {
				pessoasMenos21++;
			}
			if(idade > 50) {
				pessoasMais50++;
			}
		}
		System.out.println("Pessoas menores de 21 anos: " + pessoasMenos21);
		System.out.println("Pessoas maiores de 50 anos: " + pessoasMais50);
		System.out.println("Lista encerrada!");
		
		read.close();
	}
}
