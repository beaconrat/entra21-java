package exerciciosEstruturasDeSelecao_02;
import java.util.Scanner;

public class Atividade_10 {

	public static void main(String[] args) {
		
		//Faça uma calculadora
		//O usuário entra com dois números e depois com a operação desejada
		//Casa o número da operação seja 1: some os dois números
		//Caso seja 2: subtraia os dois números
		//Caso seja 3: multiplique os dois números
		//Caso seja 4: divida os dois números
		
		Scanner input = new Scanner(System.in);
		
		double resultado;
		
		System.out.println("Digite o primeiro número");
		double numero1 = input.nextDouble();
		
		System.out.println("Digite o segundo número");
		double numero2 = input.nextDouble();
		
		System.out.println("Escolha a operação que deseja realizar:");
		System.out.println("1-Somatória");
		System.out.println("2-Subtração");
		System.out.println("3-Multiplicação");
		System.out.println("4-Divisão");
		int operador = input.nextInt();
		
		if(operador == 1) {
			resultado = numero1 + numero2;
			System.out.println("A soma é: " + resultado);
		} else if(operador == 2) {
			resultado = numero1 - numero2;
			System.out.println("A subtração é: " + resultado);
		} else if(operador == 3) {
			resultado = numero1 * numero2;
			System.out.println("A multiplicação é: " + resultado);
		} else if(operador == 4) {
			resultado = numero1 / numero2;
			System.out.println("A divisão é:" + resultado);
		}
	
		
		
		

	}

}
