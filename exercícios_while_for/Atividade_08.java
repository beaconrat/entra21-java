package exerciciosWhileFor_03;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Atividade_08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Dada uma turma de alunos, contendo seu nome e nota de duas provas
		//Descreva um algoritmo para informar a média de cada aluno.
		//Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for "fim".
	
		double media = 0;
		
		System.out.println("Insira o nome do aluno");
		String nomeAluno = input.next();
		
		while(!nomeAluno.equalsIgnoreCase("fim")) {
			System.out.println("Insira a nota da 1ª prova");
			double prova1 = input.nextDouble();
			System.out.println("Insira a nota da 2ª prova");
			double prova2 = input.nextDouble();
			
			media = (prova1 + prova2)/2;
			System.out.println("A média do aluno " + nomeAluno + " " + "é:" + " " + media);
			
			System.out.println("Insira o nome do aluno");
			nomeAluno = input.next();	
		}

	}

}
