package exerciciosVetores_04;

import java.util.Scanner;

public class Atividade_03 {

	public static void main(String[] args) {
		
		//Faça um algoritmo que descubra se uma array de 5 elementos possui o número que o usuário
		//entrou. Imprima também o seu índice
		
		Scanner input = new Scanner(System.in);
		
		int numero;
		
		int n[] = new int [5];
		n [0] = 5;
		n [1] = 19;
		n [2] = 23;
		n [3] = 90;
		n [4] = 1;
		
		while(true) {
			System.out.println("Insira um número");
			numero = input.nextInt();
			
			boolean temvalor = false;
			
			for(int i = 0; i < n.length; i++) {
			
			if(n[i] == numero) {
				temvalor = true;
				System.out.println("O número possui dentro do vetor, no seu índice: " + (i+1));
			}
			}
			
			if(temvalor == false) {
				System.out.println("Este valor não tem dentro do vetor");
				break;
			}
				
			
		}
		

	}
	
}
