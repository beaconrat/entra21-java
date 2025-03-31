package exerciciosWhileFor_03;

import java.util.Scanner;
public class Atividade_09 {

	public static void main(String[] args) {
		
		//Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do
		//sexo (seco='M' ou 'm' para masculino e seco='F' ou 'f' para feminino) de cada pessoa informe
		//a média da altura das mulheres e a média de altura do grupo
		//A leitura deve ser finalizada ao digitar para a altura.
		
		Scanner input = new Scanner(System.in);
		
		double mediaAlturaFeminino = 0;
		double mediaAlturaGrupo = 0;
		double mediaGrupo = 0;
		double mediaFeminino = 0;
		int totalFeminino = 0;
		int totalGrupo = 0;
		
		System.out.println("Insira uma altura");
		double altura = input.nextDouble();
		
		while(altura > 0) {
			System.out.println("Insira o sexo da pessoa: "
					+ "\n" + "M- Masculino "
					+ "\n" + "F- Feminino.");
			char sexo = input.next().charAt(0);
			
			mediaAlturaGrupo += altura;
			totalGrupo ++;
			
			if(sexo == 'F' || sexo == 'f') {
				mediaAlturaFeminino += altura;	
				totalFeminino ++;
			}
			
			System.out.println("Insira uma altura");
			altura = input.nextDouble();
		}		
		
		if(totalGrupo > 0) {
			mediaGrupo = mediaAlturaGrupo / totalGrupo;
			System.out.println("Média de altura do grupo: " + mediaGrupo);
		}
		
		if(totalFeminino > 0) {
			mediaFeminino = mediaAlturaFeminino / totalFeminino;
			System.out.println("Média da altura das Mulheres: " + mediaFeminino);
		} else {
			System.out.println("Nenhuma mulher foi inserida");
		}
		
	}

}
