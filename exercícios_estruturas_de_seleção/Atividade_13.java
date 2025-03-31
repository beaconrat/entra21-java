package exerciciosEstruturasDeSelecao_02;

import java.util.Scanner;

public class Atividade_13 {

	public static void main(String[] args) {
		
				//Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres 
				//(considere que a idade entre homens e mulheres sempre serão diferentes)
				//Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, 
				//e o produto das idades do homem mais novo com a mulher mais velha 
				
				Scanner input = new Scanner(System.in);
				
				int soma;
				int mulherNova;
				int mulherVelha;
				int homemNovo;
				int homemVelho;
				
				System.out.println("Insira a idade da 1ª mulher: ");
				int idadeMulher1 = input.nextInt();
				System.out.println("Insira a idade da 2ª mulher: ");
				int idadeMulher2 = input.nextInt();
				
				System.out.println("Insira a idade do 1º homem: ");
				int idadeHomem1 = input.nextInt();
				System.out.println("Insira a idade do 2º homem: ");
				int idadeHomem2 = input.nextInt();
				
				if(idadeMulher1 < idadeMulher2) {
					mulherNova = idadeMulher1;
					mulherVelha = idadeMulher2;
				} else {
					mulherNova = idadeMulher2;
					mulherVelha = idadeMulher1;
				}
				
				if(idadeHomem1 < idadeHomem2) {
					homemNovo = idadeHomem1;
					homemVelho = idadeHomem2;
				} else {
					homemNovo = idadeHomem2;
					homemVelho = idadeHomem1;
					
				}
				
				soma = homemVelho + mulherNova;
				System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + soma);
				soma = homemNovo * mulherVelha;
				System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + soma);
				
	}

}
