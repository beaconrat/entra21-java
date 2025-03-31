package exerciciosEstruturasDeSelecao_02;
import java.util.Scanner;

public class Atividade_03 {

	public static void main(String[] args) {
		
		//Faça um algoritmo que imprima "nome correto" caso o nome seja inserido seja o seu
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o nome da programadora");
		String nome = input.next();
		
		if (nome.equalsIgnoreCase("Beatriz")) {
			System.out.println("O nome está correto");
		} else {
			System.out.println("O nome está incorreto");
		}
			
	}

}
