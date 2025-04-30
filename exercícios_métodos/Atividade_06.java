package exerciciosMetodos_06;

import java.util.Scanner;

public class Atividade_06 {
	
	public static void numeroBase(int numero1) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o 2º número: ");
		int numero2 = input.nextInt();
		
		System.out.println("Insira o 3º número: ");
		int numero3 = input.nextInt();
		
		if(Math.abs(numero2 - numero1) < Math.abs(numero3 - numero1)) {
			System.out.println(numero2 + " é o número mais próximo do número " + numero1);
		} else {
			System.out.println(numero3 + " é o número mais próximo do número " + numero1);
		}
			
	}

	public static void main(String[] args) {
		
		//Faça um método que receba um número, esse será o número "base"
		//Dentro do método, faça o usuário entrar com mais dois números
		//Imprima qual dos dois últimos números está mais perto do primeiro número "base"
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o 1º número");
		int numero1 = input.nextInt();
		
		numeroBase(numero1);

	}

}
