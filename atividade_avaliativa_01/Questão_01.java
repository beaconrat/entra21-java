package atividadeAvaliativa_01;

import java.util.Scanner;

public class Questão_01 {

	public static void main(String[] args) {
		
		//Escreva um programa onde o usuário informa os dados dos lados de um triângulo depois
		//verifique e imprima se ele é: Equilátero (três lados iguais), Isósceles (dois lados iguais), ou
		//Escaleno (três lados diferentes)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o 1º lado do triângulo");
		int lado1 = input.nextInt();
		
		System.out.println("Insira o 2º lado do triângulo");
		int lado2 = input.nextInt();
		
		System.out.println("Insira o 3º lado do triângulo");
		int lado3 = input.nextInt();
		
		if(lado1 == lado2 && lado2 == lado3) {
			System.out.println("O Triângulo é Equilátero");
		} else if(lado1 == lado2 && lado3 != lado1) {
			System.out.println("O Triângulo é Isósceles");
		} else if(lado3 == lado1 && lado2 != lado1) {
			System.out.println("O Triângulo é Isósceles");
		} else if(lado2 == lado3 && lado1 != lado2) {
			System.out.println("O Triângulo é Isósceles");
		} else if(lado1 != lado2 && lado3 != lado1 && lado2 != lado3) {
			System.out.println("O Triângulo é Escaleno");
		} else {
			System.out.println("Inválido");
		}

	}

}
