package exerciciosVetores_04;

import java.util.Scanner;

public class Atividade_05 {

	public static void main(String[] args) {
		
		//Faça um algoritmo em que o usuário insere um número em um índice que ele mesmo informou
		
		Scanner input = new Scanner(System.in);
		
		int n [] = new int [10];
		
			System.out.println("Insira um número");
			int numero = input.nextInt();
			System.out.println("Escolha um índice para adicionar este numero");
			int indice = input.nextInt();
			
			while( indice < 0 || indice >= n.length) {
				System.out.println("Índice inválido");
				System.out.println("Qual o índice?");
				indice = input.nextInt();
				
			}
			
			n[indice] = numero;
			
			for (int i = 0; i < n.length; i++) {
				System.out.println(n[i]);
			}
	}

}
