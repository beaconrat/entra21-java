package exerciciosVetores_04;

import java.util.Scanner;

public class Atividade_09 {

	public static void main(String[] args) {
		
		//Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10
		//elementos.
		//Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições 
		//respectivas dos vetores originais
		//Por exemplo: vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]
		//Exiba, ao final, os três vetores na tela.
		
		Scanner input = new Scanner(System.in); 
			
			int valores1 = 0;
			int valores2 = 0;
			
			int n1 [] = new int [10];
			int n2 [] = new int [10];
			int n3 [] = new int [10];
			
			for(int i = 0; i < n1.length; i++) {
				System.out.println("Insira os valores do 1º vetor");
				valores1 = input.nextInt();
				n1[i] = valores1;
				
			}
			
			for(int i = 0; i < n2.length; i++) {
				System.out.println("Insira os valores do 2º vetor");
				valores2 = input.nextInt();
				n2[i] = valores2;
				
			}
			
			for(int i = 0; i < n3.length; i++) {
				n3[i] = n1[i] + n2[i];
					
				System.out.println("Vetor 01 = [" + n1[i] + "]" +
                        " Vetor 02 = [" + n2[i] + "]" +
                        " Vetor 03 = [" + n3[i] + "]");
				
			}	
			
		}

}
