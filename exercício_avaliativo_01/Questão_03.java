package atividadeAvaliativa_01;

import java.util.Scanner;

public class Questão_03 {

	public static void main(String[] args) {
		
		//Crie um programa Java para encontrar a primeira sequência de números seguidos em um
		//vetor.
		//Por exemplo, o vetor {6, 0, 1, 2, 1, 2, 3, 4, 5, 1, 6} tem a primeira sequência sendo {0, 1, 2}.
		//Exiba essa sequência.
		//Peça para o usuário inserir os valores em um vetor de 8 posições.
		
		Scanner input = new Scanner(System.in);
		
		//Índice que vai mostrar onde que a sequência começa
		int indiceComeco = -1;
		int tamanhoSequencia = 0;
		
		//Boolean com valor semântico para saber se a sequência foi encontrada
		boolean encontrouSequencia = false;
		
		int vetor[] = {6, 0, 1, 2, 1, 2, 3, 4, 5, 1, 6};
			
		//For que não checa até o último índice por isso checaremos isso no if
		for(int i = 0; i < vetor.length -1; i++) {
			if(vetor[i] + 1 == vetor[i + 1]) {
				encontrouSequencia = true;
				
				//Caso esse índice seja o primeiro que está em uma sequência 
				if(indiceComeco == -1) {
					indiceComeco = i;
				}
				tamanhoSequencia++;
			} else if(encontrouSequencia) {
				
				//Vai entrar quando a sequencia termiinar
				break;
			}
			
		}
		
		if(encontrouSequencia) {
			for(int i= indiceComeco; i < indiceComeco + tamanhoSequencia + 1; i++) {
				//Percorre a sequência encontrada + 1, pois o último valor da sequência não é salvo
				System.out.print(vetor[i] + ",");
			}
		} else {
			System.out.println("Nenhuma sequência");
		}
		
	}

}

    
        
 
