package exerciciosMetodos_06;

import java.util.Scanner;

public class Atividade_07 {
	
	public static void generateStarWarsName(String nome, String sobrenome, String sobrenomeMae, String cidade) {
		
		String primeiroNomeStarWars = sobrenome.substring(0, 3) + nome.substring(0, 2);
		String sobrenomeStarWars =  sobrenomeMae.substring(0, 2) + cidade.substring(0, 3);
		String nomeStarWars = primeiroNomeStarWars + " " + sobrenomeStarWars;
		
		System.out.println(nomeStarWars);
		
	}

	public static void main(String[] args) {
		
		//George Lucas utiliza uma fórmula para criar os nomes dos personagens em suas
		//histórias (Jar Jar Binks, ObiWan Kenobi, etc).
		//A fórmula, supostamente, é:
		
		//Seu primeiro nome na série Star Wars:
		//i.Pegue as três primeiras letras de seu sobrenome
		//ii.Adicione a ele as duas primeiras letras de seu nome
		
		//Seu sobrenome na série Star Wars:
		//i.Pegue as três primeiras letras do sobrenome de solteira de sua mãe
		//ii.Adicione a ele as três primeiras letras do nome da cidade onde você nasceu
		
		//Crie um método chamado generateStarWarsName que gera um nome completo Star Wars
		//conforme descrito
		//Imprima o seu nome Star Wars
		
		//As entradas serão os nomes completos.
		//Para separar, por exemplo as três primeiras letras do seu sobrenome, use o atributo
		//.charAt() das Strings
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o seu nome: ");
		String nome = input.next();
		
		System.out.println("Insira o seu sobrenome: ");
		String sobrenome = input.next();
		
		System.out.println("Insira o sobrenome de solteira da sua mãe: ");
		String sobrenomeMae = input.next();
		
		System.out.println("Insira o nome da cidade onde você nasceu: ");
		String cidade = input.next();		
		
		generateStarWarsName(nome, sobrenome, sobrenomeMae, cidade);

	}

}
