package exerciciosEstruturasDeSelecao_02;
import java.util.Scanner;

public class Atividade_07 {

	public static void main(String[] args) {
		
		//Dadas as cordenadas (X e Y) de um Ponto, você deve informar em qual
		//quadrante ele está localizado no plano cartesiano
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma coordenada X do plano cartesiano: ");
		double x = input.nextDouble();
		
		System.out.println("Digite uma coordenada Y do plano carteasiano: ");
		double y = input.nextDouble();
		
		if (x < 0 && y > 0 ) {
			System.out.println("Sua coordenada está no 2º Quadrante");
		} else if (x > 0 && y > 0) {
			System.out.println("Sua coordenada está no 1º Quadrante");
		} else if (x < 0 && y < 0) {
			System.out.println("Sua coordenada está no 3º Quadrante");
		} else if (x > 0 && y < 0) {
			System.out.println("Sua coordenada está no 4º Quadrante");
		} else {
			System.out.println("Coordenada inválida");
		}

	}

}
