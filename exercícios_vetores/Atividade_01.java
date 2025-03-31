package exerciciosVetores_04;
public class Atividade_01 {

	public static void main(String[] args) {
		
		//Crie uma array de 5 elementos e imprima os últimos elementos por primeiro
		
		int n [] = new int [5];
		n [0] = 5;
		n [1] = 6;
		n [2] = 7;
		n [3] = 8;
		n [4] = 9;
		
		for(int i = 4; i < n.length && i >= 0 ; i--) {
			System.out.println(n[i]);
		}

	}

}
