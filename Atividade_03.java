package exerciciosIntrodutorios_01;
import java.util.Scanner;

public class Atividade_03 {

	public static void main(String[] args) {
		
		//Leia quatro valores inteiros A, B, C e D. 
		//A seguir, calcule e mostre a diferença do produto A e B pelo produto de C e D
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor A: ");
		int a = input.nextInt();
		
		System.out.println("Insira o valor B: ");
		int b = input.nextInt();
		
		System.out.println("Insira o valor C: ");
		int c = input.nextInt();
		
		System.out.println("Insirao valor D: ");
		int d = input.nextInt();
		
		int diferenca = ((a * b) - (c * d));
		
		System.out.println("A diferença do produto A e B pelo produto C e D é: " + diferenca);
		
	}

}
