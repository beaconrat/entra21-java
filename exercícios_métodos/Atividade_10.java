package exerciciosMetodos_06;

import java.util.Scanner;

public class Atividade_10 {
	
	public static boolean par() {
		
		return true;
	}
	
	public static boolean impar() {
		
		return false;
	}
	
	public static void main(String[] args) {
		
		//Faça um método booleano que retorne true se o número passado como parâmetro seja par.
		//Retorne false caso seja ímpar
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um número");
		int numero = input.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(par());
		} else {
			System.out.println(impar());
		}

	}

}
