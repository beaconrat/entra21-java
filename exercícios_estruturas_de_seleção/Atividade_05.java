package exerciciosEstruturasDeSelecao_02;
import java.util.Scanner;

public class Atividade_05 {

	public static void main(String[] args) {
	
		//Faça um algoritmo que o usuário entre com um char
		//Determiine se esse char é uma consoante ou vogal 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		char letra = input.next().charAt(0);
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra =='u') {
			System.out.println("A letra é uma vogal");
		} else {
			System.out.println("A letra é uma consoante");
		}
		


	}

}
