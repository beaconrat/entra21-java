package exerciciosVetores_04;

import java.util.Scanner;

public class Atividade_11 {

	public static void main(String[] args) {
		
		//Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes
		//Trinta deles foram ouvidos e para cada um perguntou-se o sexo(1=feminino; 2=masculino), uma
		//nota para o cinema (zero até dez, valor inteiro) e a idade.
		//Baseado nisto faça um programa que informe:
		//-qual a nota média recebida pelo cinema;
		//-qual a nota média atribuída pelos homens;
		//-qual a nota atribuída pela mulher mais jovem;
		//-quantas das mulheres com mais de 50 anos deram nota superior à média recebida pelo
		//cinema.
		
		Scanner input = new Scanner(System.in);
		
		int genero [] = new int [5];
		int idade [] = new int [5];
		int nota [] = new int [5];
		
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
		
		for(int i = 0; i < nota.length; i++) {

			System.out.println("Insira seu gênero: ");
			System.out.println("1-Feminino");
			System.out.println("2-Masculino");
			genero[i] = input.nextInt();
			
			System.out.println("Insira a sua idade: ");
			idade[i] = input.nextInt();
			
			System.out.println("Insira uma nota para o cinema (0 a 10): " );
			nota[i]= input.nextInt();
			
			soma += nota[i];
			
			if(genero[i] == 2) {
				somaHomens += nota[i];
				homens++;
			}
			if(genero[i] == 1 && idade[i] < mulherJovem) {
				mulherJovem = idade[i];
				notaMulherJovem = nota[i];
			}	
			
		}
		
		mediaNota = soma / nota.length;
		
		for(int i = 0; i < nota.length; i++) {
			if(genero[i] == 1 && idade[i] > 50 && nota[i] > mediaNota) {
				contMulheres++;
				
			}
		}

		
		System.out.println("A nota média do cinema é: " + mediaNota);
		System.out.println("A nota média atrbuída pelos homens é: " + (somaHomens / homens));
		System.out.println("A nota atribúida pela mulher mais jovem foi: " + notaMulherJovem);
		System.out.println(contMulheres + " das mulheres com mais de 50 anos deram nota superior à média recebida pelo cinema");
		
	}

}
