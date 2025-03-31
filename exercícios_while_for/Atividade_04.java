package exerciciosWhileFor_03;

import java.util.Scanner;

public class Atividade_04 {

	public static void main(String[] args) {

		//Escreva um algoritmo em que o usuário entre 5 valores de 0 a 1000
		//Começando com o laço (while ou for) em 0
		//Escreva os números que o usuário entrou 
		
		Scanner input = new Scanner(System.in);
		
		int n = 0;
		
		for(int i = 0; i < 5; i ++) {
			System.out.println("Insira um número");
			 n = input.nextInt();
	
			if(n < 0 || n > 1000) {
				System.out.println("O número tem que ser inteiro e de 0 a 1000");
				break;
				
			} else {
				System.out.println(n);
				
			}
			
		} 

	}

}
