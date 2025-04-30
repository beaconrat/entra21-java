package exerciciosMetodos_06;

import java.util.Scanner;

public class Atividade_11 {
	
	public static String compararNumeros(int numero1, int numero2) {
		
		if(numero1 > numero2) {
			return "O maior número é: " + numero1; 
		} else if (numero2 > numero1) {
			return "O maior número é: " + numero2;
		} else {
			return "Os números são iguais";
		}		
		
	}

	public static void main(String[] args) {
		
		//Faça um programa que receba 2 números do usuário.
		//Faça um método que descubra qual dos números é maior e retorne esse valor.
		//Se os dois número forem iguais, retorne: número iguais.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o 1º número");
		int numero1 = input.nextInt();
		
		System.out.println("Insira o 2º número");
		int numero2 = input.nextInt();
		
		System.out.println(compararNumeros(numero1, numero2));	
		
	}

}
