package exerciciosIntrodutorios_01;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade_07 {

	public static void main(String[] args) {
		
		//Uma pessoa foi até uma casa de câmbio trocar dólares por reais
		//Para isto ela entregou um valor em dólares para o atendente
		//Calcule quantos reais o atendente deve devolver para a pessoa
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira um valor em dólares US$: ");
		double dolar = input.nextDouble();
		
		double cambio = 5.81;
		
		double real = dolar * cambio;
		
		System.out.println("O valor da conversão do dólar em real é: " + df.format(real) + "US$");
		
		

	}

}
