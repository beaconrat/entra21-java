package exerciciosMetodos_06;

import java.util.Scanner;

public class Atividade_03 {
	
	public static void calcular(int num) {
		
		for(int i = 0; i < 20; i++) {
			System.out.println(num + 1 + i);
		}
		
	}

	public static void main(String[] args) {
		
		//Faça um programa que exiba o número que o usuário entrou como parâmetro e os 20
		//números que vem após esse número
		//(O parâmetro do método deve ser o número inserido pelo usuário)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um número");
		int numero = input.nextInt();

		calcular(numero);

	}

}
