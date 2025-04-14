package exerciciosMetodos_06;

import java.util.Scanner;

public class Atividade_02 {
	
	public static void gabriel() {
		System.out.println("O nome dele é Gabriel");
		System.out.println("Ele tem 28 anos");
		System.out.println("Ele é estudante do Entra21");
	}

	public static void main(String[] args) {
		
		//Faça um método para seus colegas mais próximos
		//O método deve imprimir:
		//O nome dele(a) é [nome];
		//Ele(a) tem [idade] anos;
		//Ele(a) é estudante do Entra21
		//(Em prints separados)
		//Faça com que o método seja o nome do seu colega.
		//O usuário deve entrar com o nome da pessoa para escolher um dos métodos a ser
		//executado
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o nome do seu colega mais próximo:");	
		String nome = input.next();
		
		if(nome.equalsIgnoreCase("gabriel")) {
			gabriel();
			
		}

	}

}
