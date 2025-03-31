package exerciciosIntrodutorios_01;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade_04 {

	public static void main(String[] args) {
		
		//Escreva um programa que leia o número de um funcionário, seu nome, sua quantidade
		//de horas trabalhadas, o valor que recebe por hora e calcule o salário desse funcionário.
		//A seguir, mostre o número, nome e o salário do funcionário, com duas casas decimais
		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira o número do funcionário: ");
		String numeroF = input.next();
		
		System.out.println("Insira o nome do funcionário: ");
		String nomeF = input.next();
		
		System.out.println("Insira a quantidade de horas trabalhadas do funcionário: ");
		double horasF = input.nextDouble();
		
		System.out.println("Insira o valor que o funcionário recebe por hora: ");
		double valorF = input.nextDouble();
		
		double salarioF = valorF * horasF;
		
		System.out.println("Número do funcionário: " + " " + numeroF);  
		System.out.println("Nome do funcionário: " + " " + nomeF);
		System.out.println("Salário do funcionário:" + " " + df.format(salarioF));
		


	}

}
