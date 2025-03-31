package exerciciosIntrodutorios_01;
import java.util.Scanner;

public class Atividade_01 {

	public static void main(String[] args) {
				
		//Leia dois valores inteiros e imprima sua soma e produto
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor: ");
		int valor1 = input.nextInt();
		
		System.out.println("Insira o segundo valor: ");
		int valor2 = input.nextInt();
		
		int soma = valor1 + valor2;
		int produto = valor1 * valor2;
		
		System.out.println("A soma é: " + soma);
		System.out.println("O produto é: " + produto );
		
		
		
		

	}

}
