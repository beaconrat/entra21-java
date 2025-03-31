package exerciciosEstruturasDeSelecao_02;
import java.util.Scanner;

public class Atividade_12 {

	public static void main(String[] args) {
		
		//Faça um programa que funciona como conversor universal
		//Primeiro o usuário escolhe se ele quer converter: temperatura, peso, comprimento ou volume
		//Depois, ele escolhe qual a unidade do valor que ele deseja converter
		//Após isso, o usuário entra com o valor desejado
		//Depois ele escolhe para qual ele quer converter
		//Após isso, o usuário entra com o valor desejado
		//Depois, ele escolhe para qual ele quer converter
		//As opções de temperatura, são: celsius, fahrenheit e kelvin
		//As opções de peso são: quilos, libras e onças
		//As opções de comprimento são: metros, pés e polegadas
		//As opções de volume são: litros, líquido e onças líquidas
		
		Scanner input = new Scanner(System.in);
		
		double resultado;
		
		System.out.println("----Escolha o conversor----");
		System.out.println("1-Temperatura");
		System.out.println("2-Peso");
		System.out.println("3-Comprimento");
		System.out.println("4-Volume");
		int conversor = input.nextInt();
		
		System.out.println("Digite o valor que você deseja converter: ");
		double valor = input.nextDouble();
		
		//Temperatura
		if(conversor == 1) {
		System.out.println("Digite a unidade do valor que você deseja converter: ");
		System.out.println("1-Celsius");
		System.out.println("2-Fahrenheit");
		System.out.println("3-Kelvin");
		int unidadeTemperatura = input.nextInt();
		
		System.out.println("Digite para qual unidade deseja converter este valor: ");
		System.out.println("1-Celsius");
		System.out.println("2-Fahrenheit");
		System.out.println("3-Kelvin");
		int temperatura = input.nextInt();		
		
		if(unidadeTemperatura == 1 && temperatura == 2) {
			 resultado = (valor * 9/5) + 32;
			 System.out.println("A tempertaura convertida de Celsius para Fahrenheit é: " + resultado);
		} else if(unidadeTemperatura == 2 && temperatura == 1) {
			resultado = (valor - 32) * 5/9;
			System.out.println("A temperatura convertida de Fahrenheit para Celsius é: " + resultado);
		} else if(unidadeTemperatura == 1 && temperatura == 3) {
			resultado = valor + 273.15;
			System.out.println("A temperatura convertida de Celsius para Kelvin é: " + resultado);
		} else if(unidadeTemperatura == 3 && temperatura == 1) {
			resultado = valor - 273.15;
			System.out.println("A temperatura convertida de Kelvin para Celsius é: " + resultado);
		} else if(unidadeTemperatura == 2 && temperatura == 3) {
			resultado = (valor - 32) * 5/9 + 273.15;
			System.out.println("A temperatura convertida de Fahrenheit para Kelvin é: " + resultado);
		} else if(unidadeTemperatura == 3 && temperatura == 2) {
			resultado = (valor - 273.15) * 9/5 + 32;
			System.out.println("A temperatura convertida de Kelvin para Fahrenheit é: " + resultado);
		}
		}
		
		//Peso
		if(conversor == 2) {
			System.out.println("Digite a unidade do valor que você deseja converter: ");
			System.out.println("1-Quilos");
			System.out.println("2-Libras");
			System.out.println("3-Onças");
			int unidadePeso = input.nextInt();
			
			System.out.println("Digite para qual unidade deseja converter este valor: ");
			System.out.println("1-Quilos");
			System.out.println("2-Libras");
			System.out.println("3-Onças");
			int peso = input.nextInt();
			
		if(unidadePeso == 1 && peso == 2) {
			resultado = valor * 2.205;
			System.out.println("O peso convertido de Quilos para Libras é: " + resultado);
		} else if(unidadePeso == 2 && peso == 1) {
			resultado = valor / 2.205;
			System.out.println("O peso convertido de Libras para Quilos é: " + resultado);
		} else if(unidadePeso == 1 && peso == 3) {
			resultado = valor * 35.274;
			System.out.println("O peso convertido de Quilos para Onças é: " + resultado);
		} else if(unidadePeso == 3 && peso == 1) { 
			resultado = valor / 35.274;
			System.out.println("O peso convertido de Onças para Quilos é: " + resultado);
		} else if(unidadePeso == 2 && peso == 3 ) {
			resultado = valor * 16;
			System.out.println("O peso convertido de Libras para Onças é: " + resultado);
		} else if(unidadePeso == 3 && peso == 2) {
			resultado = valor / 16;
			System.out.println("O peso convertido de Onças para Libras é: " + resultado);
		}
		}
		
		//Comprimento
		if(conversor == 3) {
			System.out.println("Digite a unidade do valor que você deseja converter: ");
			System.out.println("1-Metros");
			System.out.println("2-Pés");
			System.out.println("3-Polegadas");
			int unidadeComprimento = input.nextInt();
			
			System.out.println("Digite para qual unidade deseja converter este valor: ");
			System.out.println("1-Metros");
			System.out.println("2-Pés");
			System.out.println("3-Polegadas");
			int comprimento = input.nextInt();
			
		if(unidadeComprimento == 1 && comprimento == 2) {
			resultado = valor * 3.281;
			System.out.println("O comprimento convertido de Metros para Pés é: " + resultado);
		} else if(unidadeComprimento == 2 && comprimento == 1) {
			resultado = valor / 3.281;
			System.out.println("O comprimento convertido de Pés para Metros é: " + resultado);
		} else if(unidadeComprimento == 1 && comprimento == 3) {
			resultado = valor * 39.37;
			System.out.println("O comprimento convertido de Metros para Polegadas é: " + resultado);
		} else if(unidadeComprimento == 3 && comprimento == 1) {
			resultado = valor / 39.37;
			System.out.println("O comprimento convertido de Polegadas para Metros é: " + resultado);
		} else if(unidadeComprimento == 2 && comprimento == 3) {
			resultado = valor * 12;
			System.out.println("O comprimento convertio de Pés para Polegadas é: " + resultado);
		} else if(unidadeComprimento == 3 && comprimento == 2) {
			resultado = valor / 12;
			System.out.println("O comprimento convertido de Polegadas para Pés é: " + resultado);
		}
		}
		
		//Volume
		if(conversor == 4) {
			System.out.println("Digite a unidade do valor que você deseja converter: ");
			System.out.println("1-Litros");
			System.out.println("2-Galão Líquido");
			System.out.println("3-Onças Líquidas");
			int unidadeVolume = input.nextInt();
			
			System.out.println("Digite para qual unidade deseja converter este valor: ");
			System.out.println("1-Litros");
			System.out.println("2-Galão Líquido");
			System.out.println("3-Onças Líquidas");
			int volume = input.nextInt();
		
		if(unidadeVolume == 1 && volume == 2) {
			resultado = valor / 3.785;
			System.out.println("O volume convertido de Litros para Galão Líquido é: " + resultado);
		} else if(unidadeVolume == 2 && volume == 1) {
			resultado = valor * 3.785;
			System.out.println("O volume convertido de Galão Líquido para Litros é: " + resultado);
		} else if(unidadeVolume == 1 && volume == 3) {
			resultado = valor *  33.814;
			System.out.println("O volume convertido de Litros para Onças Líquidas é: " + resultado);
		} else if(unidadeVolume == 3 && volume == 1) {
			resultado = valor / 33.814;
			System.out.println("O volume convertido de Onças Líquidas para Litros é: " + resultado);
		} else if(unidadeVolume == 2 && volume == 3 ) {
			resultado = valor * 128;
			System.out.println("O volume convertido de Galão Líquido para Onças Líquidas é: " + resultado);
		} else if(unidadeVolume == 3 && volume == 2) {
			resultado = valor / 128;
			System.out.println("O volume convertido de Onças Líquidas para Galão Líquido é: " + resultado);
		}
	
		}
			
	}

}
