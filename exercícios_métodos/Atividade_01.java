package exerciciosMetodos_06;

import java.util.Scanner;

public class Atividade_01 {
	
	public static void imprimirVerao() {
		System.out.println("É verão e o clima está quente.");
	}
	
	public static void imprimirInverno() {
		System.out.println("É inverno e o clima está frio.");
	}
	
	public static void imprimirOutono() {
		System.out.println("É outono e as folhas estão caindo das árvores.");
	}
	
	public static void imprimirPrimavera() {
		System.out.println("É primavera e as flores estão desabrochando.");
	}

	public static void main(String[] args) {
		
		//Faça um programa em que o usuário entre com um número de 1 a 4
		//Com o número 1 sendo verão, 2 sendo outono...
		//Dependendo do o que o usuário informa, imprima:
		//É verão
		//E o tempo está quente
		//Ou
		//É inverno
		//E está frio
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um estação: ");
		System.out.println("1- Verão");
		System.out.println("2- Inverno");
		System.out.println("3- Outono");
		System.out.println("4- Primavera");
		int estacao = input.nextInt();
		
		if(estacao == 1) {
			imprimirVerao();
		} else if(estacao == 2) {
			imprimirInverno();
		} else if(estacao == 3) {
			imprimirOutono();
		} else {
			imprimirPrimavera();
			
		}
	}

}
