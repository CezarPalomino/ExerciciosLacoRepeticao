package br.com.generation.ExerciciosLacoRepeticao;

public class Exercicio01 {
public static void main(String[] args) {
	
	int numero, divisao;
	
	for(numero = 1000; numero <= 1999; numero++) {
		
		divisao = numero % 11;
		
		if(divisao == 5) {
			System.out.println("Os números cujo resto da divisão por 11 é 5 são: " + numero);
		}
	}
 }
}
