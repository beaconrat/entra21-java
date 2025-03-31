package exerciciosEstruturasDeSelecao_02;
import java.util.Scanner;

public class Atividade_11 {

	public static void main(String[] args) {
		
		//Escreva um algoritmo em quye o usuário entra com um número.
		//Depois ele escolhe a operação que vai ser feita com esse número
		//Caso ele escolha a operação 1:
		//Modifique a variável do número entrado e some 10 ao número original
		//Caso ele escolha a operação 2:
		//Modifique a variável do número entrado e subtraia 10 do número original
		//Caso ele escolha a operação 3: 
		//Modifique a variável do número entrado e multiplique 10 ao número original
		//Caso ele escolha a operação 4:
		//Modifique a variável do número entrado e divida 10 do número orginal
		
		Scanner input = new Scanner(System.in);
		
		double resultado;
		
		System.out.println("Digite um número: ");
		double numero = input.nextInt();
		
		System.out.println("Escolha a operação que deseja realizar:");
		System.out.println("1-Somatória");
		System.out.println("2-Subtração");
		System.out.println("3-Multiplicação");
		System.out.println("4-Divisão");
		int operador = input.nextInt();
		
		if(operador == 1 ) {
			resultado = numero + 10;
			System.out.println("A somatória é: " + resultado);
		} else if(operador == 2) {
			resultado = numero - 10;
			System.out.println("A subtração é: " + resultado);
		} else if(operador == 3) {
			resultado = numero * 10;
			System.out.println("A multiplicação é: " + resultado);
		} else if(operador == 4) {
			resultado = numero / 10;
			System.out.println("A divisão é: " + resultado);
		}
		

	}

}
