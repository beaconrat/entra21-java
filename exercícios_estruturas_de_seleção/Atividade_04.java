package exerciciosEstruturasDeSelecao_02;
import java.util.Scanner;

public class Atividade_04 {

	public static void main(String[] args) {
		
		//Faça um algoritmo que leia um caractere 
		//Caso seja digitada a letra 'M' escreva "Masculino"
		//Se for digitada a letra 'F' escreva "Feminino"
		//Se for informado 'I' escrerva "Não informado"
		//Qualquer outra letra digitada escreva "Entrada incorreta"
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o caractere do seu gênero: ");
		char genero = input.next().charAt(0);
		
		if (genero == 'M' || genero == 'm') {
			System.out.println("Masculino");
		} else if (genero == 'F' || genero == 'f') {
			System.out.println("Feminino");
		} else if (genero == 'I' || genero == 'i') {
			System.out.println("Não informado");
		} else {
			System.out.println("Entrada Incorreta");
		}
		
		
		



	}

}
