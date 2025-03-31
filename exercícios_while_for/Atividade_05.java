package exerciciosWhileFor_03;

import java.util.Scanner;

public class Atividade_05 {

	public static void main(String[] args) {
		
		//Descreva um algoritmo que leia a altura de 5 pessoas e calcule 
		//a média de alturas delas.
		
		Scanner input = new Scanner(System.in);
		
		double altura = 0;
		double somaAltura = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Insira uma altura (em metros)");
			altura = input.nextDouble();
			
			somaAltura += altura;
			
		} 
		
		double media = somaAltura/5;
		System.out.println("A média das alturas é: " + media);
		
	}

}
