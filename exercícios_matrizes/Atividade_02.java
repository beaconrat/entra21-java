package exerciciosMatrizes_05;

public class Atividade_02 {

	public static void main(String[] args) {
		
		//Calcule o determinante da matriz abaixo
		//4 12
		//2 -3
		
		int matriz[][] = new int [2][2];
		matriz [0][0] = 4;
		matriz [0][1] = 12;
		matriz [1][0] = 2;
		matriz [1][1] = -3;

		int det = (matriz[0][0] * matriz[1][1]) - (matriz[1][0] * matriz[0][1]);
		
		System.out.println("O determinante é:" + det);
		

	}

}
