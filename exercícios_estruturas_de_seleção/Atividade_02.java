package exerciciosEstruturasDeSelecao_02;
import java.util.Scanner;

public class Atividade_02 {

	public static void main(String[] args) {
		
		//Dados dois valores inteiros, escreva um algoritmo que informe
		//se o primeiro número é múltiplo do segundo
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o primerio valor");
		int primeiroValor = input.nextInt();
		
		System.out.println("Insira o segundo valor");
		int segundoValor = input.nextInt();
		
		if (primeiroValor % segundoValor == 0) {
			System.out.println("O 1º número é múltiplo pelo 2º número");
		} else {
			System.out.println("O 1º número NÃO é múltiplo pelo 2º número");
		}
	
	}

}
