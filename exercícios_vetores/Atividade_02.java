package exerciciosVetores_04;

public class Atividade_02 {
	
	public static void main(String[] args) {
		
		//Crie uma array de 5 elementos e descubra:
		//Qual o maior elemento
		//Qual o menor elemento
		//A média dos elementos
		
		int menorN = Integer.MAX_VALUE;
		int maiorN = Integer.MIN_VALUE;
		double media = 0;
		double soma = 0;
		
		int n [] = new int [5];
		n [0] = 10;
		n [1] = 20;
		n [2] = 30;
		n [3] = 40;
		n [4] = 50;
		
		for(int i = 0; i < n.length; i++) {
			
			soma += n[i];
			
			if(n[i] > maiorN) {
				maiorN = n[i];
			}
			
			if(n[i] < menorN) {
				menorN = n[i];
			}

		}
		
		media = soma/n.length;
		System.out.println("A média dos números é: " + media);
		System.out.println("O maior número é: " + maiorN);
		System.out.println("O menor número é: " + menorN);
	}

}
