package exerciciosVetores_04;

import java.util.Scanner;

public class Atividade_08 {

	public static void main(String[] args) {
		
		//Descreva um algoritmo que leia 5 valores e os coloque em um vetor de 5 posições
		//Imprime quais valores desse informados são maiores que a média dos valores
		
		Scanner input = new Scanner(System.in); {
				
			double media = 0;
			double soma = 0;
			int numero = 0;
			
			int n [] = new int [5];
			
			for(int i = 0; i < n.length; i++) {
				System.out.println("Insira um número");
				numero = input.nextInt();
				
				n[i] = numero;
				
				soma += n[i];
				
			}
				
			media = soma / 5;
			
			System.out.println("A média dos número inseridos: " + media);
			
			for( int i = 0; i < n.length; i++) {
				if(n[i] > media) {
					System.out.println("Número maior que a média: " + n[i]);
					
			}
		
			}
			
		}
		

	}

}
