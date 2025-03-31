package exerciciosEstruturasDeSelecao_02;
import java.util.Scanner;

public class Atividade_08 {

	public static void main(String[] args) {
		
		//Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, escreve uma 
		//mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS
		//Considere que eles são GÊMEOS se dois deles possuem a mesma idade 
		//e o outro diferente dos demais, e apenas irmãos se todas as idades forem diferentes 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a idade do primeiro irmão: ");
		int idade1 = input.nextInt();
		
		System.out.println("Informe a idade do segundo irmão: ");
		int idade2 = input.nextInt();
		
		System.out.println("Informe a idade do terceiro irmão: ");
		int idade3 = input.nextInt();
		
		if (idade1 == idade2 && idade3 == idade2 && idade3 == idade1) {
			System.out.println("Eles são Trigêmeos");
		} else if (idade1 == idade2 && idade3 != idade1) {
			System.out.println("O primeiro e o segundo irmão são Gêmeos");
		} else if (idade3 == idade1 && idade2 != idade1 ) {
			System.out.println("O primeiro e o terceiro irmão são Gêmeos");
		} else if (idade2 == idade3 && idade1 != idade2) {
			System.out.println("O segundo e o terceiro irmão são Gêmeos");
		} else if (idade1 != idade2 && idade3 != idade1 && idade2 != idade3) {
			System.out.println("Eles são apenas Irmãos");
		} else {
			System.out.println("Idade inválida");
		}


	}

}
