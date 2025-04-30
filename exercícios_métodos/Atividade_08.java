package exerciciosMetodos_06;

import java.util.Scanner;

public class Atividade_08 {
	
	public static String imprimirVerao () {
		
		return ("É verão e o clima está quente.");
	}
	
	public static String imprimirInverno() {
		
		return ("É inverno e o clima está frio.");
		
	}
	
	public static String imprimirOutono() {
		
		return ("É outono e as folhas estão caindo das árvores.");

	}
	
	public static String imprimirPrimavera() {
		
		return ("É primavera e as flores estão desabrochando.");

	}

	public static void main(String[] args) {
		
		//Faça um programa em que o usuário entre com um número de 1 a 4
		//Com o número 1 sendo verão, 2 sendo outono...
		//Dependendo de o que o usuário informa, retorne:
		//É verão
		//E o tempo está quente
		//Ou
		//É inverno
		//E está frio
		//Faça um método para cada estação do ano
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escolha uma estação do ano: ");
		System.out.println("1- Verão");
		System.out.println("2- Inverno");
		System.out.println("3- Outono");
		System.out.println("4- Primavera");
		int estacao = input.nextInt();
		
		if(estacao == 1) {
			 System.out.println(imprimirVerao());  
		} else if(estacao == 2) {
			 System.out.println(imprimirInverno());
		} else if(estacao == 3) {
			 System.out.println(imprimirOutono());
		} else {
			 System.out.println(imprimirPrimavera());
			
		}
		
	}

}
