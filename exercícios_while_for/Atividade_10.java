package exerciciosWhileFor_03;

import java.util.Scanner;

public class Atividade_10 {

	public static void main(String[] args) {
		
		//Uma turma tem n alunos.
		//Dado n, o nome(somente o primeiro nome) e idade de cada aluno descreva:
		//a)os nomes dos alunos que tem 18 anos
		//b)a quantidade de alunos que tem idade acima de 20 anos
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira uma quantia de alunos: ");
		int numeroAlunos = input.nextInt();
		
		int contIdade1 = 0;
		int contIdade2 = 0;
		int i = 0;
		
		while(i < numeroAlunos) {
			System.out.println("Insira o nome do(a) aluno(a): ");
			String nomeAluno = input.next();
			
			System.out.println("Insira a idade do(a) aluno(a): ");
			int idadeAluno = input.nextInt();
			
			i++;
			
			if(idadeAluno == 18) {
				contIdade1 ++;
				
			}else if(idadeAluno > 20) {
				contIdade2 ++; 
				
			}
			
		}
		
		System.out.println("A turma possui " + contIdade1 + " alunos de 18 anos e " + contIdade2 + " alunos com mais de 20 anos de idade"); 	

	}

}
