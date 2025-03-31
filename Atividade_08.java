package exerciciosIntrodutorios_01;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade_08 {

	public static void main(String[] args) {
		
		//Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C
		//Em seguida calcule:
		//a) a área do triângulo retângulo que tem base A e a altura C
		//b) a área do círculo de raio C
		//c) a área do trapézio que tem A e B por bases e C por altura
		//d) a área do quadrado que tem lado B
		//e) a área do retângulo que tem lados A e B
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor A: ");
		int a = input.nextInt();
		
		System.out.println("Insita o valor B: ");
		int b = input.nextInt();
		
		System.out.println("Insira o valor C: ");
		int c = input.nextInt();
		
		double areaTriRe = (a * c) / 2;
		double areaCir = Math.PI * Math.pow(c,2);
		double areaTrap = ((a + b) * c) / 2;
		double areaQuad = Math.pow(b, 2);
		double areRet = a * b;
		
		System.out.println("A área do Triângulo Retângulo é: " + areaTriRe);
		System.out.println("A área do Círculo é: " + areaCir);
		System.out.println("A área do Trapézio é: " + areaTrap);
		System.out.println("A área do Quadrado é: " + areaQuad);
		System.out.println("A área do Retângulo é: " + areRet);
		
		
		
	}

}
