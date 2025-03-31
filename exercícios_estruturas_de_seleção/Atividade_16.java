package exerciciosEstruturasDeSelecao_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade_16 {

	public static void main(String[] args) {
		
		//Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios,
		//descreva um algoritmo que calcule a média de aproveitamento e o conceito do aluno
		//Usando a fórmula: média de aproveitamento = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios)/7
		//A atribuição dos conceitos obedece à tabela abaixo:
		//média de aproveitamento conceito
		//>= 9.0 A
		//>= 7.5 e < 9.0 B
		//>= 6.0 e < 7.5 C
		//>= 4.0 e < 6.0 D
		//> 4.0 E
		//O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e
		//a mensagem 'aprovado' caso o conceito seja A, B ou C, e 'reprovado' caso o conceito
		//seja D ou E
		
		Scanner input = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.0");
		
		System.out.println("Insira a 1ª nota: ");
		double notaProva1 = input.nextDouble();
		
		System.out.println("Insira a 2ª nota: ");
		double notaProva2 = input.nextDouble();
		
		System.out.println("Insira a 3ª nota: ");
		double notaProva3 = input.nextDouble();
				
		System.out.println("Insira a média dos exercicios: ");
		double notaExercicios = input.nextDouble();
		
		double mediaAluno = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios)/7;
		
		char conceito;
		
		if(mediaAluno >= 9.0) {
			conceito = 'A';
		} else if(mediaAluno >= 7.5 && mediaAluno < 9.0) {
			conceito = 'B';
		} else if(mediaAluno >= 6.0 && mediaAluno < 7.5) {
			conceito = 'C';
		} else if(mediaAluno >= 4.0 && mediaAluno < 6.0) {
			conceito = 'D';
		} else {
			conceito = 'E';
		}
		
		System.out.println("Média de aproveitamento:" + " " + dc.format(mediaAluno));
		System.out.println("Conceito: " + conceito);
		
		if (conceito == 'A' || conceito == 'B' || conceito =='C') {
			System.out.println("Situação: Aprovado");
		} else {
			System.out.println("Situação: Reprovado");
		}
		
	}

}
