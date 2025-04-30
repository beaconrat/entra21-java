package exerciciosMetodos_06;

import java.text.DecimalFormat;

public class Atividade_16 {
	
	public static double descobrirMaiorValor(double vetor[]) {
		double maiorValor = Double.MIN_VALUE;
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
		}
		
		return maiorValor;	
	}
	
	public static double descobrirMenorValor(double vetor[]) {
		double menorValor = Double.MAX_VALUE;
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < menorValor) {
				menorValor = vetor[i];
				
			}
		}
		
		return menorValor;
	}
	
	public static double calcularMedia(double vetor[]) {
		double soma = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		return soma / vetor.length;
	}

	public static void main(String[] args) {
		
		//Faça um programa que descubra:
		//a) O maior elemento de um vetor
		//b) O menor elemento
		//c) A média dos valores
		//Retorne esses valores
		
		DecimalFormat df = new DecimalFormat("0");
		
		double vetor[] = {5, 6, 8, 44, 21, 8, 3};
		
		System.out.println("O maior valor é: " + df.format(descobrirMaiorValor(vetor)));
		System.out.println("O menor valor é: " + df.format(descobrirMenorValor(vetor)));
		System.out.println("A média dos valores é: " + (calcularMedia(vetor)));



	}

}
