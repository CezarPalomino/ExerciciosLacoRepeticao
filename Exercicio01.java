package br.com.generation.ExerciciosLacoRepeticao;

public class Exercicio01 {
public static void main(String[] args) {
	
	int numero, divisao;
	
	for(numero = 1000; numero <= 1999; numero++) {
		
		divisao = numero % 11;
		
		if(divisao == 5) {
			System.out.println("Os n�meros cujo resto da divis�o por 11 � 5 s�o: " + numero);
		}
	}
 }
}
