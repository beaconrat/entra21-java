package exerciciosMetodos_06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade_14 {
	
	public static String calcularMediaAritmetica (double vetor[]) {
		
		DecimalFormat df = new DecimalFormat("0.0");
		double soma = 0;
		for(int i = 0; i < vetor.length; i ++) {
			soma += vetor[i];
		}
		
		return "A média aritmética das notas é: " + df.format((soma) / vetor.length);
	}

	public static void main(String[] args) {
		
		//Faça um programa que receba 3 notas do usuário e informe a média aritmética dessas
		//notas.
		//Retorne a média.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a 1ª nota");
		double nota1 = input.nextDouble();
		System.out.println("Insira a 2ª nota");
		double nota2 = input.nextDouble();
		System.out.println("Insira a 3ª nota");
		double nota3 = input.nextDouble();
		
		double vetor[] = { nota1, nota2, nota3 };
		
		System.out.println(calcularMediaAritmetica(vetor));

	}

}
