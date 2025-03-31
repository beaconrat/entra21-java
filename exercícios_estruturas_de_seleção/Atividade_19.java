package exerciciosEstruturasDeSelecao_02;

import java.util.Scanner;

public class Atividade_19 {

	public static void main(String[] args) {
		
		//A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar
		//mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo
		//de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês,
		//o valor por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso
		//tenham sido trabalhadas (considere que o mês possua 4 semanas exatas)
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o número de horas trabalhadas em um mês");
		double horas = input.nextDouble();
		
		System.out.println("Insira o valor por hora");
		double valor = input.nextDouble();
		
		double salario;
		double salarioTotal = horas * valor;
		double horasSemanais = horas / 4;
		
		if(horasSemanais <= 40) {
			System.out.println("O funcionário não fez hora extra. O salário sem acréscimo ficou:" + " " + salarioTotal);
		} else if(horasSemanais > 40) {
			double horasExtras = horasSemanais - 40;
			double calculoHorasExtras = horasExtras * valor * 1.5;
			salario = (valor * horas) + calculoHorasExtras;
			System.out.println("O funcinário fez hora extra. O salário com o acréscimo ficou:" + " " + salario);
		}
		
	}

}
