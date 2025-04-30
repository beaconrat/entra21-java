package exerciciosMetodos_06;

import java.util.Scanner;

public class Atividade_09 {
	
	public static double somaNumeros(double numero1, double numero2, double numero3, double numero4) {
		
		return numero1 + numero2 + numero3 + numero4;
	}

	public static void main(String[] args) {
		 
		//Faça um método que receba 4 números como parâmetros, some os 4 números.
		//Retorne a soma.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o 1º número");
		double numero1 = input.nextDouble();
		System.out.println("Digite o 2º número");
		double numero2 = input.nextDouble();
		System.out.println("Digite o 3º número");
		double numero3 = input.nextDouble();
		System.out.println("Digite o 4º número");
		double numero4 = input.nextDouble();
		
		double soma = somaNumeros(numero1, numero2, numero3, numero4);
		System.out.println(soma);

	}

}
