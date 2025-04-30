package exerciciosMetodos_06;

import java.util.Scanner;

public class Atividade_12 {
	
	public static String calcularQuadradoOuDobro(int numero) {
		
		if(numero % 2 == 0) {
			return "O numero é par, então, o número ao quadrado fica: " + Math.pow(numero, 2);
		} else {
			return "O número é ímpar, então dobro do número fica: " + numero * 2; 
		}
	}

	public static void main(String[] args) {
		
		//Faça um programa que calcule o quadrado de um número caso esse número seja par
		// e o dobro desse número caso esse número seja ímpar.
		//Retorne o resultado.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um número");
		int numero = input.nextInt();
		
		System.out.println(calcularQuadradoOuDobro(numero));	

	}

}
