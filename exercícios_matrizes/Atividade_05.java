package exerciciosMatrizes_05;

import java.util.Scanner;

public class Atividade_05 {

	public static void main(String[] args) {
		
		//Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus cliientes.
		//Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino, 2=masculino), uma
		//nota para o cinema (zero até dez, valor inteiro) e a idade.
		//Baseado nisto faça um programa que informe:
		//-qual a nota média recebida pelo cinema;
		//-qual a nota média atribuída pelos homens;
		//-qual a nota atribúida pela mulher mais jovem;
		//-quantas das mulheres com mais de 50 anos deram nota superior à média recebida pelo cinema
		//Não utilize vetores!!
		
		Scanner input = new Scanner(System.in);
		
		int matriz [][] = new int [5][3];
		
		int media = 0;
		int soma = 0;
		double homens = 0;
		double somaHomens = 0;
		double mulheres = 0;
		int mulherJovem = Integer.MAX_VALUE;
		int notaMulherJovem = 0;
		int mulheresMais50 = 0;
		int contMulheres = 0;
		int mediaNota = 0;
		
		for(int i = 0; i < matriz.length; i++) {

			System.out.println("Insira seu gênero: ");
			System.out.println("1-Feminino");
			System.out.println("2-Masculino");
			matriz[i][0] = input.nextInt();
			
			System.out.println("Insira a sua idade: ");
			matriz[i][1] = input.nextInt();
			
			System.out.println("Insira uma nota para o cinema (0 a 10): " );
			matriz[i][2]= input.nextInt();
			
			soma += matriz[i][2];
			
			if(matriz[i][0] == 2) {
				somaHomens += matriz[i][2];
				homens++;
			}
			if(matriz[i][0] == 1 && matriz[i][1] < mulherJovem) {
				mulherJovem = matriz[i][1];
				notaMulherJovem = matriz[i][2];
			}	
			
		}
		
		mediaNota = soma / matriz.length;
		
		for(int i = 0; i < matriz.length; i++) {
			if(matriz[i][0] == 1 && matriz[i][1] > 50 && matriz[i][2] > mediaNota) {
				contMulheres++;
				
			}
		}

		
		System.out.println("A nota média do cinema é: " + mediaNota);
		System.out.println("A nota média atrbuída pelos homens é: " + (somaHomens / homens));
		System.out.println("A nota atribúida pela mulher mais jovem foi: " + notaMulherJovem);
		System.out.println(contMulheres + " das mulheres com mais de 50 anos deram nota superior à média recebida pelo cinema");
		
	}

}