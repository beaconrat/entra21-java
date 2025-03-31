package exerciciosWhileFor_03;

import java.util.Scanner;

public class Atividade_07 {

	public static void main(String[] args) {
		
		//Escreva um algoritmo que leia o número de inscrição
		//e a altura de um atleta e informe:
		//O número de inscrição e a altura do atleta mais alto
		//O número de inscrição e a altura do atleta mais baixo
		//A altura média do grupo de atletas
		//A quantidade de atletas cadastrados
		//A leitura deve ser finalizada ao digitar 0 para o número de inscrição
		
		Scanner input = new Scanner(System.in);
		
		
		String inscricaoBaixa = "";
		String inscricaoAlta = "";
		double alturaAlta = Double.MIN_VALUE;
		double alturaBaixa = Double.MAX_VALUE;
		double somaAltura = 0;
		int quantidadeAtletas = 0;
		
		System.out.println("Insira o número de inscrição do atleta");
		String inscricao = input.next();
		
		while(!inscricao.equals("0")) {
			System.out.println("Insira a altura do atleta");
			double altura = input.nextDouble();
			
			if(altura > alturaAlta) {
				alturaAlta = altura;
				inscricaoAlta = inscricao;
			}
			
			if(altura < alturaBaixa) {
				alturaBaixa = altura;
				inscricaoBaixa = inscricao;
			}
			
			somaAltura += altura;
			quantidadeAtletas++;
			System.out.println("Insira o número de inscrição");
			inscricao = input.next();
			
		}
		
		double media = somaAltura / quantidadeAtletas;
		
		System.out.println("Número de inscrição do atleta mais alto: " + inscricaoAlta + " /" + alturaAlta + "m");
		System.out.println("Número de inscrição do atleta mais baixo: " + inscricaoBaixa + " /" + alturaBaixa + "m");
		
		System.out.println("Média de altura: " + media + "m");
		System.out.println(quantidadeAtletas + " atletas cadastrados");
		
			
		
			

		

	}

}
