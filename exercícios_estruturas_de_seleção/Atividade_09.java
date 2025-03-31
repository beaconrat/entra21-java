package exerciciosEstruturasDeSelecao_02;
import java.util.Scanner;

public class Atividade_09 {

	public static void main(String[] args) {
		
		//Escreva um algoritmo que obtém do usuário 3 valores inteiros representando as
		//três cartas deste usuário em uma mão de jogo de truco(1=AS; 2=2; 3=3; 7=7; 11=Valete; 12=Dama; 13=Rei)
		//O algoritmo deve imprimir na tela a palavra "TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3),
		//"SEIS" (se APENAS DUAS das três cartas for AS, 2 ou 3) ou "NOVE" (se AS TRÊS cartas forem AS, 2 ou 3)
		//Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada
		
		Scanner input = new Scanner(System.in);
		int cont = 0;
		
		System.out.println("Escreva o primeiro número de uma carta do Truco: ");
		int numero1 = input.nextInt();
		
		System.out.println("Escreva o segundo número de uma carta do Truco: ");
		int numero2 = input.nextInt();
		
		System.out.println("Escreva o terceiro número de uma carta do Truco: ");
		int numero3 = input.nextInt();
		
		if (numero1 == 1 || numero1 == 2 || numero1 == 3 ) {
			cont ++;
		} if (numero2 == 1 || numero2 == 2 || numero2 == 3 ) {
			cont ++;
		} if (numero3 == 1 || numero3 == 2|| numero3 == 3 ) {
			cont ++;
		} if (cont == 1) {
			System.out.println("TRUCO");
		} else if (cont == 2) {
			System.out.println("SEIS");
		} else if (cont == 3) {
			System.out.println("NOVE");
		}
		
	} 

}
