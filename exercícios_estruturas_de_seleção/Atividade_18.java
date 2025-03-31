package exerciciosEstruturasDeSelecao_02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade_18 {

	public static void main(String[] args) {
		
		//Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu
		//salário. A empresa irá concedere 5% de reajuste para o funcionário que for admitido há menos 
		//de 12 meses. Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. 
		//O seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido
		
		Scanner input = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.00");
		
		System.out.println("Insira o salário do funcionário");
		double salario = input.nextDouble();
		
		System.out.println("Insira a quantidade de meses que o funcionário foi admitido");
		double mes = input.nextDouble();
		
		double reajuste;
		
		if(mes <= 12 ) {
			reajuste = salario + (5.0 / 100.0) * salario;
			System.out.println("O reajuste salário foi de 5%: " + "R$" + dc.format(reajuste));
		} else if(mes >= 13 || mes <= 48) {
			reajuste = salario + (7.0 / 100.0) * salario;
			System.out.println("O reajuste salárial foi de 7%: " + "R$" + dc.format(reajuste));
		}
		
		

	}

}
