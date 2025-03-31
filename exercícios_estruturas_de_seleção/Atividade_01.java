package exerciciosEstruturasDeSelecao_02;
import java.util.Scanner;

public class Atividade_01 {

	public static void main(String[] args) {
		
		//Dados dois números inteiros distintos descreva um algoritmo para informar
		//qual deles tem o maior valor
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		int numero1 = input.nextInt();
		
		System.out.println("Insira o segundo número: ");
		int numero2 = input.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O 1º número " + numero1 + " é o maior");
		}else {
			System.out.println("O 2º número " + numero2 + " é o menor");
		}
			
	}
	

}
