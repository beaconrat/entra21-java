package exerciciosIntrodutorios_01;
import java.util.Scanner;

public class Atividade_02 {

	public static void main(String[] args) {
		
		//Calcule a área de um círculo a partir do valor do raio
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Insira o valor do raio: ");
		 double raio = input.nextDouble();
		 
		 double areaCirculo = 3.14 * Math.pow(raio,2);
		 
		 System.out.println("A área do círculo é: " + areaCirculo);
		 

	}

}


