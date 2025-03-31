package exerciciosWhileFor_03;

import java.util.Scanner;

public class Atividade_06 {

	public static void main(String[] args) {
		
		//Descreva um algoritmo que vá lendo a altura de pessoas até
		//o usuário entrar com o número 0.
		//Calcula a média de altura delas
		
		Scanner input = new Scanner(System.in);
		
		double altura = 0;
		double somaAltura = 0;
		double media = 0;
		
		for(int i = 0; i >= 0; i++) {
			System.out.println("Insira uma altura");
			altura = input.nextDouble();
			
			somaAltura += altura;
			
			media = somaAltura/i;
			
			if(altura == 0) {
				System.out.println("Fim");
				break;
			}
			
					
		}
		
		
		System.out.println("A média das alturas é: " + media);
		
	}

}
