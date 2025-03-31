package exerciciosWhileFor_03;

import java.util.Scanner;

public class Atividade_11 {

	public static void main(String[] args) {
		//Escreva um programa para calcular o fatorial de um número
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um número");
		int numero = input.nextInt();
		
		int fatorial = 1;
		
		for(int i = 1; i <= numero; i++) {
			
			fatorial *= i;
			
		}
		
		System.out.println("O fatorial do número " + numero + " " + "é" + " " + fatorial);
		
	}

}
