package exerciciosVetores_04;

import java.util.Scanner;

public class Atividade_07 {

	public static void main(String[] args) {
		
		//Descreva um algoritmo que leia 10 valores e os coloque em um vetor de 10 posições
		//Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam
		//aumentados em 5% e os das posições pares sejam aumentador em 2%
		//Imprima o vetor resultante
		
		Scanner input = new Scanner(System.in);
		
		int valor = 0;
		
		double n[] = new double [10];
		
		for(int i = 0; i < n.length; i++) {
			System.out.println("Insira um valor");
			valor = input.nextInt();
			
			n[i] = valor;
			
			if(n[i] % 2 == 0) {
				n[i] = n[i] + (n[i] * 0.02);
			} else {
				n[i] = n[i] + (n[i] * 0.05);
			}
			
			
		}
		System.out.println("O vetor resultante: {" + n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3] + ", " + n[4] +", "  + n[5] + ", " 
												+ n[6] + ", " + n[7] + ", " + n[8] + ", " + n[9] + "}");
		
		
	}

}
