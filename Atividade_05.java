package exerciciosIntrodutorios_01;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade_05 {

	public static void main(String[] args) {
		
		//Leia dois valores decimais(double) e calcule a média ponderada sabendo que a 
		//nota A tem peso 3.5 e nota B 6.5
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira a primeira nota: ");
		double nota1 = input.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		double nota2 = input.nextDouble();
		
		double ponderada = ((nota1 * 3.5) + (nota2 * 6.5)) / 10;
		
		System.out.println("A média é: " + df.format(ponderada));
		
		
		
		
	}

}
