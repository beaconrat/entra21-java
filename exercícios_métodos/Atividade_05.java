package exerciciosMetodos_06;

import java.util.Scanner;

public class Atividade_05 {
	
	public static void aoCubo(int num1, int num2) {
		
		if(num1 == 5 || num2 == 5 || (num1 + num2) == 5 || (num1 - num2) == 5) {	
			System.out.println("Você inseriu o número 5, então: ");
			System.out.println("O número 1 ao cubo: " + Math.pow(num1, 3));
			System.out.println("O número 2 ao cubo: " + Math.pow(num2, 3));
		} else {
			aoQuadrado(num1, num2);
		}
		
	}
	
	public static void aoQuadrado (int num1, int num2) {
		
		if(num1 != 5 || num2 != 5 || (num1 + num2) != 5 || (num1 - num2) != 5) {
			System.out.println("Você inseriu um número diferente de 5, então: ");
	        System.out.println("Número 1 ao quadrado: " + Math.pow(num1, 2));
	        System.out.println("Número 2 ao quadrado: " + Math.pow(num2, 2));
		}
		
	}

	public static void main(String[] args) {
		
		//Faça um código que receba duas entradas do usuário
		//Imprima essas duas entradas ao cubo se:
		//Algum dos dois números for 5 ou a soma deles for 5 ou a diferença deles for 5
		//Se nenhuma dessas condições forem satisfeitas, imprima o quadrado dos números.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		int numero1 = input.nextInt();
		
		System.out.println("Insira o segundo número: ");
		int numero2 = input.nextInt();
		
		aoCubo(numero1, numero2);
		
		

	}

}
