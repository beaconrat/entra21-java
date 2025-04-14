package exerciciosMatrizes_05;

public class Atividade_01 {

	public static void main(String[] args) {
		
		//Crie uma matriz com 12 linhas e 2 colunas
		//A primeria coluna corresponde aos meses do anos
		//A segunda corresponde ao lucro que a loja teve no mês
		//Imprima o seu resultado no formato:
		//No mês 1 a loja teve 2000 de lucro
		//No mês 2 a loja teve 1500 de lucro etc.
		
		int matriz[][] = new int [12][2];
		matriz [0][0] = 1;
		matriz [0][1] = 2000;
		matriz [1][0] = 2;
		matriz [1][1] = 2500;
		matriz [2][0] = 3;
		matriz [2][1] = 3000;
		matriz [3][0] = 4;
		matriz [3][1] = 3500;
		matriz [4][0] = 5;
		matriz [4][1] = 4000;
		matriz [5][0] = 6;
		matriz [5][1] = 4500;
		matriz [6][0] = 7;
		matriz [6][1] = 5000;
		matriz [7][0] = 8;
		matriz [7][1] = 5500;
		matriz [8][0] = 9;
		matriz [8][1] = 6000;
		matriz [9][0] = 10;
		matriz [9][1] = 6500;
		matriz [10][0] = 11;
		matriz [10][1] = 7000;
		matriz [11][0] = 12;
		matriz [11][1] = 7500;
		
		for(int i = 0; i < matriz.length; i++) {
				System.out.println("No mês " + " " + matriz[i][0] + " " + " a loja teve " + matriz[i][1] +" de lucro " +  "\t");
		
		}
		
		System.out.println();
		
	}

}
