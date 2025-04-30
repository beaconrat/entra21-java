package exerciciosMetodos_06;

import java.util.Scanner;

public class Atividade_13 {
	
	public static String calcularPerimetroDeUmRetangulo (double altura, double largura) {
		
		return "O perímetro do retângulo é: " + 2 * (altura + largura);
		
	}
	
	public static String calcularAreaDeUmRetanuglo(double altura, double largura) {
		
		return "A área do retângulo é: " + altura * largura;
		
	}
	
	public static void main(String[] args) {
		
		//Faça um método que calcule o perímetro e outro que calcule a área de um retângulo
		//passando a altura e largura como parâmetros.
		//Retorne os valores calculados.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a altura");
		double altura = input.nextDouble();
		System.out.println("Insira a largura");
		double largura = input.nextDouble();
		
		System.out.println(calcularPerimetroDeUmRetangulo(altura, largura));
		System.out.println(calcularAreaDeUmRetanuglo(altura, largura));
		
	}

}
