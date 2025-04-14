package exerciciosMatrizes_05;

import java.text.DecimalFormat;

public class Atividade_04 {

	public static void main(String[] args) {
		
		//Considere essa matriz:
		//int[][] matriz = {
		//{2104, 3, 399900}, 0
		//{1600, 3, 329900}, 1
		//{2400, 3, 369000}, 2
		//{1416, 2, 232000}, 3
		//{3000, 4, 539900}, 4
		//{1985, 4, 299900}, 5
		//{1534, 3, 314900}, 6
		//{1427, 3, 199000}, 7
		//{1380, 3, 212000}, 8
		//{1494, 3, 242500}, 9 
		//{1940, 4, 240000}, 10
		//{2000, 3, 347000}, 11
		//{1890, 3, 330000}, 12
		//{4478, 5, 699900}, 13
		//{1268, 3, 259900}  14
		//};
		//A primeira coluna é o tamanho da casa
		//A segunda coluna é a quantidade de quartos
		//A terceita coluna é o preço
		//Determinar:
		//a)Qual é a média dos preços das casas?
		//b)Quanto custa a menor casa?
		//c)Quantoso quartos tem a casa mais cara?
		//d)Qual a diferença de tamanho da casa com o mais número de quartos para a casa com o
		//menor número de quartos?
		//e)Qual a média do tamanho das casas que custam mais de 300.000 mil?
		
		DecimalFormat df = new DecimalFormat("00.00");
		
		double mediaValorCasa = 0;
		double somaValorCasa = 0;
		double mediaTamCasa = 0 ;
		double somaTamCasa = 0;
		int menorCasa = Integer.MAX_VALUE;
		int valorMenorCasa = 0;
		int maiorCasa = Integer.MIN_VALUE;
		int casaCara = 0;
		int quartosCasaCara = 0;
		int quartosMais = Integer.MIN_VALUE;
		int quartosMaisTam = 0;
		int quartosMenos = Integer.MAX_VALUE;
		int quartosMenosTam = 0;
		int cont = 0;
		
		
		int matriz [][] = new int [15][3];
		matriz[0][0] = 2104;
		matriz[0][1] = 3;
		matriz[0][2] = 399900;
		matriz[1][0] = 1600;
		matriz[1][1] = 3;
		matriz[1][2] = 329900;
		matriz[2][0] = 2400;
		matriz[2][1] = 3;
		matriz[2][2] = 369000;
		matriz[3][0] = 1416;
		matriz[3][1] = 2;
		matriz[3][2] = 232000;
		matriz[4][0] = 3000;
		matriz[4][1] = 4;
		matriz[4][2] = 539900;
		matriz[5][0] = 1985;
		matriz[5][1] = 4;
		matriz[5][2] = 299900;
		matriz[6][0] = 1534;
		matriz[6][1] = 3;
		matriz[6][2] = 314900;
		matriz[7][0] = 1427;
		matriz[7][1] = 3;
		matriz[7][2] = 199000;
		matriz[8][0] = 1380;
		matriz[8][1] = 3;
		matriz[8][2] = 212000;
		matriz[9][0] = 1494;
		matriz[9][1] = 3;
		matriz[9][2] = 242500;
		matriz[10][0] = 1940;
		matriz[10][1] = 4;
		matriz[10][2] = 240000;
		matriz[11][0] = 2000;
		matriz[11][1] = 3;
		matriz[11][2] = 347000;
		matriz[12][0] = 1890;
		matriz[12][1] = 3;
		matriz[12][2] = 330000;
		matriz[13][0] = 4478;
		matriz[13][1] = 5;
		matriz[13][2] = 699900;
		matriz[14][0] = 1268;
		matriz[14][1] = 3;
		matriz[14][2] = 259900;
		
		for(int i = 0; i < matriz.length; i++) {	
			
				somaValorCasa += matriz[i][2];
				
				if(matriz[i][2] == mediaValorCasa) {
	
				}
				if(matriz[i][0] < menorCasa) {
					menorCasa = matriz[i][0];
					valorMenorCasa = matriz[i][2];
					
				}
				if(matriz[i][2] > casaCara ) {
					casaCara = matriz[i][2];
					quartosCasaCara = matriz[i][1];
				}
				if(matriz[i][0] > quartosMais) {
					quartosMais = matriz[i][1];
					quartosMaisTam = matriz[i][0];
					
				}
				if(matriz[i][0] < quartosMenos) {
					quartosMenos = matriz[i][1];
					quartosMenosTam = matriz[i][0];
					
				}
				if(matriz[i][2] > 300000) {
					somaTamCasa += matriz [i][0];
					cont++;
						
			}
		}
		mediaTamCasa= somaTamCasa / cont;
		mediaValorCasa = somaValorCasa / matriz.length;
		System.out.println("A média dos preços das casas é: " + "R$"+ df.format(mediaValorCasa));
		System.out.println("A menor casa custa: " + "R$"+ df.format(valorMenorCasa));
		System.out.println("A casa mais cara tem " + quartosCasaCara + " " + "quartos." );
		System.out.println("A diferença do tamanho da casa com o maior número de quartos para a casa "
				+ "com o menor número de quartos é: " + quartosMenos);
		System.out.println("A média do tamanho das casas que custam mais de 300.000 mil é: " + mediaTamCasa + "m²");
		

	}

}
