package exerciciosEstruturasDeSelecao_02;

import java.util.Scanner;

public class Atividade_17 {

	public static void main(String[] args) {
		
		//Leia uma data(dia, mês e ano) e determine se ela é válida.
		//Lembre dos anos bissextos!
		//Faça com que o programa informe que a data é inválida assim que o outro usuário infromar um valor
		//inexistente.
		//Por exemplo, assim que o usuário informar o dia 50 o programa já deve parar e não deve 
		//receber o mês e o ano.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o dia");
		int dia = input.nextInt();
		
		if(dia >= 1 || dia <= 31 ) {
			System.out.println("Insira o mês");
			int mes = input.nextInt();
			if(mes >= 1 && mes <= 12) {
				if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 31 || (mes == 2 && dia >= 30)) {
					System.out.println("Dia inválido");
				} else {
					System.out.println("Insira o ano");
					int ano = input.nextInt();
					if(( ano % 4 != 0 || ano % 100 == 0 && ano % 400 != 0) && mes == 2 && dia == 29) {
						System.out.println("Dia inválido");
					} else {
						System.out.println(dia + "/" + mes + "/" + ano);
					}
				}
			} else {
				System.out.println("Mês inválido");
			}	
		} else {
			System.out.println("Dia inválido");
		}
		
	}

}
