package exerciciosWhileFor_03;

import java.util.Scanner;

public class Atividade_01 {
	
	public static void main(String[] args) {
		
		//Descreva um algoritmo que leia 5 números inteiros e escreva, para cada número lido
		//se ele é par ou ímpar
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Insira um número");
			int numero = input.nextInt();
			if(numero % 2 == 0 ) {
				System.out.println("Número " + numero + " é par");
			} else {
				System.out.println("Número " + numero + " é ímpar");
			}
		
		}
		
		
		
		
		
	}
	
	
	
}
