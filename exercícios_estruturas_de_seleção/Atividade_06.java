package exerciciosEstruturasDeSelecao_02;
import java.util.Scanner;

public class Atividade_06 {

	public static void main(String[] args) {
		
		//Dada a idade de um nadador descreva um algoritmo que o classifique 
		//em uma das seguintes categorias:
		//pré-mirim 5-7 anos
		//mirim 8-10 anos
		//infantil 11-13 anos
		//infanto-juvenil 14-17 anos
		//juvenil 18-20 anos
		//adulto maiores de 21 anos
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a idade do nadador: ");
		int idade = input.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.println("Sua classificação é pré-mirim");
		} else if (idade >= 8 && idade <= 10) {
			System.out.println("Sua classificação é mirim");
		} else if (idade >= 11 && idade <= 13) {
			System.out.println("Sua classificação é infantil");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("Sua classificação é infanto-juvenil");
		} else if (idade >= 18 && idade <= 20) {
			System.out.println("Sua classificação é juvenil");
		} else if (idade >= 21) {
			System.out.println("Sua classificação é adulto");
		} else {
			System.out.println("Não tem permissão para fazer natação");
		}

	}

}
