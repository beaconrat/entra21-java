package exerciciosEstruturasDeSelecao_02;

import java.util.Scanner;

public class Atividade_14 {

	public static void main(String[] args) {
		
		//Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um algoritmo
		//para ler as idades dos filhos e exibir quem é o mais velho, o irmão do meio e o caçula da familia.
		//Suponha que não haja empates
				
		Scanner input = new Scanner(System.in);
				
		int irmaoVelho;
		int irmaoMeio;
		int irmaoCacula;
		String nomeVelho = "";
		String nomeMeio = "";
		String nomeCacula = "";
				
				
		System.out.println("Insira a idade do Marquinhos: ");
		int idadeMarquinhos = input.nextInt();
				
		System.out.println("Insira a idade do Zezinho: ");
		int idadeZezinho = input.nextInt();
				
		System.out.println("Insira a idade da Luluzinha: ");
		int idadeLuluzinha = input.nextInt();
				
		if(idadeMarquinhos > idadeZezinho && idadeLuluzinha < idadeZezinho) {
			irmaoVelho = idadeMarquinhos;
			nomeVelho = "Marquinhos";
			irmaoMeio = idadeZezinho;
			nomeMeio = "Zezinho";
			irmaoCacula = idadeLuluzinha;
			nomeCacula = "Luluzinha";
				
		} else if(idadeZezinho > idadeMarquinhos && idadeLuluzinha < idadeMarquinhos) {
			irmaoVelho = idadeZezinho;
			nomeVelho = "Zezinho";
			irmaoMeio = idadeMarquinhos;
			nomeMeio = "Marquinhos";
			irmaoCacula = idadeLuluzinha;
			nomeCacula = "Luluzinha";
					
		} else if(idadeLuluzinha > idadeZezinho && idadeMarquinhos < idadeZezinho) {
			irmaoVelho = idadeLuluzinha;
			nomeVelho = "Luluzinha";
			irmaoMeio = idadeZezinho;
			nomeMeio = "Zezinho";
			irmaoCacula = idadeMarquinhos;
			nomeCacula = "Marquinhos";
					
		} else if(idadeMarquinhos > idadeLuluzinha && idadeZezinho < idadeLuluzinha) {
			irmaoVelho = idadeMarquinhos;
			nomeVelho = "Marquinhos";
			irmaoMeio = idadeLuluzinha;
			nomeMeio = "Luluzinha";
			irmaoCacula = idadeZezinho;
			nomeCacula = "Zezinho";	
					
		} else if(idadeZezinho > idadeLuluzinha && idadeMarquinhos < idadeLuluzinha) {	
			irmaoVelho = idadeZezinho;
			nomeVelho = "Zezinho";
			irmaoMeio = idadeLuluzinha;
			nomeMeio = "Luluzinha";
			irmaoCacula = idadeMarquinhos;
			nomeCacula = "Marquinhos";
				
		} else if(idadeZezinho > idadeLuluzinha && idadeMarquinhos < idadeLuluzinha) {	
			irmaoVelho = idadeZezinho;
			nomeVelho = "Zezinho";
			irmaoMeio = idadeLuluzinha;
			nomeMeio = "Luluzinha";
			irmaoCacula = idadeMarquinhos;
			nomeCacula = "Marquinhos"; 
					
		} else if(idadeLuluzinha > idadeMarquinhos && idadeZezinho < idadeMarquinhos) {
			irmaoVelho = idadeLuluzinha;
			nomeVelho = "Luluzinha";
			irmaoMeio = idadeMarquinhos;
			nomeMeio = "Marquinhos";
			irmaoCacula = idadeZezinho;
			nomeCacula = "Zezinho";
		}
					
				
		System.out.println("O irmão mais velho é: " + nomeVelho);
		System.out.println("O irmão do meio é: " + nomeMeio);
		System.out.println("O irmão caçula é: " + nomeCacula);
	
	}

}
