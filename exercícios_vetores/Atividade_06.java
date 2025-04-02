package exerciciosVetores_04;

public class Atividade_06 {

	public static void main(String[] args) {
		
		//Faça um algoritmo que inverta a ordem de um array
		//(o primeiro elemento vai se tornar o último elemento)
		
		int vetorOriginal[] = new int[10];
		vetorOriginal [0] = 100;
		vetorOriginal [1] = 90;
		vetorOriginal [2] = 80;
		vetorOriginal [3] = 70;
		vetorOriginal [4] = 60;
		vetorOriginal [5] = 50;
		vetorOriginal [6] = 40;
		vetorOriginal [7] = 30;
		vetorOriginal [8] = 20;
		vetorOriginal [9] = 10;
		
		int vetorInvertido[] = new int[vetorOriginal.length];
		
		for(int i = 0, j = vetorOriginal.length -1; i < vetorInvertido.length; i++, j--) {
			vetorInvertido[i] = vetorOriginal[j];
		}
		
		for(int i = 0; i < vetorInvertido.length; i++) {
			System.out.println(vetorInvertido[i]);
		}
		
	}

}
