package exerciciosMetodos_06;

public class Atividade_04 {
	
	public static void maiorElemento(int vetor[]) {
		int maiorNumero = Integer.MIN_VALUE;
		
		for(int i = 0; i < vetor.length; i++) {
	
			if(vetor[i] > maiorNumero) {
				maiorNumero = vetor[i];
			}
		
		}
		
		System.out.println("O maior elemento do vetor é: " + maiorNumero);
		
	}
	
	public static void menorElemento(int vetor[]) {
		int menorNumero = Integer.MAX_VALUE;
		
		for(int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] < menorNumero) {
				menorNumero = vetor[i];
				
			}
			
		}
		
		System.out.println("O menor elemento do vetor é: " + menorNumero);
		
	}
	
	public static void mediaElemento(int vetor[]) {
		double mediaNumero = 0;
		int soma = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			
			soma += vetor[i];
			
			mediaNumero = soma / vetor.length;
			
		}
		
		System.out.println("A média dos valores é: " + mediaNumero);
		
	}

	public static void main(String[] args) {
		
		//Faça um programa que descubra:
		//a) O maior elemento de um vetor
		//b) O menor elemento de um vetor
		//c) A média dos valores
		//(Criar um método para cada questão)
		
		int vetor[] = new int [5];
		vetor [0] = 10;
		vetor [1] = 20;
		vetor [2] = 30;
		vetor [3] = 40;
		vetor [4] = 50;
	
		maiorElemento(vetor);
		menorElemento(vetor);
		mediaElemento(vetor);

	}

}
