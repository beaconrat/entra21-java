package exerciciosMatrizes_05;

public class Atividade_06 {

	public static void main(String[] args) {
		
		//Utilizando matrizes e laços de repetição, imprima as seguintes figuras:
		//a) ****
		//   ****
		//   ****
		//   **** 
		
		//b) ****
		//   *  *
		//   *  *
		//   ****
		
		//c) *
		//   **
		//   ***
		//   ****
		
		String matriz1 [][] = new String [4][4];
		String matriz2 [][] = new String [4][4];
		String matriz3 [][] = new String [4][4];
		
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz1.length; j++) {
			
				matriz1[i][j] = "*";
				System.out.print(matriz1[i][j] + " ");
				
			}
			
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int i = 0; i < matriz2.length; i++) {
			for(int j = 0; j < matriz2.length; j++) {
				
				matriz2[i][j] = " ";
				if(i == 0 || j == 0 || i == matriz2.length -1 || j == matriz2[i].length - 1) {
					matriz2[i][j] = "*";
					
				}
				
				System.out.print(matriz2[i][j] + " ");
				
			}
			
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int i = 0; i < matriz3.length; i++) {
			for(int j = 0; j <= i; j++) {
				
				matriz3[i][j] = "*";
				System.out.print(matriz3[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
	}

}
