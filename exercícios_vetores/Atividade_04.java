package exerciciosVetores_04;

import java.util.Scanner;

public class Atividade_04 {

	public static void main(String[] args) {
		
		//Faça um algoritmo que atribua valores a um vetor de 100 posições de acordo com o quadrado
		//do seu índice
		//[0] = 0;
		//[1] = 1;
		//[2] = 4;
		//[3] = 9;
		
		int n [] = new int [100];
		
		for(int i = 0; i < n.length; i++) {
			n [i] = i*i;
			System.out.println(n[i]);
		}
	
	}

}
