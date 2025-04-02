package exerciciosVetores_04;

import java.util.Scanner;

public class Atividade_10 {
	
	public static void main(String[] args) {
		
		//Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça cada um
		//respondeu um questionário com 5 perguntas:
		//-Gosta de futebol?
		//-Gosta de seriados?
		//-Gosta de redes sociais?
		//-Gosta da Oktoberfest?
		//A resposta a cada pergunta pode ser: SIM, NÃO, ou IND (indiferente). O índice da afinidade é
		//medido da seguinte maneira: 
		//-se ambos deram a mesma resposta soma-se 3 pontos ao índice;
		//-se um respondeu IND e o outro SIM ou NÃO soma-se 1;
		//-se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice
		//Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as respostas
		//da moça. Por fim, escreva a afinidade considerando os seguintes intervalos.
		
		Scanner input = new Scanner(System.in);
		
		int indice = 0;
		String nome1;
		String nome2;
		
		String questionario1 [] = new String [5];
		String questionario2 [] = new String [5];
		
		System.out.println("Insira o nome do primeiro participante: ");
		nome1 = input.next();
		System.out.println("Responda as perguntas com: SIM, NÃO ou INDIFERENTE");
		System.out.println("Gosta de música sertaneja?");
		questionario1[0] = input.next();
		System.out.println("Gosta de futebol? ");
		questionario1[1] = input.next();
		System.out.println("Gosta de seriados? ");
		questionario1[2] = input.next();
		System.out.println("Gosta de redes sociais?");
		questionario1[3] = input.next();
		System.out.println("Gosta da Oktoberfest?");
		questionario1[4] = input.next();
			
		System.out.println("Insira o nome do segundo participante: ");
		nome2 = input.next();
		System.out.println("Responda as perguntas com: SIM, NÃO ou INDIFERENTE");
		System.out.println("Gosta de música sertaneja?");
		questionario2[0] = input.next();
		System.out.println("Gosta de futebol? ");
		questionario2[1] = input.next();
		System.out.println("Gosta de seriados? ");
		questionario2[2] = input.next();
		System.out.println("Gosta de redes sociais?");
		questionario2[3] = input.next();
		System.out.println("Gosta da Oktoberfest?");
		questionario2[4] = input.next();
		
		for(int i = 0; i < questionario1.length && i < questionario2.length; i++) {
			if(questionario1[i].equals(questionario2[i])) {
				indice+=3;
			} else if (questionario1[i].equals("INDIFERENTE") && questionario2[i].equals("SIM") || questionario2[i].equals("NÃO")) {
				indice +=1;
			} else if (questionario2[i].equals("INDIFERENTE") && questionario1[i].equals("SIM") || questionario1[i].equals("NÃO")) {
				indice +=1;
			} else if (questionario1[i].equals("SIM") && questionario2[i].equals("NÃO")) {
				indice -=2;
			} else if (questionario2[i].equals("SIM") && questionario1[i].equals("NÃO")) {
				indice -=2;
			}
			
		}
		
		System.out.println("\n| Afinidade | Mensagem |");
		System.out.println("|-----------|----------------------------------|");
        System.out.print("| " + indice + "        | ");
		
		if(indice >= 15) {
			System.out.println("\"Casem!\" |");
		} else if(indice >= 10 || indice <= 14 ) {
			System.out.println("\"Vocês têm muita coisa em comum!\" |");
		} else if(indice >= 5 || indice <= 9) {
			System.out.println("\"Talvez não dê certo :(\" |");
		} else if(indice >= 0 || indice <= 4) {
			System.out.println("\"Vale um encontro.\" |");
		} else if(indice >= -1 || indice <= -9) {
			System.out.println("\"Melhor não perder tempo.\" |");
		} else {
			System.out.println("\"Vocês se odeiam!\" |");
		}
			
	}

}
