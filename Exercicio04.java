package br.com.generation.ExerciciosLacoRepeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int temperamento, sexo, idade;
		int	mulheresNervosas = 0, npessoas = 0, pessoasCalmas = 0,homensAgressivos = 0,
			outrosCalmos = 0, nervosoMais40 = 0, calmoMenos18 = 0;
		
		
		while(npessoas <= 150){
		System.out.println("Digite sua idade: ");
		idade = read.nextInt();
		
		System.out.println("Sexo: digite '1' para Masculino, digite '2' para Feminino, digite '3' para Outros");
		sexo = read.nextInt();
		
		System.out.println("Digite '1' se voc� era calmo(a); '2' se era nervoso(a); '3' se era agressivo(a)");
		temperamento = read.nextInt();
		
		
		if(idade <= 18 && temperamento == 1) {
			calmoMenos18++;
		 }
		
		if(idade >= 40 && temperamento == 2) {
			nervosoMais40++;
		 }
		
		if(sexo == 2 && temperamento == 2) {
			mulheresNervosas++;
		 }
		
		if(sexo == 1 && temperamento == 3) {
			homensAgressivos++;
		 }
		
		if(sexo == 3 && temperamento == 1) {
			outrosCalmos++;
		 }
		
		
		switch(temperamento) {
		 case 1: pessoasCalmas++;
		break;
		 }
		
		npessoas++;
	}
		
		System.out.println("O n�mero de pessoas calmas �: " + pessoasCalmas);
		System.out.println("O n�mero de mulheres nervosas �: " + mulheresNervosas);
		System.out.println("O n�mero de homens agressivos �: " + homensAgressivos);
		System.out.println("O n�mero de outros calmos �: " + outrosCalmos);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: " + nervosoMais40);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos �: " + calmoMenos18);
		System.out.println("Pesquisa conclu�da! Obrigado :)");
		
		read.close();
	}
}
