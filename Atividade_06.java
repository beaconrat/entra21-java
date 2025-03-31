package exerciciosIntrodutorios_01;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade_06 {

	public static void main(String[] args) {
		
		//Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total
		//de vendas efetuadas por ele no mês(em valor)
		//Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
		//informar o total a receber no final do mês, com duas casas decimais
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira o nome do vendedor: ");
		String nome = input.next();
		
		System.out.println("Insira o salário fixo do vendedor: ");
		double salario = input.nextDouble();
		
		System.out.println("Insira o valor total de vendas feitas pelo vendedor no mês: ");
		double vendas = input.nextDouble();
		
		double comissaoVendas = (vendas * 0.15);
		double salarioFinal = (comissaoVendas + salario);
		
				
		System.out.println("Total do salário do vendedor "  + nome + " " + "é" + " " + df.format(salarioFinal));
		
		
		

	}

}
