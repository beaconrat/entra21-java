package atividadeAvaliativa_01;

import java.util.Scanner;

public class Questão_02 {

	public static void main(String[] args) {
		
		//Uma grande loja de departamentos paga aos vendedores um salário variável com base
		//nas vendas efetuadas durante o mês, que é igual a 17% de comissão sobre o preço de
		//cada produto vendido. Cada vendedor, em um determinado mês, vende n reais em produtos.
		//Deseja-se obter um relatório com: nome, total de vendas (em R$) e salário base de cada
		//vendedor. Descreva um algoritmo que gere o relatório desejado.
		//Para prosseguir com a entrada de um novo vendedor o algoritmo deve apresentar a 
		//seguinte mensagem: "deseja digitar os dados de mais um vendedor: s(SIM) / n(NÃO)".
		
		Scanner input = new Scanner(System.in);
		
		String proximoVendedor = "s";
		double comissao = 0.17;
		
		while(proximoVendedor.equalsIgnoreCase("s")) {
	
			System.out.println("Insira o nome do vendedor");
			String nomeVendedor = input.next();		
			
			System.out.println("Insira o total de vendas no mês do vendedor (em R$)");
			double totalVendas = input.nextDouble();
			
			System.out.println("Insira o salário do vendedor");
			double salarioVendedor = input.nextDouble();
			
			double totalSalario = salarioVendedor + (totalVendas * comissao);
		
			System.out.println("Nome do vendedor: " + nomeVendedor);
			System.out.println("Total de vendas do vendedor: " + " R$" + totalVendas );
			System.out.println("O salário do vendedor no mês é: " + " R$" + totalSalario);
			System.out.println("Deseja digitar os dados de mais um vendedor?");
			System.out.println("s - (SIM)");
			System.out.println("n - (NÃO)");
			proximoVendedor = input.next();
			
		}
		
	}

}
