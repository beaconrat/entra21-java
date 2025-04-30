package exerciciosMetodos_06;

import java.util.Scanner;

public class Atividade_15 {
	
	public static String verificarLimite(int numeroMinimo, int numeroMaximo, int numero) {
		
		if(numero >= numeroMinimo && numero <= numeroMaximo) {
			return "Usuário inseriu o nº " + numero + " que está dentro do limite imposto";
		} else {
			return "Usuário inseriu o nº " + numero + " que está fora do limite imposto"; 
		}
		
	}

	public static void main(String[] args) {
		
		//Faça um programa que diz se um número inserido está dentro de um limite imposto pelo usuário.
		//Por exemplo:
		//Usuário inseriu o limite máximo como 100.
		//Usuário inseriu o limite mínimo como 70.
		//Depois ele inseriu o número 80.
		//O retorno deve ser: 80 está nos limites impostos.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o limite máximo: ");
		int limiteMin = input.nextInt();
		System.out.println("Informe o limite mínimo: ");
		int limiteMax = input.nextInt();
		System.out.println("Informe um numero: ");
		int numero = input.nextInt();
		
		System.out.println(verificarLimite(limiteMax, limiteMin, numero));
		
		
	}

}
