package exerciciosEstruturasDeSelecao_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade_15 {

	public static void main(String[] args) {
		
		//O índice de massa corporal (IMC) é uma medida internacional usada para calcular
		//se uma pessoa está no peso ideal. O IMC é determinado pela divisão da massa do indivíduo pelo
		//quadrado de sua altura, onde a massa está em quilogramas e a altura está em metros, de acordo com a fórmula:
		//IMC = Massa / Altura²
		//Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo com a seguinte tabela:
		//<18.5 Magreza
		//18.5-24.9 Saudável 
		//25.0-29.9 Sobrepeso
		//30.0-34.9 Obesidade Grau I
		//35.0-39.9 Obesidade Grau II (severa)
		//>40.0 Obesidade Grau III (morbida)
				
		Scanner input = new Scanner(System.in);
				
		System.out.println("Digite o seu peso em KG: ");
		double peso = input.nextDouble();
				
		System.out.println("Digite a sua altura em metros: ");
		double altura = input.nextDouble();
				
		double imc = peso / Math.pow(altura, 2);
				
				
		if(imc <= 18.5 ) {
			System.out.println("Grau Magreza:" + " " + imc + "KG");
		} else if(imc >= 18.5 && imc <= 24.9 ) {
			System.out.println("Grau Saudável:" + " " + imc + "KG");
		} else if(imc >= 25.0 && imc <= 29.9) {
			System.out.println("Grau Sobrepedo:" + " " + imc + "KG");
		} else if(imc >= 30.0 && imc <= 34.9) {
			System.out.println("Obesidade Grau I:" + " " + imc + "KG");
		} else if(imc >= 35.0 && imc <= 39.9) {
			System.out.println("Obesidade Grau II (severa):" + " " + imc + "KG");
		} else if(imc >= 40.0) {
			System.out.println("Obesidade Grau III (morbida:" + " " + imc + "KG");
		}
				

	}

}
