package exerciciosMatrizes_05;

public class Atividade_03 {

	public static void main(String[] args) {
		
		//Faça um código que some duas matrizes de inteiros de tamanhos iguais
		
		int soma = 0;
		
		int matriz1 [][] = new int [5][2];
		matriz1 [0][0] = 5;
		matriz1 [0][1] = 10;
		matriz1 [1][0] = 15;
		matriz1 [1][1] = 20;
		matriz1 [2][0] = 25;
		matriz1 [2][1] = 30;
		matriz1 [3][0] = 35;
		matriz1 [3][1] = 40;
		matriz1 [4][0] = 45;
		matriz1 [4][1] = 50;
		
		int matriz2 [][] = new int [5][2];
		matriz2 [0][0] = 5;
		matriz2 [0][1] = 10;
		matriz2 [1][0] = 15;
		matriz2 [1][1] = 20;
		matriz2 [2][0] = 25;
		matriz2 [2][1] = 30;
		matriz2 [3][0] = 35;
		matriz2 [3][1] = 40;
		matriz2 [4][0] = 45;
		matriz2 [4][1] = 50;
		
		for(int i = 0; i < matriz1.length && i < matriz2.length; i++) {
			for(int j = 0; j < matriz1[i].length && j < matriz2[i].length; j++) {
				
				soma = matriz1[i][j] + matriz2[i][j];	
				
				System.out.print(soma + "\t");
			}
			
			System.out.println();
			
		}

	}

}
