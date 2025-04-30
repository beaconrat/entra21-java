package exerciciosMetodos_06;

import java.util.Scanner;

public class Atividade_17 {
		
	public static char retornaLetra(String str) {
			
		if(str.length() % 2 == 0) {
			return str.charAt(0);
		}
		
		return str.charAt(1);
	}
	
	public static void main(String[] args) {
		
		//Faça um código que recebe uma palavra do usuário, se essa palavra tem tamanho par,
		//retorne o primeiro caractere dessa palavra.
		//Caso ela tenha tamanho ímpar, retorne o segundo caractere dessa palavra.
				
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma palavra");
		String str = input.next();
		
		System.out.println(retornaLetra(str));

	}

}
